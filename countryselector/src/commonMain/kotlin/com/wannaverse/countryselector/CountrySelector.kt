package com.wannaverse.countryselector

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.painterResource

/**
 * Composable function that displays a country picker button with customizable content.
 *
 * This function shows a clickable row with user-defined content for the selected country (e.g., flag, dial code, country name).
 * When clicked, it opens a modal bottom sheet where users can select a country.
 *
 * The selected country is passed to the `onSelection` callback, and the content inside the picker can be customized
 * using the `pickerRowContent` composable lambda.
 *
 * @param country The currently selected [Country] to be displayed in the button.
 * @param onSelection Callback invoked when a country is selected from the bottom sheet.
 * Receives the selected [Country] as a parameter.
 * @param pickerRowContent A composable lambda that defines how each country should be displayed.
 * It is used both for displaying the selected country and for listing countries in the bottom sheet.
 * Defaults to showing the flag and international dialing code.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CountrySelector(
    country: Country,
    onSelection: (Country) -> Unit,
    pickerRowContent: @Composable (Country) -> Unit = { defaultCountry ->
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Image(
                painter = painterResource(resource = defaultCountry.flagImageResource),
                contentDescription = defaultCountry.countryName,
                modifier = Modifier
                    .size(24.dp)
                    .clip(CircleShape)
            )
            Text(defaultCountry.internationalDialCode)
        }
    },
    searchBarContent: @Composable (
        searchQuery: String,
        onQueryChange: (String) -> Unit,
        hasError: Boolean
    ) -> Unit = { searchQuery, onQueryChange, hasError ->
        TextField(
            value = searchQuery,
            onValueChange = onQueryChange,
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Search") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search countries"
                )
            },
            isError = hasError,
            placeholder = { Text("Enter country name or code") }
        )
    }
) {
    var showBottomSheet by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier.clickable { showBottomSheet = true },
        horizontalArrangement = Arrangement.spacedBy(2.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        pickerRowContent(country)

        Icon(
            imageVector = Icons.Default.KeyboardArrowDown,
            contentDescription = "Open country picker"
        )
    }

    val coroutineScope = rememberCoroutineScope()
    val sheetState = rememberModalBottomSheetState()
    val closeSheet: () -> Unit = {
        coroutineScope.launch { sheetState.hide() }
            .invokeOnCompletion { showBottomSheet = false }
    }

    if (showBottomSheet) ModalBottomSheet(
        onDismissRequest = closeSheet,
        sheetState = sheetState
    ) {
        CountryPicker(
            onSelection = {
                onSelection(it)
                closeSheet()
            },
            pickerRowContent = pickerRowContent,
            searchBarContent = searchBarContent
        )
    }
}
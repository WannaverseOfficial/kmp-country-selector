package com.wannacall.countrypicker

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
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
 * Composable function that displays an icon representing a country and opens a bottom sheet for selecting a country.
 *
 * This function shows a clickable row with the country's flag, international dialing code, and a down arrow icon.
 * When clicked, a modal bottom sheet is displayed where the user can select a country from a picker.
 * The selected country is passed to the `onSelection` callback.
 *
 * @param country The `Country` object representing the currently displayed country with its name, code, and flag.
 * @param onSelection A function that will be invoked when a country is selected from the bottom sheet.
 *                    The selected `Country` object is passed to this function.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CountryPickerIcon(
    country: Country,
    onSelection: (Country) -> Unit
) {
    var showBottomSheet by remember { mutableStateOf(false) }
    Row(
        modifier = Modifier.clickable { showBottomSheet = true },
        horizontalArrangement = Arrangement.spacedBy(2.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            painter = painterResource(country.flagImageResource),
            contentDescription = country.countryName,
            modifier = Modifier.clip(CircleShape)
        )

        Text(country.internationalDialCode)

        Icon(
            imageVector = Icons.Default.KeyboardArrowDown,
            contentDescription = "Open country picker"
        )
    }

    val coroutineScope = rememberCoroutineScope()
    val sheetState = rememberModalBottomSheetState()
    val closeSheet: () -> Unit = {
        coroutineScope
            .launch { sheetState.hide() }
            .invokeOnCompletion { showBottomSheet = false }
    }
    if (showBottomSheet) ModalBottomSheet(
        onDismissRequest = closeSheet,
        sheetState = sheetState
    ) {
        CountryPicker {
            onSelection(it)
            closeSheet()
        }
    }
}
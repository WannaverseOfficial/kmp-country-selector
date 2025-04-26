package com.wannacall.countrypicker

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.wannacall.countrypicker.viewmodel.CountryPickerViewModel
import org.jetbrains.compose.resources.painterResource

/**
 * Composable function that displays a list of countries with a search bar, allowing the user to search
 * and select a country.
 *
 * This function displays a search bar at the top, where users can type a country name or country code.
 * It will filter the countries based on the search query and display the filtered list in a scrollable
 * list below. If no countries match the query, a message will be displayed indicating that no results
 * were found. When a user selects a country from the list, the `onSelection` callback is invoked with the
 * selected country.
 *
 * @param viewModel The `CountryPickerViewModel` responsible for managing the search query and filtered country list.
 *                  If not provided, a default instance will be used.
 * @param onSelection A function that is called when a country is selected from the list. The selected
 *                    `Country` object is passed to this function.
 */
@Composable
internal fun CountryPicker(
    viewModel: CountryPickerViewModel = viewModel { CountryPickerViewModel() },
    onSelection: (Country) -> Unit
) = Column(Modifier.padding(12.dp).fillMaxWidth()) {
    TextField(
        value = viewModel.searchQuery,
        onValueChange = viewModel::onSearchQueryChange,
        modifier = Modifier.fillMaxWidth(),
        label = { Text("Search") },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search countries"
            )
        },
        isError = viewModel.countries.isEmpty(),
        placeholder = { Text("Enter country name or code") }
    )

    if (viewModel.countries.isEmpty()) Text(
        text = "No countries found",
        modifier = Modifier.align(Alignment.CenterHorizontally)
    )

    Spacer(Modifier.height(8.dp))

    LazyColumn(verticalArrangement = Arrangement.spacedBy(2.dp)) {
        items(viewModel.countries) { country ->
            Row(
                modifier = Modifier
                    .height(60.dp)
                    .fillMaxWidth()
                    .clickable { onSelection(country) },
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(.8f)
                        .padding(4.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(country.flagImageResource),
                        contentDescription = country.countryName,
                        modifier = Modifier.padding(4.dp).clip(CircleShape)
                    )

                    Text(country.countryName)
                }

                Text(country.internationalDialCode)
            }
        }
    }
}

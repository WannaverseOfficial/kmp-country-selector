package com.wannaverse.countryselector

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
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.wannaverse.countryselector.viewmodel.CountryPickerViewModel

/**
 * Composable function that displays a searchable list of countries and allows the user to select one.
 *
 * This function displays a search bar at the top where users can type a country name or dial code.
 * It filters the available countries based on the search query and displays the results in a scrollable list.
 * If no countries match the query, a "No countries found" message is shown.
 *
 * Each country in the list is rendered using the provided [pickerRowContent] composable.
 * When a user selects a country, the [onSelection] callback is invoked with the selected [Country].
 * The search bar is customizable through the [searchBarContent] parameter, allowing full flexibility
 * for how the search bar should look and behave (e.g., using different field types, icons, or handling error states).
 *
 * @param viewModel The [CountryPickerViewModel] that manages the search query and filtered country list.
 *                  If not provided, a default instance will be created.
 * @param onSelection Callback function called when a country is selected from the list.
 * Receives the selected [Country] as a parameter.
 * @param pickerRowContent A composable lambda that defines the layout for each country item in the list.
 * Allows full customization of how countries are displayed (e.g., showing flag, name, dial code).
 * @param searchBarContent A composable lambda that defines how the search bar should appear and behave.
 * It takes in the current search query, a function to update the query, and a flag indicating whether there are no results.
 * The default implementation shows a standard [TextField] with a search icon.
 */
@Composable
internal fun CountryPicker(
    viewModel: CountryPickerViewModel = viewModel { CountryPickerViewModel() },
    onSelection: (Country) -> Unit,
    pickerRowContent: @Composable (Country) -> Unit,
    searchBarContent: @Composable (String, (String) -> Unit, Boolean) -> Unit)
{
    Column(Modifier.padding(12.dp).fillMaxWidth()) {
        searchBarContent(
            viewModel.searchQuery,
            viewModel::onSearchQueryChange,
            viewModel.countries.isEmpty()
        )

        if (viewModel.countries.isEmpty()) {
            Text(
                text = "No countries found",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }

        Spacer(Modifier.height(8.dp))

        LazyColumn(verticalArrangement = Arrangement.spacedBy(2.dp)) {
            items(viewModel.countries) { country ->
                Row(
                    modifier = Modifier
                        .height(60.dp)
                        .fillMaxWidth()
                        .clickable { onSelection(country) },
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    pickerRowContent(country)
                }
            }
        }
    }
}

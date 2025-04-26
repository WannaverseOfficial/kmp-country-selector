package com.wannacall.countrypicker.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.wannacall.countrypicker.Countries

/**
 * ViewModel for managing the state of the country picker.
 *
 * This ViewModel handles the state of the country picker UI, including managing the search query
 * and filtering the list of countries based on the query. It provides functionality for updating
 * the search query and filtering the countries by name, country code, or international dial code.
 */
class CountryPickerViewModel : ViewModel() {
    /**
     * The current search query entered by the user.
     *
     * This value is used to filter the list of countries displayed to the user. When the user changes
     * the search query, the list of countries will be filtered accordingly.
     */
    var searchQuery by mutableStateOf("")
        private set

    /**
     * The list of countries to be displayed.
     *
     * This list is either the full list of countries or a filtered list based on the current search query.
     * Initially, it contains all countries (`Countries.ALL_COUNTRIES`).
     */
    var countries by mutableStateOf(Countries.ALL_COUNTRIES)
        private set

    /**
     * Updates the search query and filters the list of countries based on the query.
     *
     * This method is called when the user changes the search query. It updates the `searchQuery` property
     * and triggers a filtering process for the list of countries. If the search query is empty, it restores
     * the full list of countries.
     *
     * @param text The new search query entered by the user.
     */
    fun onSearchQueryChange(text: String) {
        searchQuery = text
        countries = Countries.ALL_COUNTRIES.filter {
            it.countryName.contains(searchQuery, ignoreCase = true) ||
                    it.countryCode.contains(searchQuery, ignoreCase = true) ||
                    it.internationalDialCode.contains(searchQuery, ignoreCase = true)
        }
    }
}

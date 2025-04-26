package com.wannacall.countrypicker

import com.wannacall.countrypicker.native.getLocaleLanguageTag
import org.jetbrains.compose.resources.DrawableResource

/**
 * Data class representing a country in the country picker.
 *
 * This class encapsulates the details of a country, including the country name, country code,
 * international dial code, and a reference to the flag image resource.
 *
 * @property countryName The name of the country (e.g., "United States", "India").
 * @property countryCode The official country code (e.g., "US", "IN").
 * @property internationalDialCode The international dialing code for the country (e.g., "+1", "+91").
 * @property flagImageResource The resource reference for the country's flag image.
 */
data class Country(
    /**
     * The name of the country.
     *
     * This value represents the common name of the country (e.g., "United States", "India").
     */
    val countryName: String,

    /**
     * The country code, which is a short string representing the country (e.g., "US", "IN").
     *
     * This is the ISO 3166-1 alpha-2 country code.
     */
    val countryCode: String,

    /**
     * The international dial code for the country.
     *
     * This code is used for dialing to the country from another country and is typically prefixed with a "+" (e.g., "+1", "+91").
     */
    val internationalDialCode: String,

    /**
     * The drawable resource representing the country's flag image.
     *
     * This image is typically used in the UI to visually represent the country.
     */
    val flagImageResource: DrawableResource
) {

    /**
     * Retrieves the localized country name based on the provided locale language tag.
     *
     * This function uses the `localeLanguageTag` to fetch the translated country name in the desired language.
     * If no locale is provided, it defaults to the current system locale.
     *
     * @param country The `Country` object for which the localized name is to be fetched.
     *                The `countryCode` property of this object is used to determine the country.
     * @param localeLanguageTag The language tag representing the desired language/region (e.g., "en-US", "fr-FR").
     *                          If not provided, the current system locale will be used by default.
     * @return The localized country name as a `String` based on the provided language tag. If localization fails,
     *         it falls back to the country code itself.
     *
     * Example: Get the country name in German
     * val countryGermany = Countries.DE
     * val localizedNameGerman = countryGermany.getLocalizedCountryName(countryGermany, "de-DE")
     * println(localizedNameGerman)  // Outputs: "Deutschland" (since "Germany" is "Deutschland" in German)
     * ```
     */
    fun getLocalizedCountryName(
        country: Country,
        localeLanguageTag: String = getLocaleLanguageTag()) : String
    {
        return com.wannacall.countrypicker.native.getLocalizedCountryName(country.countryCode, localeLanguageTag)
    }
}

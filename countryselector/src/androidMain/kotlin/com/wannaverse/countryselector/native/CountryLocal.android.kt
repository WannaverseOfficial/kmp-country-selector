package com.wannaverse.countryselector.native

import java.util.Locale

actual fun getLocalizedCountryName(countryCode: String, localeLanguageTag: String): String {
    NON_ISO_COUNTRY_NAMES[countryCode]?.let { return it }
    return try {
        val locale = Locale.forLanguageTag(localeLanguageTag)
        val countryLocale = Locale("", countryCode)
        countryLocale.getDisplayCountry(locale).ifEmpty { countryCode }
    } catch (e: Exception) {
        countryCode
    }
}

actual fun getLocaleLanguageTag(): String {
    return Locale.getDefault().toLanguageTag()
}
package com.wannaverse.countryselector.native

import java.util.IllformedLocaleException
import java.util.Locale

actual fun getLocalizedCountryName(countryCode: String, localeLanguageTag: String): String {
    return try {
        val displayCountry = Locale.Builder()
            .setLanguageTag(localeLanguageTag)
            .setRegion(countryCode)
            .build()
            .displayCountry
        displayCountry.ifEmpty { countryCode }
    } catch (e: IllformedLocaleException) {
        countryCode
    }
}

actual fun getLocaleLanguageTag(): String {
    return Locale.getDefault().toLanguageTag()
}
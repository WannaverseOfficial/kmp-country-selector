package com.wannacall.countrypicker.native

import java.util.Locale

actual fun getLocalizedCountryName(countryCode: String, localeLanguageTag: String): String {
    return Locale.Builder()
        .setLanguageTag(localeLanguageTag)
        .setRegion(countryCode)
        .build()
        .displayCountry
}

actual fun getLocaleLanguageTag(): String {
    return Locale.getDefault().toLanguageTag()
}
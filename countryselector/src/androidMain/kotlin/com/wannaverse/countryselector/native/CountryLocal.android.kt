package com.wannaverse.countryselector.native

import java.util.Locale

actual fun getLocalizedCountryName(countryCode: String, localeLanguageTag: String): String {
    val locale = Locale.forLanguageTag(localeLanguageTag)
    val countryLocale = Locale("", countryCode)
    return countryLocale.getDisplayCountry(locale)
}

actual fun getLocaleLanguageTag(): String {
    return Locale.getDefault().toLanguageTag()
}
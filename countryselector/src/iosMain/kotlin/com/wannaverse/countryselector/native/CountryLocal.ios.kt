package com.wannaverse.countryselector.native

import platform.Foundation.NSLocale
import platform.Foundation.NSLocaleCountryCode
import platform.Foundation.currentLocale
import platform.Foundation.localeIdentifier

actual fun getLocalizedCountryName(countryCode: String, localeLanguageTag: String): String {
    val locale = NSLocale(localeIdentifier = localeLanguageTag)
    return locale.displayNameForKey(NSLocaleCountryCode, countryCode) ?: countryCode
}

actual fun getLocaleLanguageTag(): String {
    return NSLocale.currentLocale.localeIdentifier
}
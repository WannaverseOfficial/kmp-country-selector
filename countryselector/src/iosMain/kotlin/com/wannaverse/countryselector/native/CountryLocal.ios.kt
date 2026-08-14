package com.wannaverse.countryselector.native

import platform.Foundation.NSLocale
import platform.Foundation.NSLocaleCountryCode
import platform.Foundation.currentLocale
import platform.Foundation.localeIdentifier

actual fun getLocalizedCountryName(countryCode: String, localeLanguageTag: String): String {
    NON_ISO_COUNTRY_NAMES[countryCode]?.let { return it }
    val locale = NSLocale(localeIdentifier = localeLanguageTag)
    val displayName = locale.displayNameForKey(NSLocaleCountryCode, countryCode)
    return if (displayName.isNullOrEmpty()) countryCode else displayName
}

actual fun getLocaleLanguageTag(): String {
    return NSLocale.currentLocale.localeIdentifier
}
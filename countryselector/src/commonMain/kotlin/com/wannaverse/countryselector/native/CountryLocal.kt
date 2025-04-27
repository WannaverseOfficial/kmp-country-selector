package com.wannaverse.countryselector.native

expect fun getLocaleLanguageTag(): String

expect fun getLocalizedCountryName(countryCode: String, localeLanguageTag: String = getLocaleLanguageTag()): String

package com.wannaverse.countryselector.native

expect fun getLocaleLanguageTag(): String

expect fun getLocalizedCountryName(countryCode: String, localeLanguageTag: String = getLocaleLanguageTag()): String

/**
 * Display names for entries that are not standard ISO 3166-1 country codes.
 *
 * These codes cannot be resolved by the platform locale APIs (and on the JVM
 * `Locale.Builder().setRegion()` throws for them), so each platform's
 * [getLocalizedCountryName] resolves them here before delegating to the
 * locale lookup. Names are the same across languages since no localized
 * source exists for them.
 */
internal val NON_ISO_COUNTRY_NAMES: Map<String, String> = mapOf(
    "EAC" to "East African Community",
    "IC" to "Canary Islands",
)

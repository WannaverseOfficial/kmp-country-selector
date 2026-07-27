package com.wannaverse.countryselector

import com.wannaverse.countryselector.generated.resources.Res
import com.wannaverse.countryselector.generated.resources.*
import com.wannaverse.countryselector.native.getLocaleLanguageTag
import com.wannaverse.countryselector.native.getLocalizedCountryName

/**
 * The `Countries` object is a singleton that contains a collection of predefined `Country` objects.
 * Each `Country` object contains information about a specific country, including its name,
 * ISO country code, dialing code, and the associated flag drawable resource.
 *
 * The `Countries` object can be used to access country data by calling the properties corresponding
 * to each country, which are initialized as instances of the `Country` class.
 */
object Countries {
    /**
     * Defines the current language and region used for localizing country names.
     *
     * This value should be a valid IETF BCP 47 language tag (e.g., "en-US", "fr-FR", "zh-CN").
     *
     * - It is initialized using the device's default locale when the object is first created.
     * - It can be updated manually at runtime (e.g., `Countries.languageTag = "fr-FR"`)
     *   to change the localization dynamically.
     *
     * **Important:**
     * - Update `languageTag` *before* accessing any country data like `Countries.AD` or `Countries.ALL_COUNTRIES`
     *   to ensure names are correctly localized.
     * - Supported format is `language-country`, where:
     *   - `language` = ISO 639 language code (e.g., "en" for English, "fr" for French)
     *   - `country`  = ISO 3166 country code (e.g., "US" for United States, "FR" for France)
     */
    var languageTag: String = getLocaleLanguageTag()

    val AD : Country
        get() = Country(
            countryName = getLocalizedCountryName("AD", languageTag),
            countryCode = "AD",
            internationalDialCode = "+376",
            flagImageResource = Res.drawable.ad)

    val AE : Country
        get() = Country(
            countryName = getLocalizedCountryName("AE", languageTag),
            countryCode = "AE",
            internationalDialCode = "+971",
            flagImageResource = Res.drawable.ae)

    val AF : Country
        get() = Country(
            countryName = getLocalizedCountryName("AF", languageTag),
            countryCode = "AF",
            internationalDialCode = "+93",
            flagImageResource = Res.drawable.af)

    val AG : Country
        get() = Country(
            countryName = getLocalizedCountryName("AG", languageTag),
            countryCode = "AG",
            internationalDialCode = "+1",
            flagImageResource = Res.drawable.ag)

    val AI : Country
        get() = Country(
            countryName = getLocalizedCountryName("AI", languageTag),
            countryCode = "AI",
            internationalDialCode = "+1",
            flagImageResource = Res.drawable.ai)

    val AL : Country
        get() = Country(
            countryName = getLocalizedCountryName("AL", languageTag),
            countryCode = "AL",
            internationalDialCode = "+355",
            flagImageResource = Res.drawable.al)

    val AM : Country
        get() = Country(
            countryName = getLocalizedCountryName("AM", languageTag),
            countryCode = "AM",
            internationalDialCode = "+374",
            flagImageResource = Res.drawable.am)

    val AO : Country
        get() = Country(
            countryName = getLocalizedCountryName("AO", languageTag),
            countryCode = "AO",
            internationalDialCode = "+244",
            flagImageResource = Res.drawable.ao)

    val AQ : Country
        get() = Country(
            countryName = getLocalizedCountryName("AQ", languageTag),
            countryCode = "AQ",
            internationalDialCode = "+672",
            flagImageResource = Res.drawable.aq)

    val AR : Country
        get() = Country(
            countryName = getLocalizedCountryName("AR", languageTag),
            countryCode = "AR",
            internationalDialCode = "+54",
            flagImageResource = Res.drawable.ar)

    val AS : Country
        get() = Country(
            countryName = getLocalizedCountryName("AS", languageTag),
            countryCode = "AS",
            internationalDialCode = "+1",
            flagImageResource = Res.drawable.`as`)

    val AT : Country
        get() = Country(
            countryName = getLocalizedCountryName("AT", languageTag),
            countryCode = "AT",
            internationalDialCode = "+43",
            flagImageResource = Res.drawable.at)

    val AU : Country
        get() = Country(
            countryName = getLocalizedCountryName("AU", languageTag),
            countryCode = "AU",
            internationalDialCode = "+61",
            flagImageResource = Res.drawable.au)

    val AW : Country
        get() = Country(
            countryName = getLocalizedCountryName("AW", languageTag),
            countryCode = "AW",
            internationalDialCode = "+297",
            flagImageResource = Res.drawable.aw)

    val AX : Country
        get() = Country(
            countryName = getLocalizedCountryName("AX", languageTag),
            countryCode = "AX",
            internationalDialCode = "+358",
            flagImageResource = Res.drawable.ax)

    val AZ : Country
        get() = Country(
            countryName = getLocalizedCountryName("AZ", languageTag),
            countryCode = "AZ",
            internationalDialCode = "+994",
            flagImageResource = Res.drawable.az)

    val BA : Country
        get() = Country(
            countryName = getLocalizedCountryName("BA", languageTag),
            countryCode = "BA",
            internationalDialCode = "+387",
            flagImageResource = Res.drawable.ba)

    val BB : Country
        get() = Country(
            countryName = getLocalizedCountryName("BB", languageTag),
            countryCode = "BB",
            internationalDialCode = "+1",
            flagImageResource = Res.drawable.bb)

    val BD : Country
        get() = Country(
            countryName = getLocalizedCountryName("BD", languageTag),
            countryCode = "BD",
            internationalDialCode = "+880",
            flagImageResource = Res.drawable.bd)

    val BE : Country
        get() = Country(
            countryName = getLocalizedCountryName("BE", languageTag),
            countryCode = "BE",
            internationalDialCode = "+32",
            flagImageResource = Res.drawable.be)

    val BF : Country
        get() = Country(
            countryName = getLocalizedCountryName("BF", languageTag),
            countryCode = "BF",
            internationalDialCode = "+226",
            flagImageResource = Res.drawable.bf)

    val BG : Country
        get() = Country(
            countryName = getLocalizedCountryName("BG", languageTag),
            countryCode = "BG",
            internationalDialCode = "+359",
            flagImageResource = Res.drawable.bg)

    val BH : Country
        get() = Country(
            countryName = getLocalizedCountryName("BH", languageTag),
            countryCode = "BH",
            internationalDialCode = "+973",
            flagImageResource = Res.drawable.bh)

    val BI : Country
        get() = Country(
            countryName = getLocalizedCountryName("BI", languageTag),
            countryCode = "BI",
            internationalDialCode = "+257",
            flagImageResource = Res.drawable.bi)

    val BJ : Country
        get() = Country(
            countryName = getLocalizedCountryName("BJ", languageTag),
            countryCode = "BJ",
            internationalDialCode = "+229",
            flagImageResource = Res.drawable.bj)

    val BL : Country
        get() = Country(
            countryName = getLocalizedCountryName("BL", languageTag),
            countryCode = "BL",
            internationalDialCode = "+590",
            flagImageResource = Res.drawable.bl)

    val BM : Country
        get() = Country(
            countryName = getLocalizedCountryName("BM", languageTag),
            countryCode = "BM",
            internationalDialCode = "+1",
            flagImageResource = Res.drawable.bm)

    val BN : Country
        get() = Country(
            countryName = getLocalizedCountryName("BN", languageTag),
            countryCode = "BN",
            internationalDialCode = "+673",
            flagImageResource = Res.drawable.bn)

    val BO : Country
        get() = Country(
            countryName = getLocalizedCountryName("BO", languageTag),
            countryCode = "BO",
            internationalDialCode = "+591",
            flagImageResource = Res.drawable.bo)

    val BR : Country
        get() = Country(
            countryName = getLocalizedCountryName("BR", languageTag),
            countryCode = "BR",
            internationalDialCode = "+55",
            flagImageResource = Res.drawable.br)

    val BS : Country
        get() = Country(
            countryName = getLocalizedCountryName("BS", languageTag),
            countryCode = "BS",
            internationalDialCode = "+1",
            flagImageResource = Res.drawable.bs)

    val BT : Country
        get() = Country(
            countryName = getLocalizedCountryName("BT", languageTag),
            countryCode = "BT",
            internationalDialCode = "+975",
            flagImageResource = Res.drawable.bt)

    val BV : Country
        get() = Country(
            countryName = getLocalizedCountryName("BV", languageTag),
            countryCode = "BV",
            internationalDialCode = "+47",
            flagImageResource = Res.drawable.bv)

    val BW : Country
        get() = Country(
            countryName = getLocalizedCountryName("BW", languageTag),
            countryCode = "BW",
            internationalDialCode = "+267",
            flagImageResource = Res.drawable.bw)

    val BY : Country
        get() = Country(
            countryName = getLocalizedCountryName("BY", languageTag),
            countryCode = "BY",
            internationalDialCode = "+375",
            flagImageResource = Res.drawable.by)

    val BZ : Country
        get() = Country(
            countryName = getLocalizedCountryName("BZ", languageTag),
            countryCode = "BZ",
            internationalDialCode = "+501",
            flagImageResource = Res.drawable.bz)

    val CA : Country
        get() = Country(
            countryName = getLocalizedCountryName("CA", languageTag),
            countryCode = "CA",
            internationalDialCode = "+1",
            flagImageResource = Res.drawable.ca)

    val CC : Country
        get() = Country(
            countryName = getLocalizedCountryName("CC", languageTag),
            countryCode = "CC",
            internationalDialCode = "+61",
            flagImageResource = Res.drawable.cc)

    val CD : Country
        get() = Country(
            countryName = getLocalizedCountryName("CD", languageTag),
            countryCode = "CD",
            internationalDialCode = "+243",
            flagImageResource = Res.drawable.cd)

    val CF : Country
        get() = Country(
            countryName = getLocalizedCountryName("CF", languageTag),
            countryCode = "CF",
            internationalDialCode = "+236",
            flagImageResource = Res.drawable.cf)

    val CG : Country
        get() = Country(
            countryName = getLocalizedCountryName("CG", languageTag),
            countryCode = "CG",
            internationalDialCode = "+242",
            flagImageResource = Res.drawable.cg)

    val CH : Country
        get() = Country(
            countryName = getLocalizedCountryName("CH", languageTag),
            countryCode = "CH",
            internationalDialCode = "+41",
            flagImageResource = Res.drawable.ch)

    val CI : Country
        get() = Country(
            countryName = getLocalizedCountryName("CI", languageTag),
            countryCode = "CI",
            internationalDialCode = "+225",
            flagImageResource = Res.drawable.ci)

    val CK : Country
        get() = Country(
            countryName = getLocalizedCountryName("CK", languageTag),
            countryCode = "CK",
            internationalDialCode = "+682",
            flagImageResource = Res.drawable.ck)

    val CL : Country
        get() = Country(
            countryName = getLocalizedCountryName("CL", languageTag),
            countryCode = "CL",
            internationalDialCode = "+56",
            flagImageResource = Res.drawable.cl)

    val CM : Country
        get() = Country(
            countryName = getLocalizedCountryName("CM", languageTag),
            countryCode = "CM",
            internationalDialCode = "+237",
            flagImageResource = Res.drawable.cm)

    val CN : Country
        get() = Country(
            countryName = getLocalizedCountryName("CN", languageTag),
            countryCode = "CN",
            internationalDialCode = "+86",
            flagImageResource = Res.drawable.cn)

    val CO : Country
        get() = Country(
            countryName = getLocalizedCountryName("CO", languageTag),
            countryCode = "CO",
            internationalDialCode = "+57",
            flagImageResource = Res.drawable.co)

    val CR : Country
        get() = Country(
            countryName = getLocalizedCountryName("CR", languageTag),
            countryCode = "CR",
            internationalDialCode = "+506",
            flagImageResource = Res.drawable.cr)

    val CU : Country
        get() = Country(
            countryName = getLocalizedCountryName("CU", languageTag),
            countryCode = "CU",
            internationalDialCode = "+53",
            flagImageResource = Res.drawable.cu)

    val CV : Country
        get() = Country(
            countryName = getLocalizedCountryName("CV", languageTag),
            countryCode = "CV",
            internationalDialCode = "+238",
            flagImageResource = Res.drawable.cv)

    val CW : Country
        get() = Country(
            countryName = getLocalizedCountryName("CW", languageTag),
            countryCode = "CW",
            internationalDialCode = "+599",
            flagImageResource = Res.drawable.cw)

    val CX : Country
        get() = Country(
            countryName = getLocalizedCountryName("CX", languageTag),
            countryCode = "CX",
            internationalDialCode = "+61",
            flagImageResource = Res.drawable.cx)

    val CY : Country
        get() = Country(
            countryName = getLocalizedCountryName("CY", languageTag),
            countryCode = "CY",
            internationalDialCode = "+357",
            flagImageResource = Res.drawable.cy)

    val CZ : Country
        get() = Country(
            countryName = getLocalizedCountryName("CZ", languageTag),
            countryCode = "CZ",
            internationalDialCode = "+420",
            flagImageResource = Res.drawable.cz)

    val DE : Country
        get() = Country(
            countryName = getLocalizedCountryName("DE", languageTag),
            countryCode = "DE",
            internationalDialCode = "+49",
            flagImageResource = Res.drawable.de)

    val DJ : Country
        get() = Country(
            countryName = getLocalizedCountryName("DJ", languageTag),
            countryCode = "DJ",
            internationalDialCode = "+253",
            flagImageResource = Res.drawable.dj)

    val DK : Country
        get() = Country(
            countryName = getLocalizedCountryName("DK", languageTag),
            countryCode = "DK",
            internationalDialCode = "+45",
            flagImageResource = Res.drawable.dk)

    val DM : Country
        get() = Country(
            countryName = getLocalizedCountryName("DM", languageTag),
            countryCode = "DM",
            internationalDialCode = "+1",
            flagImageResource = Res.drawable.dm)

    val DZ : Country
        get() = Country(
            countryName = getLocalizedCountryName("DZ", languageTag),
            countryCode = "DZ",
            internationalDialCode = "+213",
            flagImageResource = Res.drawable.dz)

    val EAC : Country
        get() = Country(
            countryName = getLocalizedCountryName("EAC", languageTag),
            countryCode = "EAC",
            internationalDialCode = "+255",
            flagImageResource = Res.drawable.eac)

    val EC : Country
        get() = Country(
            countryName = getLocalizedCountryName("EC", languageTag),
            countryCode = "EC",
            internationalDialCode = "+593",
            flagImageResource = Res.drawable.ec)

    val EE : Country
        get() = Country(
            countryName = getLocalizedCountryName("EE", languageTag),
            countryCode = "EE",
            internationalDialCode = "+372",
            flagImageResource = Res.drawable.ee)

    val EG : Country
        get() = Country(
            countryName = getLocalizedCountryName("EG", languageTag),
            countryCode = "EG",
            internationalDialCode = "+20",
            flagImageResource = Res.drawable.eg)

    val EH : Country
        get() = Country(
            countryName = getLocalizedCountryName("EH", languageTag),
            countryCode = "EH",
            internationalDialCode = "+212",
            flagImageResource = Res.drawable.eh)

    val ER : Country
        get() = Country(
            countryName = getLocalizedCountryName("ER", languageTag),
            countryCode = "ER",
            internationalDialCode = "+291",
            flagImageResource = Res.drawable.er)

    val ES : Country
        get() = Country(
            countryName = getLocalizedCountryName("ES", languageTag),
            countryCode = "ES",
            internationalDialCode = "+34",
            flagImageResource = Res.drawable.es)

    val ET : Country
        get() = Country(
            countryName = getLocalizedCountryName("ET", languageTag),
            countryCode = "ET",
            internationalDialCode = "+251",
            flagImageResource = Res.drawable.et)

    val FI : Country
        get() = Country(
            countryName = getLocalizedCountryName("FI", languageTag),
            countryCode = "FI",
            internationalDialCode = "+358",
            flagImageResource = Res.drawable.fi)

    val FJ : Country
        get() = Country(
            countryName = getLocalizedCountryName("FJ", languageTag),
            countryCode = "FJ",
            internationalDialCode = "+679",
            flagImageResource = Res.drawable.fj)

    val FK : Country
        get() = Country(
            countryName = getLocalizedCountryName("FK", languageTag),
            countryCode = "FK",
            internationalDialCode = "+500",
            flagImageResource = Res.drawable.fk)

    val FM : Country
        get() = Country(
            countryName = getLocalizedCountryName("FM", languageTag),
            countryCode = "FM",
            internationalDialCode = "+691",
            flagImageResource = Res.drawable.fm)

    val FO : Country
        get() = Country(
            countryName = getLocalizedCountryName("FO", languageTag),
            countryCode = "FO",
            internationalDialCode = "+298",
            flagImageResource = Res.drawable.fo)

    val FR : Country
        get() = Country(
            countryName = getLocalizedCountryName("FR", languageTag),
            countryCode = "FR",
            internationalDialCode = "+33",
            flagImageResource = Res.drawable.fr)

    val GA : Country
        get() = Country(
            countryName = getLocalizedCountryName("GA", languageTag),
            countryCode = "GA",
            internationalDialCode = "+241",
            flagImageResource = Res.drawable.ga)

    val GB : Country
        get() = Country(
            countryName = getLocalizedCountryName("GB", languageTag),
            countryCode = "GB",
            internationalDialCode = "+44",
            flagImageResource = Res.drawable.gb)

    val GD : Country
        get() = Country(
            countryName = getLocalizedCountryName("GD", languageTag),
            countryCode = "GD",
            internationalDialCode = "+1",
            flagImageResource = Res.drawable.gd)

    val GE : Country
        get() = Country(
            countryName = getLocalizedCountryName("GE", languageTag),
            countryCode = "GE",
            internationalDialCode = "+995",
            flagImageResource = Res.drawable.ge)

    val GF : Country
        get() = Country(
            countryName = getLocalizedCountryName("GF", languageTag),
            countryCode = "GF",
            internationalDialCode = "+594",
            flagImageResource = Res.drawable.gf)

    val GG : Country
        get() = Country(
            countryName = getLocalizedCountryName("GG", languageTag),
            countryCode = "GG",
            internationalDialCode = "+44",
            flagImageResource = Res.drawable.gg)

    val GH : Country
        get() = Country(
            countryName = getLocalizedCountryName("GH", languageTag),
            countryCode = "GH",
            internationalDialCode = "+233",
            flagImageResource = Res.drawable.gh)

    val GI : Country
        get() = Country(
            countryName = getLocalizedCountryName("GI", languageTag),
            countryCode = "GI",
            internationalDialCode = "+350",
            flagImageResource = Res.drawable.gi)

    val GL : Country
        get() = Country(
            countryName = getLocalizedCountryName("GL", languageTag),
            countryCode = "GL",
            internationalDialCode = "+299",
            flagImageResource = Res.drawable.gl)

    val GM : Country
        get() = Country(
            countryName = getLocalizedCountryName("GM", languageTag),
            countryCode = "GM",
            internationalDialCode = "+220",
            flagImageResource = Res.drawable.gm)

    val GN : Country
        get() = Country(
            countryName = getLocalizedCountryName("GN", languageTag),
            countryCode = "GN",
            internationalDialCode = "+224",
            flagImageResource = Res.drawable.gn)

    val GP : Country
        get() = Country(
            countryName = getLocalizedCountryName("GP", languageTag),
            countryCode = "GP",
            internationalDialCode = "+590",
            flagImageResource = Res.drawable.gp)

    val GQ : Country
        get() = Country(
            countryName = getLocalizedCountryName("GQ", languageTag),
            countryCode = "GQ",
            internationalDialCode = "+240",
            flagImageResource = Res.drawable.gq)

    val GR : Country
        get() = Country(
            countryName = getLocalizedCountryName("GR", languageTag),
            countryCode = "GR",
            internationalDialCode = "+30",
            flagImageResource = Res.drawable.gr)

    val GS : Country
        get() = Country(
            countryName = getLocalizedCountryName("GS", languageTag),
            countryCode = "GS",
            internationalDialCode = "+500",
            flagImageResource = Res.drawable.gs)

    val GT : Country
        get() = Country(
            countryName = getLocalizedCountryName("GT", languageTag),
            countryCode = "GT",
            internationalDialCode = "+502",
            flagImageResource = Res.drawable.gt)

    val GU : Country
        get() = Country(
            countryName = getLocalizedCountryName("GU", languageTag),
            countryCode = "GU",
            internationalDialCode = "+1",
            flagImageResource = Res.drawable.gu)

    val GW : Country
        get() = Country(
            countryName = getLocalizedCountryName("GW", languageTag),
            countryCode = "GW",
            internationalDialCode = "+245",
            flagImageResource = Res.drawable.gw)

    val GY : Country
        get() = Country(
            countryName = getLocalizedCountryName("GY", languageTag),
            countryCode = "GY",
            internationalDialCode = "+592",
            flagImageResource = Res.drawable.gy)

    val HK : Country
        get() = Country(
            countryName = getLocalizedCountryName("HK", languageTag),
            countryCode = "HK",
            internationalDialCode = "+852",
            flagImageResource = Res.drawable.hk)

    val HM : Country
        get() = Country(
            countryName = getLocalizedCountryName("HM", languageTag),
            countryCode = "HM",
            internationalDialCode = "+672",
            flagImageResource = Res.drawable.hm)

    val HN : Country
        get() = Country(
            countryName = getLocalizedCountryName("HN", languageTag),
            countryCode = "HN",
            internationalDialCode = "+504",
            flagImageResource = Res.drawable.hn)

    val HR : Country
        get() = Country(
            countryName = getLocalizedCountryName("HR", languageTag),
            countryCode = "HR",
            internationalDialCode = "+385",
            flagImageResource = Res.drawable.hr)

    val HT : Country
        get() = Country(
            countryName = getLocalizedCountryName("HT", languageTag),
            countryCode = "HT",
            internationalDialCode = "+509",
            flagImageResource = Res.drawable.ht)

    val HU : Country
        get() = Country(
            countryName = getLocalizedCountryName("HU", languageTag),
            countryCode = "HU",
            internationalDialCode = "+36",
            flagImageResource = Res.drawable.hu)

    val IC : Country
        get() = Country(
            countryName = getLocalizedCountryName("IC", languageTag),
            countryCode = "IC",
            internationalDialCode = "+34",
            flagImageResource = Res.drawable.ic)

    val ID : Country
        get() = Country(
            countryName = getLocalizedCountryName("ID", languageTag),
            countryCode = "ID",
            internationalDialCode = "+62",
            flagImageResource = Res.drawable.id)

    val IE : Country
        get() = Country(
            countryName = getLocalizedCountryName("IE", languageTag),
            countryCode = "IE",
            internationalDialCode = "+353",
            flagImageResource = Res.drawable.ie)

    val IL : Country
        get() = Country(
            countryName = getLocalizedCountryName("IL", languageTag),
            countryCode = "IL",
            internationalDialCode = "+972",
            flagImageResource = Res.drawable.il)

    val IM : Country
        get() = Country(
            countryName = getLocalizedCountryName("IM", languageTag),
            countryCode = "IM",
            internationalDialCode = "+44",
            flagImageResource = Res.drawable.im)

    val IN : Country
        get() = Country(
            countryName = getLocalizedCountryName("IN", languageTag),
            countryCode = "IN",
            internationalDialCode = "+91",
            flagImageResource = Res.drawable.`in`)

    val IO : Country
        get() = Country(
            countryName = getLocalizedCountryName("IO", languageTag),
            countryCode = "IO",
            internationalDialCode = "+246",
            flagImageResource = Res.drawable.io)

    val IQ : Country
        get() = Country(
            countryName = getLocalizedCountryName("IQ", languageTag),
            countryCode = "IQ",
            internationalDialCode = "+964",
            flagImageResource = Res.drawable.iq)

    val IR : Country
        get() = Country(
            countryName = getLocalizedCountryName("IR", languageTag),
            countryCode = "IR",
            internationalDialCode = "+98",
            flagImageResource = Res.drawable.ir)

    val IS : Country
        get() = Country(
            countryName = getLocalizedCountryName("IS", languageTag),
            countryCode = "IS",
            internationalDialCode = "+354",
            flagImageResource = Res.drawable.`is`)

    val IT : Country
        get() = Country(
            countryName = getLocalizedCountryName("IT", languageTag),
            countryCode = "IT",
            internationalDialCode = "+39",
            flagImageResource = Res.drawable.it)

    val JE : Country
        get() = Country(
            countryName = getLocalizedCountryName("JE", languageTag),
            countryCode = "JE",
            internationalDialCode = "+44",
            flagImageResource = Res.drawable.je)

    val JM : Country
        get() = Country(
            countryName = getLocalizedCountryName("JM", languageTag),
            countryCode = "JM",
            internationalDialCode = "+1",
            flagImageResource = Res.drawable.jm)

    val JO : Country
        get() = Country(
            countryName = getLocalizedCountryName("JO", languageTag),
            countryCode = "JO",
            internationalDialCode = "+962",
            flagImageResource = Res.drawable.jo)

    val JP : Country
        get() = Country(
            countryName = getLocalizedCountryName("JP", languageTag),
            countryCode = "JP",
            internationalDialCode = "+81",
            flagImageResource = Res.drawable.jp)

    val KE : Country
        get() = Country(
            countryName = getLocalizedCountryName("KE", languageTag),
            countryCode = "KE",
            internationalDialCode = "+254",
            flagImageResource = Res.drawable.ke)

    val KG : Country
        get() = Country(
            countryName = getLocalizedCountryName("KG", languageTag),
            countryCode = "KG",
            internationalDialCode = "+996",
            flagImageResource = Res.drawable.kg)

    val KH : Country
        get() = Country(
            countryName = getLocalizedCountryName("KH", languageTag),
            countryCode = "KH",
            internationalDialCode = "+855",
            flagImageResource = Res.drawable.kh)

    val KI : Country
        get() = Country(
            countryName = getLocalizedCountryName("KI", languageTag),
            countryCode = "KI",
            internationalDialCode = "+686",
            flagImageResource = Res.drawable.ki)

    val KM : Country
        get() = Country(
            countryName = getLocalizedCountryName("KM", languageTag),
            countryCode = "KM",
            internationalDialCode = "+269",
            flagImageResource = Res.drawable.km)

    val KN : Country
        get() = Country(
            countryName = getLocalizedCountryName("KN", languageTag),
            countryCode = "KN",
            internationalDialCode = "+1",
            flagImageResource = Res.drawable.kn)

    val KP : Country
        get() = Country(
            countryName = getLocalizedCountryName("KP", languageTag),
            countryCode = "KP",
            internationalDialCode = "+850",
            flagImageResource = Res.drawable.kp)

    val KR : Country
        get() = Country(
            countryName = getLocalizedCountryName("KR", languageTag),
            countryCode = "KR",
            internationalDialCode = "+82",
            flagImageResource = Res.drawable.kr)

    val KW : Country
        get() = Country(
            countryName = getLocalizedCountryName("KW", languageTag),
            countryCode = "KW",
            internationalDialCode = "+965",
            flagImageResource = Res.drawable.kw)

    val KY : Country
        get() = Country(
            countryName = getLocalizedCountryName("KY", languageTag),
            countryCode = "KY",
            internationalDialCode = "+1",
            flagImageResource = Res.drawable.ky)

    val KZ : Country
        get() = Country(
            countryName = getLocalizedCountryName("KZ", languageTag),
            countryCode = "KZ",
            internationalDialCode = "+7",
            flagImageResource = Res.drawable.kz)

    val LA : Country
        get() = Country(
            countryName = getLocalizedCountryName("LA", languageTag),
            countryCode = "LA",
            internationalDialCode = "+856",
            flagImageResource = Res.drawable.la)

    val LB : Country
        get() = Country(
            countryName = getLocalizedCountryName("LB", languageTag),
            countryCode = "LB",
            internationalDialCode = "+961",
            flagImageResource = Res.drawable.lb)

    val LC : Country
        get() = Country(
            countryName = getLocalizedCountryName("LC", languageTag),
            countryCode = "LC",
            internationalDialCode = "+1",
            flagImageResource = Res.drawable.lc)

    val LI : Country
        get() = Country(
            countryName = getLocalizedCountryName("LI", languageTag),
            countryCode = "LI",
            internationalDialCode = "+423",
            flagImageResource = Res.drawable.li)

    val LK : Country
        get() = Country(
            countryName = getLocalizedCountryName("LK", languageTag),
            countryCode = "LK",
            internationalDialCode = "+94",
            flagImageResource = Res.drawable.lk)

    val LR : Country
        get() = Country(
            countryName = getLocalizedCountryName("LR", languageTag),
            countryCode = "LR",
            internationalDialCode = "+231",
            flagImageResource = Res.drawable.lr)

    val LS : Country
        get() = Country(
            countryName = getLocalizedCountryName("LS", languageTag),
            countryCode = "LS",
            internationalDialCode = "+266",
            flagImageResource = Res.drawable.ls)

    val LT : Country
        get() = Country(
            countryName = getLocalizedCountryName("LT", languageTag),
            countryCode = "LT",
            internationalDialCode = "+370",
            flagImageResource = Res.drawable.lt)

    val LU : Country
        get() = Country(
            countryName = getLocalizedCountryName("LU", languageTag),
            countryCode = "LU",
            internationalDialCode = "+352",
            flagImageResource = Res.drawable.lu)

    val LV : Country
        get() = Country(
            countryName = getLocalizedCountryName("LV", languageTag),
            countryCode = "LV",
            internationalDialCode = "+371",
            flagImageResource = Res.drawable.lv)

    val LY : Country
        get() = Country(
            countryName = getLocalizedCountryName("LY", languageTag),
            countryCode = "LY",
            internationalDialCode = "+218",
            flagImageResource = Res.drawable.ly)

    val MA : Country
        get() = Country(
            countryName = getLocalizedCountryName("MA", languageTag),
            countryCode = "MA",
            internationalDialCode = "+212",
            flagImageResource = Res.drawable.ma)

    val MC : Country
        get() = Country(
            countryName = getLocalizedCountryName("MC", languageTag),
            countryCode = "MC",
            internationalDialCode = "+377",
            flagImageResource = Res.drawable.mc)

    val MD : Country
        get() = Country(
            countryName = getLocalizedCountryName("MD", languageTag),
            countryCode = "MD",
            internationalDialCode = "+373",
            flagImageResource = Res.drawable.md)

    val ME : Country
        get() = Country(
            countryName = getLocalizedCountryName("ME", languageTag),
            countryCode = "ME",
            internationalDialCode = "+382",
            flagImageResource = Res.drawable.me)

    val MF : Country
        get() = Country(
            countryName = getLocalizedCountryName("MF", languageTag),
            countryCode = "MF",
            internationalDialCode = "+590",
            flagImageResource = Res.drawable.mf)

    val MG : Country
        get() = Country(
            countryName = getLocalizedCountryName("MG", languageTag),
            countryCode = "MG",
            internationalDialCode = "+261",
            flagImageResource = Res.drawable.mg)

    val MH : Country
        get() = Country(
            countryName = getLocalizedCountryName("MH", languageTag),
            countryCode = "MH",
            internationalDialCode = "+692",
            flagImageResource = Res.drawable.mh)

    val MK : Country
        get() = Country(
            countryName = getLocalizedCountryName("MK", languageTag),
            countryCode = "MK",
            internationalDialCode = "+389",
            flagImageResource = Res.drawable.mk)

    val ML : Country
        get() = Country(
            countryName = getLocalizedCountryName("ML", languageTag),
            countryCode = "ML",
            internationalDialCode = "+223",
            flagImageResource = Res.drawable.ml)

    val MM : Country
        get() = Country(
            countryName = getLocalizedCountryName("MM", languageTag),
            countryCode = "MM",
            internationalDialCode = "+95",
            flagImageResource = Res.drawable.mm)

    val MN : Country
        get() = Country(
            countryName = getLocalizedCountryName("MN", languageTag),
            countryCode = "MN",
            internationalDialCode = "+976",
            flagImageResource = Res.drawable.mn)

    val MO : Country
        get() = Country(
            countryName = getLocalizedCountryName("MO", languageTag),
            countryCode = "MO",
            internationalDialCode = "+853",
            flagImageResource = Res.drawable.mo)

    val MP : Country
        get() = Country(
            countryName = getLocalizedCountryName("MP", languageTag),
            countryCode = "MP",
            internationalDialCode = "+1",
            flagImageResource = Res.drawable.mp)

    val MQ : Country
        get() = Country(
            countryName = getLocalizedCountryName("MQ", languageTag),
            countryCode = "MQ",
            internationalDialCode = "+596",
            flagImageResource = Res.drawable.mq)

    val MR : Country
        get() = Country(
            countryName = getLocalizedCountryName("MR", languageTag),
            countryCode = "MR",
            internationalDialCode = "+222",
            flagImageResource = Res.drawable.mr)

    val MS : Country
        get() = Country(
            countryName = getLocalizedCountryName("MS", languageTag),
            countryCode = "MS",
            internationalDialCode = "+1",
            flagImageResource = Res.drawable.ms)

    val MT : Country
        get() = Country(
            countryName = getLocalizedCountryName("MT", languageTag),
            countryCode = "MT",
            internationalDialCode = "+356",
            flagImageResource = Res.drawable.mt)

    val MU : Country
        get() = Country(
            countryName = getLocalizedCountryName("MU", languageTag),
            countryCode = "MU",
            internationalDialCode = "+230",
            flagImageResource = Res.drawable.mu)

    val MV : Country
        get() = Country(
            countryName = getLocalizedCountryName("MV", languageTag),
            countryCode = "MV",
            internationalDialCode = "+960",
            flagImageResource = Res.drawable.mv)

    val MW : Country
        get() = Country(
            countryName = getLocalizedCountryName("MW", languageTag),
            countryCode = "MW",
            internationalDialCode = "+265",
            flagImageResource = Res.drawable.mw)

    val MX : Country
        get() = Country(
            countryName = getLocalizedCountryName("MX", languageTag),
            countryCode = "MX",
            internationalDialCode = "+52",
            flagImageResource = Res.drawable.mx)

    val MY : Country
        get() = Country(
            countryName = getLocalizedCountryName("MY", languageTag),
            countryCode = "MY",
            internationalDialCode = "+60",
            flagImageResource = Res.drawable.my)

    val MZ : Country
        get() = Country(
            countryName = getLocalizedCountryName("MZ", languageTag),
            countryCode = "MZ",
            internationalDialCode = "+258",
            flagImageResource = Res.drawable.mz)

    val NA : Country
        get() = Country(
            countryName = getLocalizedCountryName("NA", languageTag),
            countryCode = "NA",
            internationalDialCode = "+264",
            flagImageResource = Res.drawable.na)

    val NC : Country
        get() = Country(
            countryName = getLocalizedCountryName("NC", languageTag),
            countryCode = "NC",
            internationalDialCode = "+687",
            flagImageResource = Res.drawable.nc)

    val NE : Country
        get() = Country(
            countryName = getLocalizedCountryName("NE", languageTag),
            countryCode = "NE",
            internationalDialCode = "+227",
            flagImageResource = Res.drawable.ne)

    val NF : Country
        get() = Country(
            countryName = getLocalizedCountryName("NF", languageTag),
            countryCode = "NF",
            internationalDialCode = "+672",
            flagImageResource = Res.drawable.nf)

    val NG : Country
        get() = Country(
            countryName = getLocalizedCountryName("NG", languageTag),
            countryCode = "NG",
            internationalDialCode = "+234",
            flagImageResource = Res.drawable.ng)

    val NI : Country
        get() = Country(
            countryName = getLocalizedCountryName("NI", languageTag),
            countryCode = "NI",
            internationalDialCode = "+505",
            flagImageResource = Res.drawable.ni)

    val NL : Country
        get() = Country(
            countryName = getLocalizedCountryName("NL", languageTag),
            countryCode = "NL",
            internationalDialCode = "+31",
            flagImageResource = Res.drawable.nl)

    val NO : Country
        get() = Country(
            countryName = getLocalizedCountryName("NO", languageTag),
            countryCode = "NO",
            internationalDialCode = "+47",
            flagImageResource = Res.drawable.no)

    val NP : Country
        get() = Country(
            countryName = getLocalizedCountryName("NP", languageTag),
            countryCode = "NP",
            internationalDialCode = "+977",
            flagImageResource = Res.drawable.np)

    val NR : Country
        get() = Country(
            countryName = getLocalizedCountryName("NR", languageTag),
            countryCode = "NR",
            internationalDialCode = "+674",
            flagImageResource = Res.drawable.nr)

    val NU : Country
        get() = Country(
            countryName = getLocalizedCountryName("NU", languageTag),
            countryCode = "NU",
            internationalDialCode = "+683",
            flagImageResource = Res.drawable.nu)

    val NZ : Country
        get() = Country(
            countryName = getLocalizedCountryName("NZ", languageTag),
            countryCode = "NZ",
            internationalDialCode = "+64",
            flagImageResource = Res.drawable.nz)

    val OM : Country
        get() = Country(
            countryName = getLocalizedCountryName("OM", languageTag),
            countryCode = "OM",
            internationalDialCode = "+968",
            flagImageResource = Res.drawable.om)

    val PA : Country
        get() = Country(
            countryName = getLocalizedCountryName("PA", languageTag),
            countryCode = "PA",
            internationalDialCode = "+507",
            flagImageResource = Res.drawable.pa)

    val PE : Country
        get() = Country(
            countryName = getLocalizedCountryName("PE", languageTag),
            countryCode = "PE",
            internationalDialCode = "+51",
            flagImageResource = Res.drawable.pe)

    val PF : Country
        get() = Country(
            countryName = getLocalizedCountryName("PF", languageTag),
            countryCode = "PF",
            internationalDialCode = "+689",
            flagImageResource = Res.drawable.pf)

    val PG : Country
        get() = Country(
            countryName = getLocalizedCountryName("PG", languageTag),
            countryCode = "PG",
            internationalDialCode = "+675",
            flagImageResource = Res.drawable.pg)

    val PH : Country
        get() = Country(
            countryName = getLocalizedCountryName("PH", languageTag),
            countryCode = "PH",
            internationalDialCode = "+63",
            flagImageResource = Res.drawable.ph)

    val PK : Country
        get() = Country(
            countryName = getLocalizedCountryName("PK", languageTag),
            countryCode = "PK",
            internationalDialCode = "+92",
            flagImageResource = Res.drawable.pk)

    val PL : Country
        get() = Country(
            countryName = getLocalizedCountryName("PL", languageTag),
            countryCode = "PL",
            internationalDialCode = "+48",
            flagImageResource = Res.drawable.pl)

    val PM : Country
        get() = Country(
            countryName = getLocalizedCountryName("PM", languageTag),
            countryCode = "PM",
            internationalDialCode = "+508",
            flagImageResource = Res.drawable.pm)

    val PN : Country
        get() = Country(
            countryName = getLocalizedCountryName("PN", languageTag),
            countryCode = "PN",
            internationalDialCode = "+870",
            flagImageResource = Res.drawable.pn)

    val PR : Country
        get() = Country(
            countryName = getLocalizedCountryName("PR", languageTag),
            countryCode = "PR",
            internationalDialCode = "+1",
            flagImageResource = Res.drawable.pr)

    val PS : Country
        get() = Country(
            countryName = getLocalizedCountryName("PS", languageTag),
            countryCode = "PS",
            internationalDialCode = "+970",
            flagImageResource = Res.drawable.ps)

    val PT : Country
        get() = Country(
            countryName = getLocalizedCountryName("PT", languageTag),
            countryCode = "PT",
            internationalDialCode = "+351",
            flagImageResource = Res.drawable.pt)

    val PW : Country
        get() = Country(
            countryName = getLocalizedCountryName("PW", languageTag),
            countryCode = "PW",
            internationalDialCode = "+680",
            flagImageResource = Res.drawable.pw)

    val PY : Country
        get() = Country(
            countryName = getLocalizedCountryName("PY", languageTag),
            countryCode = "PY",
            internationalDialCode = "+595",
            flagImageResource = Res.drawable.py)

    val QA : Country
        get() = Country(
            countryName = getLocalizedCountryName("QA", languageTag),
            countryCode = "QA",
            internationalDialCode = "+974",
            flagImageResource = Res.drawable.qa)

    val RE : Country
        get() = Country(
            countryName = getLocalizedCountryName("RE", languageTag),
            countryCode = "RE",
            internationalDialCode = "+262",
            flagImageResource = Res.drawable.re)

    val RO : Country
        get() = Country(
            countryName = getLocalizedCountryName("RO", languageTag),
            countryCode = "RO",
            internationalDialCode = "+40",
            flagImageResource = Res.drawable.ro)

    val RS : Country
        get() = Country(
            countryName = getLocalizedCountryName("RS", languageTag),
            countryCode = "RS",
            internationalDialCode = "+381",
            flagImageResource = Res.drawable.rs)

    val RU : Country
        get() = Country(
            countryName = getLocalizedCountryName("RU", languageTag),
            countryCode = "RU",
            internationalDialCode = "+7",
            flagImageResource = Res.drawable.ru)

    val RW : Country
        get() = Country(
            countryName = getLocalizedCountryName("RW", languageTag),
            countryCode = "RW",
            internationalDialCode = "+250",
            flagImageResource = Res.drawable.rw)

    val SA : Country
        get() = Country(
            countryName = getLocalizedCountryName("SA", languageTag),
            countryCode = "SA",
            internationalDialCode = "+966",
            flagImageResource = Res.drawable.sa)

    val SB : Country
        get() = Country(
            countryName = getLocalizedCountryName("SB", languageTag),
            countryCode = "SB",
            internationalDialCode = "+677",
            flagImageResource = Res.drawable.sb)

    val SC : Country
        get() = Country(
            countryName = getLocalizedCountryName("SC", languageTag),
            countryCode = "SC",
            internationalDialCode = "+248",
            flagImageResource = Res.drawable.sc)

    val SD : Country
        get() = Country(
            countryName = getLocalizedCountryName("SD", languageTag),
            countryCode = "SD",
            internationalDialCode = "+249",
            flagImageResource = Res.drawable.sd)

    val SE : Country
        get() = Country(
            countryName = getLocalizedCountryName("SE", languageTag),
            countryCode = "SE",
            internationalDialCode = "+46",
            flagImageResource = Res.drawable.se)

    val SG : Country
        get() = Country(
            countryName = getLocalizedCountryName("SG", languageTag),
            countryCode = "SG",
            internationalDialCode = "+65",
            flagImageResource = Res.drawable.sg)

    val SH : Country
        get() = Country(
            countryName = getLocalizedCountryName("SH", languageTag),
            countryCode = "SH",
            internationalDialCode = "+290",
            flagImageResource = Res.drawable.sh)

    val SI : Country
        get() = Country(
            countryName = getLocalizedCountryName("SI", languageTag),
            countryCode = "SI",
            internationalDialCode = "+386",
            flagImageResource = Res.drawable.si)

    val SJ : Country
        get() = Country(
            countryName = getLocalizedCountryName("SJ", languageTag),
            countryCode = "SJ",
            internationalDialCode = "+47",
            flagImageResource = Res.drawable.sj)

    val SK : Country
        get() = Country(
            countryName = getLocalizedCountryName("SK", languageTag),
            countryCode = "SK",
            internationalDialCode = "+421",
            flagImageResource = Res.drawable.sk)

    val SL : Country
        get() = Country(
            countryName = getLocalizedCountryName("SL", languageTag),
            countryCode = "SL",
            internationalDialCode = "+232",
            flagImageResource = Res.drawable.sl)

    val SM : Country
        get() = Country(
            countryName = getLocalizedCountryName("SM", languageTag),
            countryCode = "SM",
            internationalDialCode = "+378",
            flagImageResource = Res.drawable.sm)

    val SN : Country
        get() = Country(
            countryName = getLocalizedCountryName("SN", languageTag),
            countryCode = "SN",
            internationalDialCode = "+221",
            flagImageResource = Res.drawable.sn)

    val SO : Country
        get() = Country(
            countryName = getLocalizedCountryName("SO", languageTag),
            countryCode = "SO",
            internationalDialCode = "+252",
            flagImageResource = Res.drawable.so)

    val SR : Country
        get() = Country(
            countryName = getLocalizedCountryName("SR", languageTag),
            countryCode = "SR",
            internationalDialCode = "+597",
            flagImageResource = Res.drawable.sr)

    val SS : Country
        get() = Country(
            countryName = getLocalizedCountryName("SS", languageTag),
            countryCode = "SS",
            internationalDialCode = "+211",
            flagImageResource = Res.drawable.ss)

    val ST : Country
        get() = Country(
            countryName = getLocalizedCountryName("ST", languageTag),
            countryCode = "ST",
            internationalDialCode = "+239",
            flagImageResource = Res.drawable.st)

    val SV : Country
        get() = Country(
            countryName = getLocalizedCountryName("SV", languageTag),
            countryCode = "SV",
            internationalDialCode = "+503",
            flagImageResource = Res.drawable.sv)

    val SX : Country
        get() = Country(
            countryName = getLocalizedCountryName("SX", languageTag),
            countryCode = "SX",
            internationalDialCode = "+1",
            flagImageResource = Res.drawable.sx)

    val SY : Country
        get() = Country(
            countryName = getLocalizedCountryName("SY", languageTag),
            countryCode = "SY",
            internationalDialCode = "+963",
            flagImageResource = Res.drawable.sy)

    val SZ : Country
        get() = Country(
            countryName = getLocalizedCountryName("SZ", languageTag),
            countryCode = "SZ",
            internationalDialCode = "+268",
            flagImageResource = Res.drawable.sz)

    val TC : Country
        get() = Country(
            countryName = getLocalizedCountryName("TC", languageTag),
            countryCode = "TC",
            internationalDialCode = "+1",
            flagImageResource = Res.drawable.tc)

    val TD : Country
        get() = Country(
            countryName = getLocalizedCountryName("TD", languageTag),
            countryCode = "TD",
            internationalDialCode = "+235",
            flagImageResource = Res.drawable.td)

    val TF : Country
        get() = Country(
            countryName = getLocalizedCountryName("TF", languageTag),
            countryCode = "TF",
            internationalDialCode = "+262",
            flagImageResource = Res.drawable.tf)

    val TG : Country
        get() = Country(
            countryName = getLocalizedCountryName("TG", languageTag),
            countryCode = "TG",
            internationalDialCode = "+228",
            flagImageResource = Res.drawable.tg)

    val TH : Country
        get() = Country(
            countryName = getLocalizedCountryName("TH", languageTag),
            countryCode = "TH",
            internationalDialCode = "+66",
            flagImageResource = Res.drawable.th)

    val TJ : Country
        get() = Country(
            countryName = getLocalizedCountryName("TJ", languageTag),
            countryCode = "TJ",
            internationalDialCode = "+992",
            flagImageResource = Res.drawable.tj)

    val TK : Country
        get() = Country(
            countryName = getLocalizedCountryName("TK", languageTag),
            countryCode = "TK",
            internationalDialCode = "+690",
            flagImageResource = Res.drawable.tk)

    val TL : Country
        get() = Country(
            countryName = getLocalizedCountryName("TL", languageTag),
            countryCode = "TL",
            internationalDialCode = "+670",
            flagImageResource = Res.drawable.tl)

    val TM : Country
        get() = Country(
            countryName = getLocalizedCountryName("TM", languageTag),
            countryCode = "TM",
            internationalDialCode = "+993",
            flagImageResource = Res.drawable.tm)

    val TN : Country
        get() = Country(
            countryName = getLocalizedCountryName("TN", languageTag),
            countryCode = "TN",
            internationalDialCode = "+216",
            flagImageResource = Res.drawable.tn)

    val TO : Country
        get() = Country(
            countryName = getLocalizedCountryName("TO", languageTag),
            countryCode = "TO",
            internationalDialCode = "+676",
            flagImageResource = Res.drawable.to)

    val TR : Country
        get() = Country(
            countryName = getLocalizedCountryName("TR", languageTag),
            countryCode = "TR",
            internationalDialCode = "+90",
            flagImageResource = Res.drawable.tr)

    val TT : Country
        get() = Country(
            countryName = getLocalizedCountryName("TT", languageTag),
            countryCode = "TT",
            internationalDialCode = "+1",
            flagImageResource = Res.drawable.tt)

    val TV : Country
        get() = Country(
            countryName = getLocalizedCountryName("TV", languageTag),
            countryCode = "TV",
            internationalDialCode = "+688",
            flagImageResource = Res.drawable.tv)

    val TW : Country
        get() = Country(
            countryName = getLocalizedCountryName("TW", languageTag),
            countryCode = "TW",
            internationalDialCode = "+886",
            flagImageResource = Res.drawable.tw)

    val TZ : Country
        get() = Country(
            countryName = getLocalizedCountryName("TZ", languageTag),
            countryCode = "TZ",
            internationalDialCode = "+255",
            flagImageResource = Res.drawable.tz)

    val UA : Country
        get() = Country(
            countryName = getLocalizedCountryName("UA", languageTag),
            countryCode = "UA",
            internationalDialCode = "+380",
            flagImageResource = Res.drawable.ua)

    val UG : Country
        get() = Country(
            countryName = getLocalizedCountryName("UG", languageTag),
            countryCode = "UG",
            internationalDialCode = "+256",
            flagImageResource = Res.drawable.ug)

    val UM : Country
        get() = Country(
            countryName = getLocalizedCountryName("UM", languageTag),
            countryCode = "UM",
            internationalDialCode = "+1",
            flagImageResource = Res.drawable.um)

    val US : Country
        get() = Country(
            countryName = getLocalizedCountryName("US", languageTag),
            countryCode = "US",
            internationalDialCode = "+1",
            flagImageResource = Res.drawable.us)

    val UY : Country
        get() = Country(
            countryName = getLocalizedCountryName("UY", languageTag),
            countryCode = "UY",
            internationalDialCode = "+598",
            flagImageResource = Res.drawable.uy)

    val UZ : Country
        get() = Country(
            countryName = getLocalizedCountryName("UZ", languageTag),
            countryCode = "UZ",
            internationalDialCode = "+998",
            flagImageResource = Res.drawable.uz)

    val VA : Country
        get() = Country(
            countryName = getLocalizedCountryName("VA", languageTag),
            countryCode = "VA",
            internationalDialCode = "+379",
            flagImageResource = Res.drawable.va)

    val VC : Country
        get() = Country(
            countryName = getLocalizedCountryName("VC", languageTag),
            countryCode = "VC",
            internationalDialCode = "+1",
            flagImageResource = Res.drawable.vc)

    val VE : Country
        get() = Country(
            countryName = getLocalizedCountryName("VE", languageTag),
            countryCode = "VE",
            internationalDialCode = "+58",
            flagImageResource = Res.drawable.ve)

    val VG : Country
        get() = Country(
            countryName = getLocalizedCountryName("VG", languageTag),
            countryCode = "VG",
            internationalDialCode = "+1",
            flagImageResource = Res.drawable.vg)

    val VI : Country
        get() = Country(
            countryName = getLocalizedCountryName("VI", languageTag),
            countryCode = "VI",
            internationalDialCode = "+1",
            flagImageResource = Res.drawable.vi)

    val VN : Country
        get() = Country(
            countryName = getLocalizedCountryName("VN", languageTag),
            countryCode = "VN",
            internationalDialCode = "+84",
            flagImageResource = Res.drawable.vn)

    val VU : Country
        get() = Country(
            countryName = getLocalizedCountryName("VU", languageTag),
            countryCode = "VU",
            internationalDialCode = "+678",
            flagImageResource = Res.drawable.vu)

    val WF : Country
        get() = Country(
            countryName = getLocalizedCountryName("WF", languageTag),
            countryCode = "WF",
            internationalDialCode = "+681",
            flagImageResource = Res.drawable.wf)

    val WS : Country
        get() = Country(
            countryName = getLocalizedCountryName("WS", languageTag),
            countryCode = "WS",
            internationalDialCode = "+685",
            flagImageResource = Res.drawable.ws)

    val YE : Country
        get() = Country(
            countryName = getLocalizedCountryName("YE", languageTag),
            countryCode = "YE",
            internationalDialCode = "+967",
            flagImageResource = Res.drawable.ye)

    val YT : Country
        get() = Country(
            countryName = getLocalizedCountryName("YT", languageTag),
            countryCode = "YT",
            internationalDialCode = "+262",
            flagImageResource = Res.drawable.yt)

    val ZA : Country
        get() = Country(
            countryName = getLocalizedCountryName("ZA", languageTag),
            countryCode = "ZA",
            internationalDialCode = "+27",
            flagImageResource = Res.drawable.za)

    val ZM : Country
        get() = Country(
            countryName = getLocalizedCountryName("ZM", languageTag),
            countryCode = "ZM",
            internationalDialCode = "+260",
            flagImageResource = Res.drawable.zm)

    val ZW : Country
        get() = Country(
            countryName = getLocalizedCountryName("ZW", languageTag),
            countryCode = "ZW",
            internationalDialCode = "+263",
            flagImageResource = Res.drawable.zw)

    /**
     * A list containing all predefined country instances represented by their respective properties
     * from the `Countries` object. Each entry in this list corresponds to a specific country and
     * is represented by its corresponding country object, such as `AD`, `AE`, `AF`, etc.
     *
     * This list can be used to access all the countries defined within the `Countries` object.
     */
    val ALL_COUNTRIES: List<Country>
        get() = listOf(
            AD, AE, AF, AG, AI, AL, AM, AO, AQ, AR,
            AS, AT, AU, AW, AX, AZ, BA, BB, BD, BE, BF, BG, BH, BI, BJ, BL, BM, BN,
            BO, BR, BS, BT, BV, BW, BY, BZ, CA, CC, CD, CF, CG, CH, CI, CK, CL, CM,
            CN, CO, CR, CU, CV, CW, CX, CY, CZ, DE, DJ, DK, DM, DZ, EAC, EC, EE, EG,
            EH, ER, ES, ET, FI, FJ, FK, FM, FO, FR, GA, GB, GD, GE, GF, GG, GH, GI, GL,
            GM, GN, GP, GQ, GR, GS, GT, GU, GW, GY, HK, HM, HN, HR, HT, HU, IC, ID, IE,
            IL, IM, IN, IO, IQ, IR, IS, IT, JE, JM, JO, JP, KE, KG, KH, KI, KM, KN, KP,
            KR, KW, KY, KZ, LA, LB, LC, LI, LK, LR, LS, LT, LU, LV, LY, MA, MC, MD, ME,
            MF, MG, MH, MK, ML, MM, MN, MO, MP, MQ, MR, MS, MT, MU, MV, MW, MX, MY, MZ,
            NA, NC, NE, NF, NG, NI, NL, NO, NP, NR, NU, NZ, OM, PA, PE, PF, PG, PH, PK,
            PL, PM, PN, PR, PS, PT, PW, PY, QA, RE, RO, RS, RU, RW, SA, SB, SC, SD, SE,
            SG, SH, SI, SJ, SK, SL, SM, SN, SO, SR, SS, ST, SV, SX, SY, SZ, TC, TD, TF,
            TG, TH, TJ, TK, TL, TM, TN, TO, TR, TT, TV, TW, TZ, UA, UG, UM, US, UY, UZ,
            VA, VC, VE, VG, VI, VN, VU, WF, WS, YE, YT, ZA, ZM, ZW
        )
}
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.key.KeyEvent
import androidx.compose.ui.input.key.NativeKeyEvent
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.SemanticsProperties
import androidx.compose.ui.semantics.getOrNull
import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.assertIsEnabled
import androidx.compose.ui.test.assertIsNotEnabled
import androidx.compose.ui.test.assertTextContains
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.filterToOne
import androidx.compose.ui.test.hasAnyChild
import androidx.compose.ui.test.hasContentDescription
import androidx.compose.ui.test.hasParent
import androidx.compose.ui.test.hasSetTextAction
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.isDialog
import androidx.compose.ui.test.isRoot
import androidx.compose.ui.test.onAllNodesWithContentDescription
import androidx.compose.ui.test.onAllNodesWithTag
import androidx.compose.ui.test.onAllNodesWithText
import androidx.compose.ui.test.onChild
import androidx.compose.ui.test.onFirst
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performGesture
import androidx.compose.ui.test.performKeyPress
import androidx.compose.ui.test.performScrollTo
import androidx.compose.ui.test.performTextClearance
import androidx.compose.ui.test.performTextInput
import androidx.compose.ui.test.performTouchInput
import androidx.compose.ui.test.runComposeUiTest
import androidx.compose.ui.test.swipeUp
import androidx.compose.ui.test.waitUntilExactlyOneExists
import androidx.compose.ui.unit.dp
import com.wannaverse.countryselector.Countries
import com.wannaverse.countryselector.Country
import com.wannaverse.countryselector.CountrySelector
import org.jetbrains.compose.resources.painterResource
import kotlin.test.Test
import kotlin.test.assertEquals

@OptIn(ExperimentalTestApi::class)
class Test {
    @Test
    fun searchWithCountryName(){
        runComposeUiTest {
            setContent {

                var selectedCountry by remember { mutableStateOf(Countries.US) }

                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Box(
                        modifier = Modifier.height(50.dp)
                            .border(
                                width = 1.dp,
                                color = MaterialTheme.colorScheme.outline,
                                shape = MaterialTheme.shapes.medium
                            )
                            .padding(8.dp)
                            .testTag("TestBox"),
                        contentAlignment = Alignment.Center
                    ) {
                        CountrySelector(
                            country = selectedCountry,
                            onSelection = { selectedCountry = it }
                        )
                    }
                }
            }
            onNodeWithTag("TestBox").performClick()
            onNodeWithText("Search").performTextInput(Countries.EG.countryName)
            onNode(hasText(Countries.EG.internationalDialCode)).performClick()
            waitForIdle()
            onNode(hasText(Countries.EG.internationalDialCode)).assertExists()

        }
    }


    @Test
    fun searchWithCountryCode(){
        runComposeUiTest {
            setContent {

                var selectedCountry by remember { mutableStateOf(Countries.US) }

                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Box(
                        modifier = Modifier.height(50.dp)
                            .border(
                                width = 1.dp,
                                color = MaterialTheme.colorScheme.outline,
                                shape = MaterialTheme.shapes.medium
                            )
                            .padding(8.dp)
                            .testTag("TestBox"),
                        contentAlignment = Alignment.Center
                    ) {
                        CountrySelector(
                            country = selectedCountry,
                            onSelection = { selectedCountry = it }
                        )
                    }
                }
            }
            onNodeWithTag("TestBox").performClick()
            onNodeWithText("Search").performTextInput(Countries.EG.internationalDialCode)
            onNode(hasContentDescription(Countries.EG.countryName)).performClick()
            waitUntilExactlyOneExists(hasTestTag("TestBox"),5000)
            onNodeWithText(Countries.EG.internationalDialCode).assertExists()

        }
    }

    @Test
    fun countryCodeNotFound(){
        runComposeUiTest {
            setContent {

                var selectedCountry by remember { mutableStateOf(Countries.US) }

                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Box(
                        modifier = Modifier.height(50.dp)
                            .border(
                                width = 1.dp,
                                color = MaterialTheme.colorScheme.outline,
                                shape = MaterialTheme.shapes.medium
                            )
                            .padding(8.dp)
                            .testTag("TestBox"),
                        contentAlignment = Alignment.Center
                    ) {
                        CountrySelector(
                            country = selectedCountry,
                            onSelection = { selectedCountry = it }
                        )
                    }
                }
            }
            onNodeWithTag("TestBox").performClick()
            onNodeWithText("Search").performTextInput("NoneExistCountry")
            onNode(hasText("No countries found")).assertExists()
        }
    }

    @Test
    fun changeLocalLanguage(){
        runComposeUiTest {
            setContent {
                var selectedCountry by remember { mutableStateOf(Countries.US) }
                Countries.languageTag = "fr"
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Box(
                        modifier = Modifier
                            .testTag("TestBox")
                            .height(50.dp)
                            .border(
                                width = 1.dp,
                                color = MaterialTheme.colorScheme.outline,
                                shape = MaterialTheme.shapes.medium
                            )
                            .padding(8.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        CountrySelector(
                            country = selectedCountry,
                            onSelection = { selectedCountry = it },
                            pickerRowContent = { country ->
                                Row(
                                    modifier = Modifier,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Image(
                                        painter = painterResource(
                                            resource = country.flagImageResource,
                                        ),
                                        contentDescription = country.countryName,
                                        modifier = Modifier
                                            .size(24.dp)
                                            .clip(CircleShape)
                                    )
                                    Spacer(Modifier.width(8.dp))
                                    Text(country.countryName)
                                    Spacer(Modifier.weight(1f))
                                    Text(country.internationalDialCode)
                                } },
                            searchBarContent = { searchQuery, onQueryChange, hasError ->
                                TextField(
                                    value = searchQuery,
                                    onValueChange = onQueryChange,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(10.dp),
                                    label = { Text("Search Countries") },
                                    trailingIcon = {
                                        if (hasError) {
                                            Icon(Icons.Default.Warning, contentDescription = "No results found")
                                        } },
                                    isError = hasError,
                                    placeholder = { Text("Search by country name or code") }
                                )
                            }
                        )
                    }
                }

                }

            onNodeWithTag("TestBox").performClick() //ensure that the lang is changed
            onNodeWithText("Search Countries").performTextInput("+20")
            onNode(hasText("Égypte")).assertExists()
            }
        }

    @Test
    fun performenceTest(){
        runComposeUiTest {
            val countries = listOf(Countries.US, Countries.AD, Countries.AE,
                                   Countries.AM, Countries.BD, Countries.AG,
                                   Countries.AI, Countries.AL, Countries.AR)
            setContent {
                var selectedCountry by remember { mutableStateOf(countries[0]) }
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Box(
                        modifier = Modifier.height(50.dp)
                            .border(
                                width = 1.dp,
                                color = MaterialTheme.colorScheme.outline,
                                shape = MaterialTheme.shapes.medium
                            )
                            .padding(8.dp)
                            .testTag("TestBox"),
                        contentAlignment = Alignment.Center
                    ) {
                        CountrySelector(
                            country = selectedCountry,
                            onSelection = { selectedCountry = it }
                        )
                    }
                }
            }
            countries.forEach { country ->
                onNodeWithTag("TestBox").performClick()
                onNodeWithText("Search").performTextClearance()
                onNodeWithText("Search").performTextInput(country.countryName)
                if (onAllNodesWithText(country.internationalDialCode).fetchSemanticsNodes().size > 1){
                    onAllNodesWithText(country.internationalDialCode)[1].performClick()
                }else{
                    onNodeWithText(country.internationalDialCode).performClick()
                }
                onNodeWithTag("TestBox").onChild().assertTextContains(country.internationalDialCode)
            }
        }
    }


    @Test
    fun register() {
        runComposeUiTest {
            setContent {
                var selectedCountry by remember { mutableStateOf(Countries.US) }
                var phoneNumber by remember { mutableStateOf("") }
                var isFormValid by remember { mutableStateOf(false) }

                LazyColumn(modifier = Modifier.fillMaxSize()) {
                    item {
                        Spacer(modifier = Modifier.height(50.dp))

                        Text(
                            "Phone Number Registration",
                            style = MaterialTheme.typography.headlineMedium
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                    }
                    item {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(
                                modifier = Modifier
                                    .width(120.dp)
                                    .border(1.dp, MaterialTheme.colorScheme.outline)
                                    .padding(8.dp)
                            ) {
                                CountrySelector(
                                    country = selectedCountry,
                                    onSelection = { selectedCountry = it }
                                )
                            }
                            Spacer(modifier = Modifier.width(8.dp))
                            TextField(
                                value = phoneNumber,
                                onValueChange = {
                                    phoneNumber = it
                                    isFormValid = phoneNumber.length >= 6
                                },
                                label = { Text("Phone Number") },
                                modifier = Modifier.weight(1f)
                            )
                        }
                    }
                    item {
                        Button(
                            onClick = {  },
                            enabled = isFormValid,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 16.dp)
                        ) {
                            Text("Submit")
                        }
                    }
                }
            }
            onNodeWithContentDescription(Countries.US.countryName).performClick()
            onNodeWithText(Countries.AE.internationalDialCode).performClick()
            onNodeWithText("Phone Number").performTextInput("123456798")
            onNodeWithText("Submit").assertIsEnabled()
            onNodeWithText(Countries.AE.internationalDialCode).assertExists()
        }
    }
}
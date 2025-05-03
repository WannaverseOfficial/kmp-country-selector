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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Warning
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
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.SemanticsProperties
import androidx.compose.ui.semantics.getOrNull
import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.assertTextContains
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.onAllNodesWithTag
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.compose.ui.test.runComposeUiTest
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
    fun `CorrectCountryCode`(){
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
            onNodeWithText("Search").performTextInput("egYp")
            onNode(hasText("+20")).performClick()
            waitForIdle()
            onNode(hasText("+20")).assertExists()

        }
    }


    @Test
    fun `CountryCodeNotFound`(){
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
    fun `ChangeLocalLanguage`(){
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
    }
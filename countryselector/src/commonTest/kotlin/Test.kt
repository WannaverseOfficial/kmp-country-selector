import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.runComposeUiTest
import androidx.compose.ui.test.waitUntilExactlyOneExists
import androidx.compose.ui.unit.dp
import com.wannaverse.countryselector.Countries
import com.wannaverse.countryselector.CountrySelector
import kotlin.test.Test

class Test {
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun `test function`(){
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
                            .padding(8.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        CountrySelector(
                            country = selectedCountry,
                            onSelection = { selectedCountry = it }
                        )
                    }
                }
            }
            //waitUntilExactlyOneExists(hasText("ddd"),100000)
        }
    }
}
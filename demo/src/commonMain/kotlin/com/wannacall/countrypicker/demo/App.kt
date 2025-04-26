package com.wannacall.countrypicker.demo

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DarkMode
import androidx.compose.material.icons.filled.LightMode
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.wannacall.countrypicker.Countries
import com.wannacall.countrypicker.CountryPickerIcon
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    var darkTheme by remember { mutableStateOf(false) }

    var selectedCountry by remember { mutableStateOf(Countries.US) }

    DemoAppTheme(darkTheme) {
        Surface {
            FloatingActionButton(
                onClick = { darkTheme = !darkTheme },
                modifier = Modifier.windowInsetsPadding(WindowInsets.statusBars).padding(16.dp),
                content = {
                    if (darkTheme) Icon(
                        imageVector = Icons.Filled.LightMode,
                        contentDescription = "Light Mode"
                    ) else Icon(
                        imageVector = Icons.Filled.DarkMode,
                        contentDescription = "Dark Mode"
                    )
                }
            )

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
                    CountryPickerIcon(selectedCountry) { selectedCountry = it }
                }
            }
        }
    }
}
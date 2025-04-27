package com.wannaverse.countryselector.demo

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "country-selector",
    ) {
        App()
    }
}
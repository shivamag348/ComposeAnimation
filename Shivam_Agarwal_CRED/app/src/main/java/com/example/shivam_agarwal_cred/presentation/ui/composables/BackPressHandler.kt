package com.example.shivam_agarwal_cred.presentation.ui.composables

import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember

/**
*To Handle System Back Press
*/
@Composable
fun BackPressHandler(
    enabled: Boolean = true,
    onBackPressed: () -> Unit,
) {
    val dispatcher = LocalOnBackPressedDispatcherOwner.current
        ?.onBackPressedDispatcher

    val backCallback = remember {
        object : OnBackPressedCallback(enabled) {
            override fun handleOnBackPressed() {
                onBackPressed()
            }
        }
    }

    DisposableEffect(key1 = dispatcher) {
        dispatcher?.addCallback(backCallback)
        onDispose {
            backCallback.remove()
        }
    }
}

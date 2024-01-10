package com.example.shivam_agarwal_cred.presentation.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.shivam_agarwal_cred.presentation.ui.composables.BackPressHandler
import com.example.shivam_agarwal_cred.presentation.ui.states.FirstState
import com.example.shivam_agarwal_cred.presentation.ui.states.SecondState
import com.example.shivam_agarwal_cred.presentation.ui.states.ThirdState

/**
 * Here I am maintaining three states based on all three views.
 */

@Composable
fun MainView() {
    var viewStates by remember { mutableIntStateOf(1) }

    BackPressHandler {
        if (viewStates > 1) {
            viewStates--
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        when (viewStates) {
            1 -> {
                FirstState(viewStates, onButtonClick = {
                    viewStates = it
                })
            }

            2 -> {
                FirstState(viewStates, onButtonClick = {
                    viewStates = it
                })
                SecondState(viewStates, onButtonClick = {
                    viewStates = it
                })
            }

            3 -> {
                FirstState(viewStates, onButtonClick = {
                    viewStates = it
                })
                SecondState(viewStates, onButtonClick = {
                    viewStates = it
                })
                ThirdState()
            }
        }
    }
}



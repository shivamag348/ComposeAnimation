package com.example.shivam_agarwal_cred.presentation.ui.states

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.shivam_agarwal_cred.R
import com.example.shivam_agarwal_cred.presentation.ui.composables.Button
import com.example.shivam_agarwal_cred.presentation.ui.composables.DisplayTextAndSubText
import com.example.shivam_agarwal_cred.presentation.ui.composables.HeaderAndSubHeaderText
import com.example.shivam_agarwal_cred.presentation.ui.composables.LoadImageFromDrawable
import com.example.shivam_agarwal_cred.presentation.ui.theme.GreySecond
import com.example.shivam_agarwal_cred.util.AppConstant

/**
 *This is parent view for second state with expended and collapse views
 */
@Composable
fun SecondState(viewStates: Int, onButtonClick: (state: Int) -> Unit) {

    val offsetY = remember { Animatable(1000f) }

    LaunchedEffect(Unit) {
        offsetY.animateTo(0f, animationSpec = tween(durationMillis = 300))
    }

    if (viewStates == 2) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(shape = RoundedCornerShape(16.dp, 16.dp))
                .offset(y = offsetY.value.dp)
        ) {
            SecondStateExpendedView(onButtonClick = {
                onButtonClick(it)
            })
        }

    } else if (viewStates == 3) {
        SecondStateCollapseView(onButtonClick = {
            onButtonClick(it)
        })
    }
}

/**
 *This is Collapse View of Second state
 */
@Composable
fun SecondStateCollapseView(onButtonClick: (state: Int) -> Unit) {
    //collapse view
    Row(
        modifier = Modifier
            .clip(shape = RoundedCornerShape(16.dp, 16.dp))
            .background(color = GreySecond)
            .clickable(onClick = {
                onButtonClick(2)
            })
    ) {

        Column(
            modifier = Modifier
                .weight(1f)
        ) {
            DisplayTextAndSubText(AppConstant.EMI, AppConstant.RS_4247_PER_MO)
        }
        Column(
            modifier = Modifier
                .weight(1f)
        ) {
            DisplayTextAndSubText(AppConstant.DURATION, AppConstant.MONTHS_12)
        }

        Column(
            modifier = Modifier
                .padding(0.dp, 24.dp, 10.dp, 0.dp)
        ) {
            Icon(
                imageVector = Icons.Default.KeyboardArrowDown,
                contentDescription = AppConstant.DOWN_ARROW,
                tint = Color.White
            )
        }
    }
}

/**
 *This is Expended View of Second state
 */
@Composable
fun SecondStateExpendedView(onButtonClick: (state: Int) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = GreySecond),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HeaderAndSubHeaderText(AppConstant.SECOND_STATE_HEADER, AppConstant.SECOND_STATE_SUB_HEADER)

        LoadImageFromDrawable(R.drawable.second_state_bg, modifier = Modifier.fillMaxWidth())

        Button(buttonText = AppConstant.SECOND_STATE_CTA_TEXT, onButtonClick = {
            onButtonClick(3)
        }
        )
    }
}
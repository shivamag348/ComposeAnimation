package com.example.shivam_agarwal_cred.presentation.ui.states

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.shivam_agarwal_cred.R
import com.example.shivam_agarwal_cred.presentation.ui.composables.Button
import com.example.shivam_agarwal_cred.presentation.ui.composables.HeaderAndSubHeaderText
import com.example.shivam_agarwal_cred.presentation.ui.composables.LoadImageFromDrawable
import com.example.shivam_agarwal_cred.presentation.ui.theme.GreyThird
import com.example.shivam_agarwal_cred.util.AppConstant

/**
 *This is parent view for third state in which only having expended view
 */
@Composable
fun ThirdState() {

    val offsetY = remember { Animatable(1000f) }

    LaunchedEffect(Unit) {
        offsetY.animateTo(0f, animationSpec = tween(durationMillis = 500))
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .clip(shape = RoundedCornerShape(16.dp, 16.dp))
            .offset(y = offsetY.value.dp)
    ) {
        ThirdStateExpendedView()
    }
}

/**
 *This is Expended View of third state
 */
@Composable
fun ThirdStateExpendedView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = GreyThird),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        HeaderAndSubHeaderText(AppConstant.THIRD_STATE_HEADER, AppConstant.THIRD_STATE_SUB_HEADER)

        LoadImageFromDrawable(R.drawable.third_state_bg, modifier = Modifier.fillMaxWidth())

        Button(buttonText = AppConstant.THIRD_STATE_CTA_TEXT, onButtonClick = {})
    }
}
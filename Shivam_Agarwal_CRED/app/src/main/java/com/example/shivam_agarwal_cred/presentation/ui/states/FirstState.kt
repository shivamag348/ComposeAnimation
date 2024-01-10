package com.example.shivam_agarwal_cred.presentation.ui.states

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.shivam_agarwal_cred.R
import com.example.shivam_agarwal_cred.presentation.ui.composables.Button
import com.example.shivam_agarwal_cred.presentation.ui.composables.DisplayTextAndSubText
import com.example.shivam_agarwal_cred.presentation.ui.composables.HeaderAndSubHeaderText
import com.example.shivam_agarwal_cred.presentation.ui.composables.LoadImageFromDrawable
import com.example.shivam_agarwal_cred.presentation.ui.theme.GreyFirst
import com.example.shivam_agarwal_cred.util.AppConstant

/**
 *This is parent view for first state with expended and collapse views
 */
@Composable
fun FirstState(
    viewStates: Int,
    onButtonClick: (state: Int) -> Unit,
) {

    Column(
        modifier = Modifier
            .background(color = GreyFirst)
            .fillMaxWidth()
    ) {

        if (viewStates == 1) {
            FirstStateExpendedView(onButtonClick = {
                onButtonClick(it)
            })
        } else {
            FirstStateCollapseView(onButtonClick = {
                onButtonClick(it)
            })
        }

    }


}

/**
 *This is Collapse View of first state
 */
@Composable
fun FirstStateCollapseView(onButtonClick: (state: Int) -> Unit) {
    //collapse view
    Row(
        modifier = Modifier
            .clip(shape = RoundedCornerShape(16.dp, 16.dp))
            .background(color = GreyFirst)
            .clickable(onClick = {
                onButtonClick(1)
            })
    ) {

        Column(
            modifier = Modifier
                .weight(1f)
        ) {
            DisplayTextAndSubText(AppConstant.CREDIT_AMOUNT, AppConstant.RS_150000)
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
 *This is Expended View of first state
 */
@Composable
fun FirstStateExpendedView(onButtonClick: (state: Int) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = GreyFirst)
            .clip(shape = RoundedCornerShape(16.dp, 16.dp)),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HeaderAndSubHeaderText(AppConstant.FIRST_STATE_HEADER, AppConstant.FIRST_STATE_SUB_HEADER)

        LoadImageFromDrawable(R.drawable.first_state_bg, modifier = Modifier.fillMaxWidth())

        Button(buttonText = AppConstant.FIRST_STATE_CTA_TEXT, onButtonClick = {
            onButtonClick(2)
        }
        )
    }
}
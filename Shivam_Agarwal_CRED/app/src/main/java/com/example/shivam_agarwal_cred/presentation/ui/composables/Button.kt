package com.example.shivam_agarwal_cred.presentation.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 *Reusable Component for Button View
 */
@Composable
fun Button(buttonText: String, onButtonClick: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth(1f)
            .height(60.dp)
            .clip(shape = RoundedCornerShape(12.dp))
            .background(Color.Blue)
            .clickable { onButtonClick() },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = buttonText,
            style = MaterialTheme.typography.bodyMedium,
            color = Color.White
        )
    }
}
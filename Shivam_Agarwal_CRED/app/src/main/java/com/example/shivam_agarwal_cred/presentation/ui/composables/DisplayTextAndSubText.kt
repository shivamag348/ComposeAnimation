package com.example.shivam_agarwal_cred.presentation.ui.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

/**
 *Reusable Component to show text and sub text of collapse views that is common for all states.
 */
@Composable
fun DisplayTextAndSubText(text: String, subText: String) {
    Column(
        modifier = Modifier
            .padding(16.dp, 20.dp, 0.dp, 20.dp)
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.bodySmall,
            color = Color.White,
            textAlign = TextAlign.Start
        )
        Text(
            text = subText,
            style = MaterialTheme.typography.bodyLarge,
            color = Color.White,
            textAlign = TextAlign.Start
        )
    }
}
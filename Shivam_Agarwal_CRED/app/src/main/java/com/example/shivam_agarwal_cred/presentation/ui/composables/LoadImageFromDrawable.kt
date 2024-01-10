package com.example.shivam_agarwal_cred.presentation.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource

/**
 *Reusable Component to Load Image from Drawable
 */
@Composable
fun LoadImageFromDrawable(drawableId: Int, modifier: Modifier) {
    val painter: Painter = painterResource(id = drawableId)
    Image(modifier = modifier, painter = painter, contentDescription = "Image from Drawable")
}
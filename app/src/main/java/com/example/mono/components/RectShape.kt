package com.example.mono.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mono.R

@Preview
@Composable
fun RectangleShape (){
    Box(modifier = Modifier
        .fillMaxSize()
        .drawBehind {
            val path = Path().apply {
                moveTo(0f, size.height * 0.8f) // Start from the bottom-left with shorter height
                lineTo(0f, 0.8f) // Move to top-left
                lineTo(size.width, 0f) // Move to top-right
                lineTo(size.width, size.height * 0.7f) // Move to bottom-right
                lineTo(0f, size.height * 0.6f) // Move back to the starting point
                close()
            }

            drawPath(
                path = path,
                color = Color(0xFFD3F7F3)
            )

        }){
        Image(painter = painterResource(id = R.drawable.roundcircle),
            contentDescription = "circle",
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(290.dp, 290.dp) )
    }
}
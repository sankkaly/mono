package com.example.mono.components
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mono.R
@Preview
@Composable
fun RectangleShape (){
    Box(contentAlignment = Alignment.TopCenter,
        modifier = Modifier
            .fillMaxWidth()
            .height(600.dp)
            .background(Color.White)){
        Image(painter = painterResource(id = R.drawable.bg), contentDescription = "bg",
            modifier = Modifier.fillMaxSize(),contentScale = ContentScale.FillWidth)
        Image(painter = painterResource(id = R.drawable.man),
            contentDescription = "man",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .size(300.dp, 400.dp)
                .align(Alignment.BottomCenter) )
        
    }
}
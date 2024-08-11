package com.example.mono.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mono.R


@Composable
fun Card(modifier: Modifier) {
    Column(modifier = modifier
        .padding(16.dp)
        .fillMaxWidth()
        .height(200.dp)
        .clip(RoundedCornerShape(16.dp))
        .background(Color(0xff1B5C58))
        .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween

    ) {
        Box (modifier = Modifier.fillMaxWidth()){
            Column {
                Text(text = "Total Balance",
                    style = TextStyle(
                    fontSize = 14.sp,
                    color = Color.White),
                    modifier = Modifier.padding(top = 5.dp)
                )
                Text(text = "₹ 500,000", style = TextStyle(
                    fontSize = 25.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold),
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            Image(painter = painterResource(id = R.drawable.dots_menu),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(top = 5.dp))
        }
        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween){
            Column(horizontalAlignment = Alignment.End) {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.ic_income),
                        contentDescription = null )
                    Spacer(modifier = Modifier.size(8.dp))
                    Text(
                        text = "Income",
                        style = TextStyle(
                            fontSize = 14.sp,
                            color = Color.White
                        )
                    )
                }
                Spacer(modifier = Modifier.size(5.dp))
                Text(
                    text = "₹ 200,000",
                    style = TextStyle(
                        fontSize = 16.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Medium
                    )
                )
            }
            Column(horizontalAlignment = Alignment.End) {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.ic_expense),
                        contentDescription = null )
                    Spacer(modifier = Modifier.size(8.dp))
                    Text(
                        text = "Expense",
                        style = TextStyle(
                            fontSize = 14.sp,
                            color = Color.White
                        )
                    )
                }
                Spacer(modifier = Modifier.size(5.dp))
                Text(
                    text = "₹ 200,000",
                    style = TextStyle(
                        fontSize = 16.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Medium
                    )
                )
            }
        }
    }
}

@Preview
@Composable
fun CardPreview(){
    Card(modifier = Modifier)
}
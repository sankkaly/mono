package com.example.mono.screens
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mono.components.RectangleShape

@Preview
@Composable
fun GetStarted (){
    val context = LocalContext.current
    Column (modifier = Modifier
        .fillMaxHeight()
        .background(Color.White),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally){
        RectangleShape()
        Column (modifier = Modifier.fillMaxHeight() ,verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Spend Smarter", style = TextStyle(
                Color(0xff438883), fontWeight = FontWeight.Bold, fontSize = 30.sp
            ))
            Text(text = "Save More",style = TextStyle(
                Color(0xff438883), fontWeight = FontWeight.Bold, fontSize = 30.sp
            ))
            Spacer(modifier = Modifier.height(12.dp))
            Button(onClick = {  },
                modifier = Modifier
                    .width(280.dp)
                    .height(50.dp)
                    .shadow(8.dp, RoundedCornerShape(20.dp),clip = true, Color(0xff438883)),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xff438883)
                )){
                Text(text = "Get Started",
                    style = TextStyle(
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
            Spacer(modifier = Modifier.height(16.dp))

            Row (horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth(0.47f)) {
                Text(text = "Already Have Account?",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W400
                    ))
                Text(text = "Log in",
                    modifier = Modifier.clickable { Toast.makeText(context,"button clicked",Toast.LENGTH_SHORT).show() },
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W400,
                        color = Color(0xff438883)
                    ))
            }


        }


    }


}
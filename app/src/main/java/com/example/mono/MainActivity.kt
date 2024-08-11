package com.example.mono

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mono.screens.GetStarted
import com.example.mono.screens.Login
import com.example.mono.screens.Register


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            Splash()
            MyApp()

        }
    }
}

@Composable
fun MyApp (){



    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "GetStarted") {
        composable("GetStarted"){
            GetStarted (
                navController
            )
        }
        composable("Login"){
            Login {
                navController.navigate("GetStarted")
            }
        }
        composable("Register"){
            Register {
                navController.navigate("GetStarted")
            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun Splash (){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF509994)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ){
        Text(
            text = "mono",
            color = Color.White,
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 45.sp,
            )
            )

    }
}




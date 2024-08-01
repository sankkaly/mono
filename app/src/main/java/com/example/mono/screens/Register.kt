package com.example.mono.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mono.R
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment



@Composable
fun Register(navigateToGetStarted: ()-> Unit){
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)) {
        Image(painter = painterResource(id = R.drawable.ellipse),
            contentDescription = null,
            modifier = Modifier
                .width(200.dp)
                .height(200.dp),
            contentScale = ContentScale.FillBounds)
        Column (modifier = Modifier.fillMaxSize()){
            Spacer(modifier = Modifier.height(90.dp))
            Column (modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp, 0.dp)){
                Text(text = "Create account!",
                    style = TextStyle(
                        Color(0xff169C89),
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Medium
                    )
                )
                Text(text = "Register to get started.",
                    style = TextStyle(
                        Color(0xFF969595),
                        fontSize = 16.sp
                    ))
            }
            Spacer(modifier = Modifier.height(30.dp))
            Column (horizontalAlignment = Alignment.Start,
                modifier = Modifier.fillMaxWidth()) {
                androidx.compose.material3.OutlinedTextField(
                    value = username,
                    onValueChange = { username = it },
                    label = { Text(text = "Name", color = Color(0xFF969595)) },
                    leadingIcon = { Icon(imageVector = Icons.Filled.AccountCircle, contentDescription = "email", tint = Color(0xFF969595) )},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp, 3.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xFF969595),
                        focusedBorderColor = Color(0xff169C89),
                        focusedLabelColor = Color(0xff169C89)
                    )
                )
                androidx.compose.material3.OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text(text = "Email", color = Color(0xFF969595)) },
                    leadingIcon = { Icon(imageVector = Icons.Filled.Email, contentDescription = "email", tint = Color(0xFF969595) )},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp, 3.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xFF969595),
                        focusedBorderColor = Color(0xff169C89),
                        focusedLabelColor = Color(0xff169C89)

                    )

                )
                androidx.compose.material3.OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text(text = "Password", color = Color(0xFF969595)) },
                    leadingIcon = { Icon(imageVector = Icons.Filled.Lock, contentDescription = "email", tint = Color(0xFF969595) )},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp, 3.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xFF969595),
                        focusedBorderColor = Color(0xff169C89),
                        focusedLabelColor = Color(0xff169C89)

                    )

                )
                androidx.compose.material3.OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text(text = "Confirm Password", color = Color(0xFF969595)) },
                    leadingIcon = { Icon(imageVector = Icons.Filled.Lock, contentDescription = "email", tint = Color(0xFF969595) )},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp, 3.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xFF969595),
                        focusedBorderColor = Color(0xff169C89),
                        focusedLabelColor = Color(0xff169C89)

                    )

                )
                Spacer(modifier = Modifier.height(10.dp))
                Column (modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 5.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally){
                    Row (modifier = Modifier
                        .padding(5.dp, 0.dp),
                        horizontalArrangement = Arrangement.SpaceAround){
                        Checkbox(checked = false,
                                onCheckedChange = {})

                        Text(text = "By registering, you are agreeing with our Terms of Use and Privacy Policy",
                            modifier = Modifier.padding(4.dp, 10.dp),
                            style = TextStyle(
                                color = Color(0xFF969595)
                            ))
                    }


                    Spacer(modifier = Modifier.height(10.dp))
                    androidx.compose.material3.Button(
                        onClick = {},
                        shape = RoundedCornerShape(7.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xff169C89)),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp)
                            .padding(12.dp, 0.dp)
                        ){
                        Text(text = "Register")
                    }
                }
                }

            }
        }

}


// navigateToGetStarted: ()-> Unit
//navigateToGetStarted()
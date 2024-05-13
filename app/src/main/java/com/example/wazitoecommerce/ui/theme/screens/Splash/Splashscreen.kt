package com.example.wazitoecommerce.ui.theme.screens.Splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.navigation.ROUTE_LOGIN
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavHostController){
    Column(modifier = Modifier
        .background(color = Color.LightGray )
        .fillMaxWidth()
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        )
    {
        Image(painter = painterResource(id = com.example.wazitoecommerce.R.drawable.help), contentDescription = "Help", modifier = Modifier.size(150.dp) )
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "Ready to Help!", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold, fontStyle = FontStyle.Italic)

        val coroutine = rememberCoroutineScope()
        coroutine.launch {
            delay(1000)
            navController.navigate(ROUTE_LOGIN)
        }



    }



}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())
}
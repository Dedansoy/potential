package com.example.wazitoecommerce.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){
    Column(modifier =
    Modifier.fillMaxSize()) {
        TopAppBar(title = {
            Text(text = "Welcome",
                fontSize = 50.sp,
                fontWeight = FontWeight.ExtraBold,
                fontStyle = FontStyle.Italic,
                color = Color.Black)

        }
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "INTRODUCTION:",
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(start = 10.dp)
        )

        Image(painter = painterResource(id = R.drawable.carrr), contentDescription = "CARR", modifier = Modifier
            .size(250.dp)
            .padding(start = 100.dp, top = 5.dp))
        Text(text = "Do you Have a Car Problem?", fontSize = 25.sp, modifier = Modifier.padding(start = 20.dp), fontWeight = FontWeight.ExtraBold)
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "RTSA is an Android App that is beneficial for Car Drivers whose Cars have breakdown while Travelling on Roads.RTSA is only Meant for help only in Nairobi Roads.Help is immeadiately served for the Drivers.We hope you Like Our Services.Better be Helped than Suffer!We offer Help to any type of Problems and we also offer Car Services.Click The Button Below to Continue.", fontSize = 15.sp)
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.navigate("issues")
        }, modifier = Modifier.padding(start = 130.dp)) {
            Text(text = "Issues")

        }





    }

}
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}
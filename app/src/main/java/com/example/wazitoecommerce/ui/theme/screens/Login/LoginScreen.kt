package com.example.wazitoecommerce

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.wazitoecommerce.data.AuthViewModel
import com.example.wazitoecommerce.navigation.ROUTE_HOME
import com.example.wazitoecommerce.navigation.ROUTE_SIGN


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavHostController){
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment =   Alignment.CenterHorizontally


    ) {
        Image(painter = painterResource(id =R.drawable.car ), contentDescription = "Car", modifier = Modifier.size(150.dp))
        Text(text = "Welcome Back", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Text(text = "Login to Your Account")
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = email, onValueChange = {
            email = it
        }, label = {
            Text(text = "Email Address")
        })
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = password, onValueChange = {
            password = it
        }, label = {
            Text(text = "Password")
        }, visualTransformation = PasswordVisualTransformation())
        Spacer(modifier = Modifier.height(5.dp))

        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)


        Button(onClick = {
            navController.navigate(ROUTE_HOME)
            authViewModel.login(email, password)
        }) {
            Text(text = "Login")
        }



        }
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "Forgot Your Password?", modifier = Modifier.clickable {

        })

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.navigate(ROUTE_SIGN)
        }) {
            Text(text = "Register Instead")

        }






    }








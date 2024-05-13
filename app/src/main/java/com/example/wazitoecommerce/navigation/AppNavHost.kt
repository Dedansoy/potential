package com.example.wazitoecommerce.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.LoginScreen
import com.example.wazitoecommerce.SignupScreen
import com.example.wazitoecommerce.ui.theme.screens.SIGN.SignScreen

import com.example.wazitoecommerce.ui.theme.screens.Splash.SplashScreen
import com.example.wazitoecommerce.ui.theme.screens.accident.AccidentScreen
import com.example.wazitoecommerce.ui.theme.screens.breakdown.BreakDownService
import com.example.wazitoecommerce.ui.theme.screens.home.HomeScreen
import com.example.wazitoecommerce.ui.theme.screens.issues.IssuesScreen
import com.example.wazitoecommerce.ui.theme.screens.services.ServicesScreen
import com.example.wazitoecommerce.ui.theme.screens.towing.TowingScreen
import com.google.firebase.database.collection.R

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = ROUTE_SPLASH
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(ROUTE_SPLASH){
            SplashScreen(navController = navController)
        }
        composable(ROUTE_LOGIN){
            LoginScreen(navController = navController)
        }
        composable(ROUTE_REGISTER){
            SignupScreen(navController = navController)
        }
        composable(ROUTE_SERVICES){
            ServicesScreen(navController = navController)
        }
        composable(ROUTE_ISSUES){
            IssuesScreen(navController = navController)
        }
        composable(ROUTE_ACCIDENT){
            AccidentScreen(navController = navController)
        }
        composable(ROUTE_HOME){
            HomeScreen(navController = navController)
        }

        composable(ROUTE_SIGN){
            SignScreen(navController = navController)
        }
        composable(ROUTE_TOWING){
            TowingScreen(navController = navController)
        }
        composable(ROUTE_BREAKDOWN){
            BreakDownService(navController = navController)
        }

    }
}
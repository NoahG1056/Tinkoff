package com.example.tinkoff.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun ApplicationScreen(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "profile") {
        composable("profile") {  }
        composable("friendslist") {  }
    }
}
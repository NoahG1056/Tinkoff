package com.example.tinkoff.ui.screens

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tinkoff.navigation.NavigationTree
import com.example.tinkoff.ui.screens.main.MainScreen
import com.example.tinkoff.ui.screens.splash.SplashScreen

@Composable
fun ApplicationScreen(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavigationTree.Splash.name) {
        composable(NavigationTree.Splash.name) { SplashScreen(navController) }
        composable(NavigationTree.Main.name) { MainScreen() }
    }
}
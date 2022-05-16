package com.example.tinkoff.ui.screens.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.tinkoff.navigation.NavigationTree
import com.example.tinkoff.ui.theme.Colors

@Composable
fun SplashScreen(navController: NavController){
    Box(Modifier.fillMaxSize().background()) {

    }
    LaunchedEffect(key1 = Unit, block = {
        navController.navigate(NavigationTree.Main.name)
    })
}
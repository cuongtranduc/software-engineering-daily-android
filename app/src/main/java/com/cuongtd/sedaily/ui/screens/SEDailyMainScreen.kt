package com.cuongtd.sedaily.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.cuongtd.hackernews.ui.navigation.SEDailyBottomNavigation
import com.cuongtd.sedaily.ui.navigation.SEDailyNavHost

//import androidx.navigation.compose.rememberNavController

@Composable
fun SEDailyMainScreen() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            SEDailyBottomNavigation(navController)
        },
    ) {
        Column(modifier = Modifier.padding(bottom = 58.dp)) {
            SEDailyNavHost(navController)
        }
    }
}
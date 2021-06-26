package com.cuongtd.sedaily.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import com.cuongtd.sedaily.ui.screens.FavoriteScreen
import com.cuongtd.sedaily.ui.screens.HomeScreen
import com.cuongtd.sedaily.ui.screens.ProfileScreen

@Composable
fun SEDailyNavHost(
    navController: NavHostController,
) {
    NavHost(navController, startDestination = Route.Home.route) {
        composable(Route.Home.route) {
            HomeScreen()
        }
        composable(Route.Favorite.route) {
            FavoriteScreen()
        }
        composable(Route.Profile.route) {
            ProfileScreen()
        }
    }
}
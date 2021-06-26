package com.cuongtd.sedaily.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.ViewModel
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.cuongtd.sedaily.R
import com.cuongtd.sedaily.ui.screens.FavoriteScreen
import com.cuongtd.sedaily.ui.screens.HomeScreen
import com.cuongtd.sedaily.ui.screens.ProfileScreen

sealed class Route(
    val route: String,
    val icon: Int,
    val content: @Composable (backStackEntry: NavBackStackEntry, viewModel: ViewModel) -> Unit
) {
    object Home :
        Route(
            "Home",
            R.drawable.ic_home,
            { backStackEntry, viewModel -> HomeScreen() })

    object Favorite :
        Route(
            "Saved",
            R.drawable.ic_favorite,
            { _, viewModel -> FavoriteScreen() })

    object Profile :
        Route(
            "Profile",
            R.drawable.ic_profile,
            { _, viewModel ->
                ProfileScreen()
            })

}

val BottomRoutes = listOf(
    Route.Home,
    Route.Favorite,
    Route.Profile,
)

@Composable
public fun currentRoute(navController: NavHostController): String? {
    return navController.currentBackStackEntry?.destination?.route
}
package com.cuongtd.hackernews.ui.navigation

import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.W500
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.cuongtd.sedaily.ui.navigation.BottomRoutes
import com.cuongtd.sedaily.ui.navigation.currentRoute

@Composable
fun SEDailyBottomNavigation(navController: NavHostController) {
    val currentRoute = currentRoute(navController)

    BottomNavigation(
        modifier = Modifier,
        backgroundColor = MaterialTheme.colors.background
    ) {
        BottomRoutes.forEach { item ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        painterResource(id = item.icon),
                        null,
                        tint = if (currentRoute == item.route)
                            MaterialTheme.colors.primary
                        else MaterialTheme.colors.secondary
                    )
                },
                label = {
                    Text(
                        text = item.route,
                        fontSize = 12.sp,
                        fontWeight = W500,
                        color = if (currentRoute == item.route)
                            MaterialTheme.colors.primary
                        else MaterialTheme.colors.secondary,
                    )
                },
                selected = currentRoute == item.route,
                onClick = {
                    if (currentRoute != item.route) {
                        navController.navigate(item.route)
                    }
                },
            )
        }
    }
}
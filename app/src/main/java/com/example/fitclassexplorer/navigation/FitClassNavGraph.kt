package com.example.fitclassexplorer.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.fitclassexplorer.ui.theme.screens.ClassDetailScreen
import com.example.fitclassexplorer.ui.theme.screens.HomeScreen


@Composable
fun FitClassNavGraph(
    navController: NavHostController = rememberNavController()
) {
    NavHost (
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(navController)
        }

        composable(
            route = "detail/{classId}",
            arguments = listOf(
                navArgument("classId") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val classId = backStackEntry.arguments?.getString("classId") ?: ""
            ClassDetailScreen(classId = classId)
        }
    }
}
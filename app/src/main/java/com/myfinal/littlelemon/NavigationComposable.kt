package com.myfinal.littlelemon

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Navigation(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Onboarding.route
    ) {

        composable(route = Onboarding.route) {

            Onboarding(navController = navController)
        }

        composable(route = Home.route) {

            HomeScreen(navController = navController)
        }


        composable(route = Profile.route) {

            ProfileScreen(navController = navController)
        }

    }

}
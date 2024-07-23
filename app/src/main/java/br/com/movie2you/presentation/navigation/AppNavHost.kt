package br.com.movie2you.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.movie2you.presentation.features.splash.SplashScreen
import br.com.movie2you.presentation.navigation.AppDestinations.Movies
import br.com.movie2you.presentation.navigation.AppDestinations.SplashRoute

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = SplashRoute
    ) {
        composable<SplashRoute> {
            SplashScreen(
                onAnimationFinished = {
                    navController.navigate(Movies) {
                        popUpTo<SplashRoute> { inclusive = true }
                    }
                }
            )
        }

        composable<Movies> {

        }
    }
}
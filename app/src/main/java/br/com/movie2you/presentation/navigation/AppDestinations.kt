package br.com.movie2you.presentation.navigation

import kotlinx.serialization.Serializable

sealed class AppDestinations {

    @Serializable
    object SplashRoute

    @Serializable
    object Movies
}
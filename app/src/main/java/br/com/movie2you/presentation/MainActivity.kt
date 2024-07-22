package br.com.movie2you.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import br.com.movie2you.presentation.features.splash.SplashScreen
import br.com.movie2you.presentation.ui.theme.Movie2YouTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Movie2YouTheme {
                SplashScreen()
            }
        }
    }
}
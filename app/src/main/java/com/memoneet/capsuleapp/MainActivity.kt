package com.memoneet.capsuleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import com.memoneet.capsuleapp.ui.theme.CapsuleAppTheme
import com.memoneet.capsuleapp.feature_capsule.presentation.CapsuleScreen
import com.memoneet.capsuleapp.feature_capsule.presentation.view_model.VideoScreenViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CapsuleAppTheme {
                val viewModel = hiltViewModel<VideoScreenViewModel>()
                CapsuleScreen(viewModel)
            }
        }
    }
}






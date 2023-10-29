package com.memoneet.capsuleapp.feature_capsule.presentation

import android.annotation.SuppressLint
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import com.memoneet.capsuleapp.feature_capsule.presentation.main_screen.TabLayoutPagerScreen
import com.memoneet.capsuleapp.feature_capsule.presentation.view_model.VideoScreenViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CapsuleScreen(viewModel: VideoScreenViewModel){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Blood")
                },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Rounded.ArrowBack,"")
                    }
                }
            )
        },
        content = {
            TabLayoutPagerScreen(viewModel)
        }
    )
}
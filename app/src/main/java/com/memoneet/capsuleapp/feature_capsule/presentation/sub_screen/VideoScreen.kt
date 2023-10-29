package com.memoneet.capsuleapp.feature_capsule.presentation.sub_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.hilt.navigation.compose.hiltViewModel
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.ui.PlayerView
import com.memoneet.capsuleapp.feature_capsule.presentation.sub_screen_component.NextScreen
import com.memoneet.capsuleapp.feature_capsule.presentation.view_model.VideoScreenViewModel

@Composable
fun VideoScreen(viewModel:VideoScreenViewModel){


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.fillMaxHeight(.80f),
            verticalArrangement = Arrangement.Center,
        ) {
            VideoPlayerFromUrl(videoUrl = viewModel.videoUrl )
        }
        Column(
            modifier = Modifier
                .padding(bottom = 8.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom
        ) {
            NextScreen("NCERT Lines","Read From NCERT Book")
        }


    }
}

@Composable
fun VideoPlayerFromUrl(videoUrl: String) {
    val context = LocalContext.current
    val exoPlayer = remember {
        SimpleExoPlayer.Builder(context).build().apply {
            setMediaItem(MediaItem.fromUri(videoUrl))
            prepare()
        }
    }

    DisposableEffect(Unit) {
        onDispose {
            exoPlayer.release()
        }
    }

    AndroidView(
        factory = { context ->
            PlayerView(context).apply {
                player = exoPlayer
            }
        },
        modifier = Modifier
            .height(200.dp)
            .width(350.dp)
    )
}
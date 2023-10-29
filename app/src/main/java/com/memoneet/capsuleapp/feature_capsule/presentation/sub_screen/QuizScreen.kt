package com.memoneet.capsuleapp.feature_capsule.presentation.sub_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.memoneet.capsuleapp.feature_capsule.presentation.sub_screen_component.NextScreen

@Composable
fun QuizScreen(){
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        Column(
            modifier = Modifier
                .padding(top = 16.dp, start = 8.dp)
                .fillMaxHeight(.80f)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Not set any quiz yet.")
        }
        Column(
            modifier = Modifier
                .padding(bottom = 8.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom
        ) {
            NextScreen("Quiz result","See you performance" )
        }


    }
}
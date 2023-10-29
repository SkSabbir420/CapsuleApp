package com.memoneet.capsuleapp.feature_capsule.presentation.sub_screen_component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun NextScreen(title: String,content: String){
    Column(modifier = Modifier.fillMaxWidth() ) {
        Text(text = "Up Next:")
        ThreeComponent(title = title, content = content)
    }
}
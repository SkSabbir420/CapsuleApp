package com.memoneet.capsuleapp.feature_capsule.presentation.sub_screen_component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.memoneet.capsuleapp.ui.theme.Purple40

@Composable
fun ThreeComponent(title:String,content:String){
    Row(modifier = Modifier
        .padding(start = 4.dp, end = 4.dp, top = 4.dp)
        .clip(shape = RoundedCornerShape(8.dp))
        .background(color = Purple40)
        .fillMaxWidth()
        .height(68.dp)

        ,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier
                .padding(start = 4.dp)
                .fillMaxWidth(.9f)
        ) {
            Text(text = title, fontSize = 16.sp)
            Text(text = content, fontSize = 14.sp)
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Rounded.KeyboardArrowRight,"")
        }
    }
}

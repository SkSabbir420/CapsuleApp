package com.memoneet.capsuleapp.feature_capsule.presentation.main_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.memoneet.capsuleapp.feature_capsule.presentation.sub_screen.NotesScreen
import com.memoneet.capsuleapp.feature_capsule.presentation.sub_screen.QuizScreen
import com.memoneet.capsuleapp.feature_capsule.presentation.sub_screen.TempScreen
import com.memoneet.capsuleapp.feature_capsule.presentation.sub_screen.VideoScreen
import com.memoneet.capsuleapp.feature_capsule.presentation.view_model.VideoScreenViewModel


@OptIn(ExperimentalPagerApi::class)
@Composable
fun TabLayoutPagerScreen(viewModel: VideoScreenViewModel){

    var selectedPage = rememberPagerState()
    val tabs = listOf("Video", "Notes","Quiz","Result")

    Column(modifier = Modifier.padding(top = 50.dp), verticalArrangement = Arrangement.Top ){

        TabRow(selectedTabIndex = selectedPage.currentPage) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    text = { Text(text = title) },
                    selected = index == selectedPage.currentPage,
                    onClick = {
//                        selectedPage = index
                    }
                )
            }
        }
        HorizontalPager(
            count = tabs.size,
            state = selectedPage
        ) {page ->
            when(page){
                0 ->  VideoScreen(viewModel)
                1 ->  NotesScreen()
                2 ->  QuizScreen()
                3 ->  TempScreen(pageContent = "Your Score: 00")
            }
        }


    }


}
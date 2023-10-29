package com.memoneet.capsuleapp.feature_capsule.presentation.view_model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.memoneet.capsuleapp.feature_capsule.domain.use_case.GetVideoUrl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class VideoScreenViewModel @Inject constructor(private val getVideoUrl: GetVideoUrl): ViewModel(){
    var videoUrl by mutableStateOf("")

    init {
        viewModelScope.launch{
            videoUrl = getVideoUrl()
        }

    }
}
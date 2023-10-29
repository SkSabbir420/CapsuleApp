package com.memoneet.capsuleapp.feature_capsule.domain.use_case

import com.memoneet.capsuleapp.feature_capsule.domain.repository.VideoRepository
import javax.inject.Inject


class GetVideoUrl @Inject constructor(private val videoRepository: VideoRepository){

    operator  fun invoke(): String {
        return videoRepository.getVideoUrl()
    }

}
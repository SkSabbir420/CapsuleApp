package com.memoneet.capsuleapp.feature_capsule.data.repository

import com.memoneet.capsuleapp.feature_capsule.domain.repository.VideoRepository
import javax.inject.Inject

class VideoRepositoryImp @Inject constructor(
    private val videoUrlApi: String
    ):VideoRepository {
    override fun getVideoUrl(): String {
        return videoUrlApi
    }
}
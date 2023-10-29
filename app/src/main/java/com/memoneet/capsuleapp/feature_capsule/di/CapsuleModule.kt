package com.memoneet.capsuleapp.feature_capsule.di

import com.memoneet.capsuleapp.feature_capsule.constant.CapsuleConstant
import com.memoneet.capsuleapp.feature_capsule.data.repository.VideoRepositoryImp
import com.memoneet.capsuleapp.feature_capsule.domain.repository.VideoRepository
import com.memoneet.capsuleapp.feature_capsule.domain.use_case.GetVideoUrl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CapsuleModule {

    @Provides
    @Singleton
    fun ProvideVideoUrlApi(): String{
        return CapsuleConstant.VIDEO_URL
    }

    @Provides
    @Singleton
    fun ProvideVideoUrl(videoUrlApi:String):VideoRepository{
        return VideoRepositoryImp(videoUrlApi)
    }

    @Provides
    @Singleton
    fun ProvideGetVideoUrlUseCase(videoRepository: VideoRepository):GetVideoUrl{
        return GetVideoUrl(videoRepository)
    }

}
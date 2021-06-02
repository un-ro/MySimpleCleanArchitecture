package com.unero.mysimplecleanarchitecture.di

import com.unero.mysimplecleanarchitecture.data.IMessageDataSource
import com.unero.mysimplecleanarchitecture.data.MessageDataSource
import com.unero.mysimplecleanarchitecture.data.MessageRepository
import com.unero.mysimplecleanarchitecture.domain.IMessageRepository
import com.unero.mysimplecleanarchitecture.domain.MessageInteractor
import com.unero.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}
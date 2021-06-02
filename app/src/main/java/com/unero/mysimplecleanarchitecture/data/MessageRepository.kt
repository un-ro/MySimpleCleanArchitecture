package com.unero.mysimplecleanarchitecture.data

import com.unero.mysimplecleanarchitecture.domain.IMessageRepository
import com.unero.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource): IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity {
        return messageDataSource.getMessageFromSource(name)
    }
}
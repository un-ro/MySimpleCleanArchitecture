package com.unero.mysimplecleanarchitecture.data

import com.unero.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}
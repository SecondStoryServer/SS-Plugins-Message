package com.github.syari.ss.wplugins.core.pluginMessage.template

import com.google.common.io.ByteArrayDataInput
import com.google.common.io.ByteArrayDataOutput

interface PluginMessageTemplate {
    companion object {
        const val ChannelName = "ss:pipe"

        fun readFrom(dataInput: ByteArrayDataInput): PluginMessageTemplate? {
            return when(dataInput.readUTF().toLowerCase()) {
                else -> null
            }
        }
    }

    val subChannel: String

    fun writeTo(dataOutput: ByteArrayDataOutput)
}
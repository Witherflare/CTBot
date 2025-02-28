package com.chattriggers.bot.messages

import com.chattriggers.bot.CTBot
import com.jessecorbett.diskord.api.rest.client.ChannelClient
import com.jessecorbett.diskord.dsl.footer
import com.jessecorbett.diskord.util.sendMessage
import io.ktor.util.KtorExperimentalAPI
import java.time.ZoneOffset
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

@KtorExperimentalAPI
suspend fun ChannelClient.linkMessage(username: String) {
    sendMessage("") {
        title = "Links"

        description = """
            [CT Website](https://www.chattriggers.com/)
            [CT Modules](https://www.chattriggers.com/modules)
            [Learn JavaScript](https://www.w3schools.com/js/)
            [CT GitHub Repo](https://github.com/ChatTriggers/ChatTriggers)
            [CT GitHub Organization](https://github.com/ChatTriggers)
        """.trimIndent()

        footer("Query by $username")
        timestamp = ZonedDateTime.now(ZoneOffset.UTC)
            .format(DateTimeFormatter.ISO_INSTANT)
        color = CTBot.MESSAGE_COLOR
    }
}
package com.rs2.integrations.discord.commands;

import com.rs2.GameConstants;
import org.javacord.api.entity.message.Message;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class Issues implements MessageCreateListener {
    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        Message message = event.getMessage();
        if (message.getContent().equalsIgnoreCase("::w" + GameConstants.WORLD + " issues") || message.getContent().equalsIgnoreCase("::w" + GameConstants.WORLD + " bugs")) {
            event.getChannel().sendMessage("https://github.com/2006-Scape/2006Scape/issues");
        }
    }
}

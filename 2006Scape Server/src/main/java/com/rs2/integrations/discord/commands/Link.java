package com.rs2.integrations.discord.commands;

import org.javacord.api.entity.message.Message;
import org.javacord.api.entity.user.User;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class Link implements MessageCreateListener {
    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        Message message = event.getMessage();
        if (message.getContent().equalsIgnoreCase("::link")) {
            event.getChannel().sendMessage(message.getAuthor().asUser().get().getMentionTag() + ", Please check your DM's to continue.");
            message.getAuthor().asUser().get().sendMessage("Please copy/paste the following in-game to link your Discord account: \n ```::link " + message.getAuthor().asUser().get().getIdAsString() + "```");
        }
    }
}
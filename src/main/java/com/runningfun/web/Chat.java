package com.runningfun.web;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("chat")
@SessionScoped
public class Chat implements Serializable {

    private List<ChatMessage> chatMessageList = new ArrayList<>();

    {
        chatMessageList.add(new ChatMessage("Hello 1st msg", "Author Stefan"));
        chatMessageList.add(new ChatMessage("Hello 2nd msg", "Author Stefan"));

        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setAuthor("Stefan");
        chatMessage.setText("sdksfd");
        chatMessageList.add(chatMessage);
    }

    public Chat() {
    }

    public List<ChatMessage> getChatMessageList() {
        return chatMessageList;
    }

    public void setChatMessageList(List<ChatMessage> chatMessageList) {
        this.chatMessageList = chatMessageList;
    }
}
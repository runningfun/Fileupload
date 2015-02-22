package com.runningfun.web;

/**
 * Created by Stefan on 22.02.2015.
 */
public class ChatMessage {

    String text;
    String author;

    public ChatMessage() {
    }

    public ChatMessage(String text, String author) {
        this.text = text;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

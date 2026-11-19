/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author itumelengteffo
 */
package com.mycompany.poepart3;

public class Message {
    private final String sender;
    private final String recipient;
    private final String messageContent;
    private String flag;
    private final String messageId;
    private final String messageHash;

    public Message(String sender, String recipient, String messageContent, String flag, String messageId, String messageHash) {
        this.sender = sender;
        this.recipient = recipient;
        this.messageContent = messageContent;
        this.flag = flag;
        this.messageId = messageId;
        this.messageHash = messageHash;
    }

    public String getSender() { return sender; }
    public String getRecipient() { return recipient; }
    public String getMessageContent() { return messageContent; }
    public String getFlag() { return flag; }
    public String getMessageId() { return messageId; }
    public String getMessageHash() { return messageHash; }
    public void setFlag(String flag) { this.flag = flag; }
}

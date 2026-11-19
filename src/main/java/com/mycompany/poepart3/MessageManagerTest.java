/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poepart3;

/**
 *
 * @author itumelengteffo
 */
package com.mycompany.poepart3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import org.junit.Test;

public class MessageManagerTest {

    @Test
    public void testSentMessagesArrayCorrectlyPopulated() {
        MessageManager m = new MessageManager();
        m.populateTestData();
        assertEquals(2, m.sentMessages.size());
        assertEquals("Did you get the cake?", m.sentMessages.get(0).getMessageContent());
        assertEquals("It is dinner time !", m.sentMessages.get(1).getMessageContent());
    }

    @Test
    public void testDisplayLongestMessage() {
        MessageManager m = new MessageManager();
        m.populateTestData();
        String expected = "Where are you? You are late! I have asked you to be on time.";
        assertEquals(expected, m.displayLongestStoredMessage());
    }

    @Test
    public void testSearchForMessageID() {
        MessageManager m = new MessageManager();
        m.populateTestData();
        assertEquals("It is dinner time !", m.searchMessageTextByID("0838884567"));
    }

    @Test
    public void testSearchAllMessagesByRecipient() {
        MessageManager m = new MessageManager();
        m.populateTestData();
        String result = m.searchMessagesByRecipient("+27838884567");
        assertTrue(result.contains("Where are you? You are late! I have asked you to be on time."));
        assertTrue(result.contains("Ok, I am leaving without you."));
    }

    @Test
    public void testDeleteMessageUsingHash() {
        MessageManager m = new MessageManager();
        m.populateTestData();
        String hashToDelete = m.messageHashes.get(1);
        String result = m.deleteMessageByHash(hashToDelete);
        String expected = "Message: \"Where are you? You are late! I have asked you to be on time.\" successfully deleted.";
        assertEquals(expected, result);
    }

    @Test
    public void testDisplayReport() {
        MessageManager m = new MessageManager();
        m.populateTestData();
        String report = m.displayReport();
        assertTrue(report.contains("Message Hash"));
        assertTrue(report.contains("Recipient"));
        assertTrue(report.contains("Message"));
        assertTrue(report.contains("Did you get the cake?"));
        assertTrue(report.contains("It is dinner time !"));
    }
}

    
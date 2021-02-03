package com.iriand.email;

/**
 * Created By Khilendra Sahu
 * 1/1/21 10:56 PM
 */
public interface Email {
    void send(String from, String[] recipientsTo, String[] recipientsCC, String[] recipientsBCC, String subject, String body, String[] files);
}

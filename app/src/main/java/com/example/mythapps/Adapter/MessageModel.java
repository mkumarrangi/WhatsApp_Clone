package com.example.mythapps.Adapter;

public class MessageModel {
    String id, message,massageId;
    Long timestamp;

    public MessageModel(String id, String message, Long timestamp) {
        this.id = id;
        this.message = message;
        this.timestamp = timestamp;
    }

    public MessageModel(String id, String message) {
        this.id = id;
        this.message = message;
    }

    public MessageModel(String id, String message, String massageId, Long timestamp) {
        this.id = id;
        this.message = message;
        this.massageId = massageId;
        this.timestamp = timestamp;
    }

    public MessageModel() {
    }

    public String getMassageId() {
        return massageId;
    }

    public void setMassageId(String massageId) {
        this.massageId = massageId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}

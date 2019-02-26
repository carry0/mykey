package com.example.workday.activity;

import lombok.Data;

@Data
public class base {
    String string;
    private String EventbusMessage;

    public base(String message) {
        this.EventbusMessage = message;

    }

    public String getEventbusMessage() {
        return EventbusMessage;
    }

    public void setEventbusMessage(String eventbusMessage) {
        EventbusMessage = eventbusMessage;
    }
}

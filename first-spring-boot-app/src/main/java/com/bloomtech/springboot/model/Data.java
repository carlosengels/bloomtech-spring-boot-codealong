package com.bloomtech.springboot.model;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.Objects;

// This class will hold the data being sent in an HTTP request
// POJO is normally used in HTTP request (a POJO has data, constructors, standard getters&setters, toString()
// equals(). hashCode())
public class Data {
    String sendData; // data to send with request

    public Data() { //Always have a default constructor for a POJO in case Java needs it
    }

    public Data(String sendData) {
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }

    public void setSendData(String sendData) {
        this.sendData = sendData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Data data)) return false;
        return getSendData().equals(data.getSendData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSendData());
    }

    @Override
    public String toString() {
        return "Data{" +
                "sendData='" + sendData + '\'' +
                '}';
    }
}

package com.proyecto.microservicio2.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class DefaultResponseDto {
    private int code;
    private String message;
    private Instant timestamp;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }


}

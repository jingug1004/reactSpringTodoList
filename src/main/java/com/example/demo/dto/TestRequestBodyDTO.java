package com.example.demo.dto;

import lombok.Data;

@Data
public class TestRequestBodyDTO<T> {
    private int id;
    private String message;
}

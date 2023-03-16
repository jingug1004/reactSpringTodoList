package com.example.demo.feigntest2.dto;

import lombok.Data;

@Data
public class Issue {
    String title;
    String body;
    String milestone;
    String repository_url;
}
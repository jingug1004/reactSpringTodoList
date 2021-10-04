package com.example.demo.model;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoEntity {

    private String id;
    private String userId;
    private String title;
    private boolean done;
}

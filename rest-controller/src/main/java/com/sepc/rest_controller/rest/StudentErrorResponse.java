package com.sepc.rest_controller.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentErrorResponse {
    private int status;
    private String message;
    private long timestamp;
}

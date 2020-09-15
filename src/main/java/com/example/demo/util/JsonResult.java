package com.example.demo.util;

import lombok.Data;

@Data
public class JsonResult {

    public int success;
    public Object content;
    public String errorMessage;

    public JsonResult(int success) {
        this.success = success;
    }
}

package com.example.sharedlibrary;


import lombok.Data;


@Data
public class Hello {

    public String hello() {
        return "Hello";
    }
}

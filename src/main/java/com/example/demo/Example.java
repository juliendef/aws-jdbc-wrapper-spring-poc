package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Example {

    private Long id;
    private String name;

    @Override
    public String toString() {
        return "Example{" +
                "name=" + name +
                ", id='" + id +
                '}';
    }
}


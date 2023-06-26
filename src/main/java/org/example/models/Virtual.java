package org.example.models;

import java.time.LocalDate;

public class Virtual extends Product {
    private String code;
    private LocalDate expirationDate;

    public Virtual(String name, double age, String code, LocalDate expirationDate) {
        super(name, age);
        this.code = code;
        this.expirationDate = expirationDate;
    }
}

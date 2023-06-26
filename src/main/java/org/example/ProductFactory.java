package org.example;

import org.example.models.Product;
import org.example.models.Real;
import org.example.models.Virtual;

import java.time.LocalDate;

public class ProductFactory {
    // Product Real class additional fields: size, weight
    public static Product createRealProduct(String name, double price, double size, double weight) {
        return new Real(name, price, size, weight);
    }

    // Product Virtual class additional fields: code, expiration date
    public static Product createVirtualProduct(String name, double price, String code, LocalDate expirationDate) {
        return new Virtual(name, price, code, expirationDate);
    }
}

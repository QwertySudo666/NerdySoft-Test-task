package org.example.models;

public class Real extends Product {
    private double size;
    private double weight;

    public Real(String name, double age, double size, double weight) {
        super(name, age);
        this.size = size;
        this.weight = weight;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

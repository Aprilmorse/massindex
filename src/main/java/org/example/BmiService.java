package org.example;

class BmiService {
    private final double weight;
    private final double height;

    public BmiService(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double calculate() {
        return weight / (Math.pow(height, 2));
    }
}
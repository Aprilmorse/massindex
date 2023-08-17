package org.example;

public class Main {
    public static void main(String[] args) {
        org.example.BmiService bmiService = new org.example.BmiService (98, 1.87);
        int result = (int) bmiService.calculate();
        System.out.println("Индекс массы тела:" + result);
    }
}
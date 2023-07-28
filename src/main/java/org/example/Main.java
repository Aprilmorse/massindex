package org.example;

public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService(98, 1.87);
        int result = (int) bmiService.calculate();
        System.out.println("Индекс массы тела:" + result);
    }
}
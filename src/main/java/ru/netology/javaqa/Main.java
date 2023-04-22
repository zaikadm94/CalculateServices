package ru.netology.javaqa;

public class Main {
    public static void main(String[] args) {
        CalculateServices services = new CalculateServices();
        int result = services.calculate(10_000, 60_000, 20_000);
        System.out.println(result);
    }
}
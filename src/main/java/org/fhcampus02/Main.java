package org.fhcampus02;

public class Main {
    public static void main(String[] args) {
        BMICalculator bmiCalculator = new BMICalculator(
                "Niklas",
                "Scharfy",
                176,
                78,
                'm'
        );

        System.out.println(bmiCalculator.calculateBMI());
    }
}
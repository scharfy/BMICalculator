package org.fhcampus02;

public class Main {
    public static void main(String[] args) {
        BMICalculator bmiCalculator = new BMICalculator(
                "Niklas Balthasar",
                "Scharfy",
                176,
                78,
                'm'
        );

        System.out.println(
                bmiCalculator.getFirstname() + " " + bmiCalculator.getLastname() + " hat " + bmiCalculator.getBMICategoryName() + ". :("
        );
    }
}

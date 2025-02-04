package org.fhcampus02;

public class BMICalculator {
    private String firstname;
    private String lastname;
    private int bodyHeight;
    private double bodyWeight;
    private char gender;

    public BMICalculator(String firstname, String lastname, int bodyHeight, double bodyWeight, char gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.bodyHeight = bodyHeight;
        this.bodyWeight = bodyWeight;
        this.gender = gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getBodyHeight() {
        return bodyHeight;
    }

    public double getBodyWeight() {
        return bodyWeight;
    }

    public char getGender() {
        return gender;
    }

    public void setBodyHeight(int bodyHeight) {
        this.bodyHeight = bodyHeight;
    }

    public void setBodyWeight(double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    public double calculateBMI() {
        return Math.round((this.getBodyWeight() / Math.pow(this.bodyHeight / 100.0, 2)) * 100.0) / 100.0;
    }

    public int calculateBMICategory() {
        double bmi = calculateBMI();
        char gender = this.getGender();

        if (gender == 'M' || gender == 'm') {
            if (bmi < 16.0) return -2;
            if (bmi >= 16.0 && bmi <= 18.4) return -1;
            if (bmi >= 18.5 && bmi <= 24.9) return 0;
            if (bmi >= 25.0 && bmi <= 34.9) return 1;
            return 2;
        } else if (gender == 'W' || gender == 'w') {
            if (bmi < 15.0) return -2;
            if (bmi >= 15.0 && bmi <= 17.4) return -1;
            if (bmi >= 17.5 && bmi <= 23.9) return 0;
            if (bmi >= 24.0 && bmi <= 33.9) return 1;
            return 2;
        }

        throw new IllegalArgumentException("Das Geschlecht " + gender + " wurde nicht gefunden. w oder m auswählen!");
    }

    public String getBMICategoryName() {
        int category = calculateBMICategory();

        return switch (category) {
            case -2 -> "Sehr starkes Untergewicht";
            case -1 -> "Untergewicht";
            case 0 -> "Normalgewicht";
            case 1 -> "Übergewicht";
            case 2 -> "Sehr starkes Übergewicht";
            default -> "Unbekannte BMI Kategorie";
        };
    }
}

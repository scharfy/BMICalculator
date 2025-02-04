package org.fhcampus02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    @Test
    void testConstructorInitialization() {
        BMICalculator bmiCalculator = new BMICalculator("Niklas", "Scharfy", 176, 78, 'm');

        assertEquals("Niklas", bmiCalculator.getFirstname(), "Vorname stimmt nicht");
        assertEquals("Scharfy", bmiCalculator.getLastname(), "Nachname stimmt nicht");
        assertEquals(176, bmiCalculator.getBodyHeight(), "Körpergröße stimmt nicht");
        assertEquals(78.0, bmiCalculator.getBodyWeight(), "Körpergewicht stimmt nicht");
        assertEquals('m', bmiCalculator.getGender(), "Geschlecht stimmt nicht");
    }

    @Test
    void calculateBMI() {
        BMICalculator bmiCalculator = new BMICalculator("Max", "Mustermann", 170, 70, 'm');
        assertEquals(24.22, bmiCalculator.calculateBMI());

        BMICalculator bmiCalculator2 = new BMICalculator("Max", "Mustermann", 180, 120, 'm');
        assertEquals(37.04, bmiCalculator2.calculateBMI());
    }

    @Test
    void calculateBMICategory() {
    }

    @Test
    void getBMICategoryName() {
    }
}
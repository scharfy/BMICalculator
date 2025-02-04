package org.fhcampus02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    public BMICalculator bmiCalculator;

    @BeforeEach
    void setUp() {
        this.bmiCalculator = new BMICalculator("Niklas", "Scharfy", 176, 78, 'm');
    }

    @Test
    void testConstructorInitialization() {
        assertEquals("Niklas", bmiCalculator.getFirstname(), "Vorname stimmt nicht");
        assertEquals("Scharfy", bmiCalculator.getLastname(), "Nachname stimmt nicht");
        assertEquals(176, bmiCalculator.getBodyHeight(), "Körpergröße stimmt nicht");
        assertEquals(78.0, bmiCalculator.getBodyWeight(), "Körpergewicht stimmt nicht");
        assertEquals('m', bmiCalculator.getGender(), "Geschlecht stimmt nicht");
    }

    @Test
    void calculateBMI() {
    }

    @Test
    void calculateBMICategory() {
    }

    @Test
    void getBMICategoryName() {
    }
}
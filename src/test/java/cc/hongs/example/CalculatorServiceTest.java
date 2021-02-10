package cc.hongs.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceTest {

    @Test
    void calculateAdditionTest() {
        Calculation calculation = new Addition();
        final int actual = calculation.calculate(1, 1);
        assertEquals(2, actual);
    }

    @Test
    void calculateSubtractionTest() {
        Calculation calculation = new Subtraction();
        final int actual = calculation.calculate(1, 1);
        assertEquals(0, actual);
    }

    @Test
    void calculateMultiplicationTest() {
        Calculation calculation = new Multiplication();
        final int actual = calculation.calculate(1, 1);
        assertEquals(1, actual);
    }

    @Test
    void calculateDivisionTest() {
        Calculation calculation = new Division();
        final int actual = calculation.calculate(8, 4);
        assertEquals(2, actual);
    }
}

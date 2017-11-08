package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenFirstMinusSecondThen() {
        Calculator calc = new Calculator();
        calc.minus(10, 6);
        double result = calc.getResult();
        double expected = 4;
        assertThat(result, is(expected));
    }

    @Test
    public void whenFirstMultiplySecondThen() {
        Calculator calc = new Calculator();
        calc.multiply(5, 100);
        double result = calc.getResult();
        double expected = 500;
        assertThat(result, is(expected));
    }

    @Test
    public void whenFirstDivideSecondThen() {
        Calculator calc = new Calculator();
        calc.divide(1, 2);
        double result = calc.getResult();
        double expected = 0.5;
        assertThat(result, is(expected));
    }
}
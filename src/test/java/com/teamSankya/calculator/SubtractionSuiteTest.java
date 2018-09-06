package com.teamSankya.calculator;

import org.junit.Test;

import junit.framework.TestCase;

public class SubtractionSuiteTest {
@Test
public void subtractIntTest() {
Subtraction subtraction = new Subtraction();
TestCase.assertEquals(-10, subtraction.subtract(20, 30));
}


@Test
public void subtractDoubleTest() {
Subtraction subtraction = new Subtraction();
TestCase.assertEquals(-10.0,subtraction.subtraction(20.5, 30.5));
}
}


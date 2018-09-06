package com.teamSankya.calculator;

import org.junit.Test;


import junit.framework.TestCase;

public class AdditionSuiteTest {

	@Test
public void addIntTest() {
Addition addition = new Addition();
TestCase.assertEquals(50, addition.add(20, 30));
}

@Test
public void addDoubleTest() {
Addition addition = new Addition();
TestCase.assertEquals(51.0, addition.add(20.8, 30.2));
}
}



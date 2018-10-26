package com.realdolmen.bestPracticesTesting;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import javax.inject.Inject;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Inject
    Calculator calculator;

    @Test
    public void addPositivesSuccesTest(){
        Assert.assertEquals("111.1100", calculator.add("100","11.11"));

    }

    @Test
    public void addNegativesSuccesTest(){
        Assert.assertEquals("-111.1100", calculator.add("-100","-11.11"));

    }

    @Test
    public void addNegativeToPositiveSuccesTest(){
        Assert.assertEquals("100.0000", calculator.add("111.11","-11.1100"));
    }

    @Test
    public void addPositiveToNegativeSuccesTest() {
        Assert.assertEquals("-100.0000", calculator.add("-111.11","11.1100"));
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void givingTooMuchDecimalsLogsMessage(){
       calculator.add("-111.11","11.111111");

    }

    @Test(expected = NumberFormatException.class)
    public void givingNonNumbersGivesErrorMessage(){
        calculator.add("-aa.11","11.111111");
    }

    @Test
    public void givingNullGivesErrorMessage(){
        calculator.add("-111.11","11.111111");

    }

    @Test(expected = NumberFormatException.class)
    public void givingEmptyNumbersReplacedByZero(){
        Assert.assertEquals("100.0000", calculator.add("100",""));
    }



}

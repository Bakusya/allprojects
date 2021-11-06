package tests;


import methods.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {

    Calculator calculator = new Calculator();

    @Test
    public void testMyCalculator(){


        int actualResult = calculator.add(2,2);
        Assert.assertEquals("The result is", 4,actualResult);
    }

}

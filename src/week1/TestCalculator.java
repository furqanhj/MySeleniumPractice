package week1;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {

    //JUnit - Java unit Testing Framework


    int num1 = 10;
    int num2 = 6;

    @Test
    public void testDoAddition(){
        int expectedResult= 10;
        int actualResult = doAddition(num1, num2);

        Assert.assertEquals("TEST FAILED ! - Test Case #1", expectedResult, actualResult);
    }

    @Test
    public void testDoSubtraction(){
        int expectedResult = 10;
        int actualResult = doSubtraction(num1, num2);

        Assert.assertEquals("TEST FAILED - Test Case #2", expectedResult, actualResult);
    }

    @Test
    public void testDoMultiplication(){
        int expectedResult = 10;
        int actualResult = doMultiplication(num1, num2);

        Assert.assertEquals("TEST FAILED ! - Test Case #3", expectedResult, actualResult);
    }

    public int doAddition(int x, int y){
        return x + y;
    }

    public int doSubtraction(int x, int y){
        return x - y;
    }

    public int doMultiplication(int x, int y){
        return x * y;
    }

}

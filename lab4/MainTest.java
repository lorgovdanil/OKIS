package org.example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.example.Main.*;

public class MainTest {
    @Test
    public void testHeightTriangle26() {
        final int number1 = 3;
        final int number2 = 4;
        final double expectedResult = 2.4;
        double actualResult;

        actualResult = HeightTriangle26(number1, number2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testHeightMeter36() {
        final double number1 = 10;
        final double number2 = 5.9742;
        final double number3 = 6378000;
        final double expectedResult = 5.1;
        double actualResult;

        actualResult = HeightMeter36(number1, number2, number3);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMultHeightTriangle37() {
        final double number1 = 3;
        final double number2 = 4;
        final double number3 = 5;
        final double expectedResult = 28.8;
        double actualResult;

        actualResult = MultHeightTriangle37(number1, number2, number3);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @DataProvider(name = "testData")
    public Object[][] createData() {
        return new Object[][]{
                {1, -3, 2, new double[]{1.0, 2.0}},
                {1, -2, 1, new double[]{1.0, 1.0}},
                {1, -1, -6, new double[]{-2.0, 3.0}},
                {1, 0, -4, new double[]{-2.0, 2.0}},
                {1, 2, 1, new double[]{-1.0, -1.0}}
        };
    }

    @Test(dataProvider = "testData")
    public void testSquare55(double A, double B, double C, double[] expected) {
        double[] actualResult = Square55(A, B, C);
        Assert.assertEquals(actualResult, expected);
    }

    @Test
    public void testBall80() {
        final double number1 = 100;
        final double number2 = 2;
        final double expectedResult = 12.4;
        double actualResult;

        actualResult = Ball80(number1, number2);

        Assert.assertEquals(actualResult, expectedResult);
    }
}

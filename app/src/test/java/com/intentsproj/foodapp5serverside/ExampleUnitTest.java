package com.intentsproj.foodapp5serverside;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void testGetDiscountedPrice() {
        String price = "200";
        String discount = "10";
        Food food = new Food(price, discount);

        String expectedValue = "190.0";
        String actualValue = food.getDiscountedPrice();

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetDiscountedPriceParseError() {
        String price = "200a";
        String discount = "10";
        Food food = new Food(price, discount);

        String expectedValue = "parse error";
        String actualValue = food.getDiscountedPrice();

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testNegativePrice() {
        String price = "-10";
        Food food = new Food();
        food.setPrice(price);

        String expectedValue = "0";
        String actualValue = food.getPrice();

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testInvalidPrice() {
        String price = "20a";
        Food food = new Food();
        food.setPrice(price);

        String expectedValue = "0";
        String actualValue = food.getPrice();

        assertEquals(expectedValue, actualValue);
    }
}

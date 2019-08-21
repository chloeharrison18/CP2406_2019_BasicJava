package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SandwichTest {
    @Test
    void checkSandwich() {
        Sandwich sandwich = new Sandwich("cheese", "white", 2.00);

        // Test constructor values.

        // Checks main ingredient in constructor.
        String ingredient = sandwich.getMain_ingredient();
        assertEquals("cheese", ingredient);

        // Checks bread type in constructor.
        String bread = sandwich.getBread_type();
        assertEquals("white", bread);

        // Checks price in constructor.
        double price = sandwich.getPrice();
        assertEquals(2.00, price);

        /* Test the setters/getters.
        Needs to check that the variable can be changed. So ham is used instead of cheese for main ingredient.
        Each section checks both the setter and getter. */

        // Checks setters/getters for main ingredient.
        String test_main_ingredient = "ham";
        sandwich.setMain_ingredient(test_main_ingredient);
        String testing_ingredient = sandwich.getMain_ingredient();
        assertEquals(test_main_ingredient, testing_ingredient);

        // Checks setters/getters for bread type.
        String test_bread_type = "wholemeal";
        sandwich.setBread_type(test_bread_type);
        String testing_bread = sandwich.getBread_type();
        assertEquals(test_bread_type, testing_bread);

        // Checks setters/getters for price.
        double test_price = 5.00;
        sandwich.setPrice(test_price);
        double testing_price = sandwich.getPrice();
        assertEquals(test_price, testing_price);
    }
}
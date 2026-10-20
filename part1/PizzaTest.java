package part1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PizzaTest {

    @Test
    public void testPizzaCreationWithToppings() {
        PizzaBuilder builder = new PizzaBuilder();
        builder.setPizzaChain("Pizza Hut");
        builder.setSize("Large");
        builder.addPepperoni();
        builder.addMushrooms();
        builder.addExtraCheese();

        Pizza pizza = builder.build();

        assertEquals("Pizza Hut", pizza.getPizzaChain());
        assertEquals("Large", pizza.getSize());
        assertEquals(3, pizza.getToppings().size());
        assertTrue(pizza.getToppings().contains("Pepperoni"));
        assertTrue(pizza.getToppings().contains("Mushrooms"));
        assertTrue(pizza.getToppings().contains("Extra Cheese"));
    }

    @Test
    public void testBuildWithoutSizeThrowsException() {
        PizzaBuilder builder = new PizzaBuilder();
        builder.setPizzaChain("Dominos");
        builder.addBacon();

        assertThrows(IllegalStateException.class, () -> {
            builder.build();
        });
    }

    @Test
    public void testResetToppings() {
        PizzaBuilder builder = new PizzaBuilder();
        builder.setSize("Small");
        builder.addBacon();
        builder.addChicken();
        assertEquals(2, builder.getToppings().size());

        builder.resetToppings();
        assertEquals(0, builder.getToppings().size());
    }

    @Test
    public void testDifferentPizzaChains() {
        PizzaBuilder builder = new PizzaBuilder();
        builder.setPizzaChain("Little Caesars");
        builder.setSize("Medium");
        builder.addSausage();

        Pizza pizza = builder.build();

        assertEquals("Little Caesars", pizza.getPizzaChain());
        assertEquals("Medium", pizza.getSize());
        assertEquals(1, pizza.getToppings().size());
        assertEquals("Sausage", pizza.getToppings().get(0));
    }
}

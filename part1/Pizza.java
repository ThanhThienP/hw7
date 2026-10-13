package part1;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String pizzaChain;
    private String size;
    private List<String> toppings;

    public Pizza(PizzaBuilder builder) {
        this.pizzaChain = builder.getPizzaChain();
        this.size = builder.getSize();
        this.toppings = builder.getToppings();
    }

    public void eat() {
        System.out.println("Pizza chain: " + pizzaChain);
        System.out.println("Size: " + size);
        System.out.println(
                "Toppings (" + toppings.size() + "): " + (toppings.isEmpty() ? "None" : String.join(", ", toppings))
                        + "\n");
    }

    public String getPizzaChain() {
        return pizzaChain;
    }

    public String getSize() {
        return size;
    }

    public List<String> getToppings() {
        return toppings;
    }
}
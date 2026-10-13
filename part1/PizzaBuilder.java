package part1;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    private String pizzaChain;
    private String size;
    private List<String> toppings = new ArrayList<>();

    public String getPizzaChain() {
        return pizzaChain;
    }

    public void setPizzaChain(String pizzaChain) {
        this.pizzaChain = pizzaChain;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void addTopping(String topping) {
        this.toppings.add(topping);
    }

    public void addPepperoni() {
        addTopping("Pepperoni");
    }

    public void addSausage() {
        addTopping("Sausage");
    }

    public void addMushrooms() {
        addTopping("Mushrooms");
    }

    public void addBacon() {
        addTopping("Bacon");
    }

    public void addOnions() {
        addTopping("Onions");
    }

    public void addExtraCheese() {
        addTopping("Extra Cheese");
    }

    public void addPeppers() {
        addTopping("Peppers");
    }

    public void addChicken() {
        addTopping("Chicken");
    }

    public void addOlives() {
        addTopping("Olives");
    }

    public void addSpinach() {
        addTopping("Spinach");
    }

    public void addTomatoAndBasil() {
        addTopping("Tomato and Basil");
    }

    public void addBeef() {
        addTopping("Beef");
    }

    public void addHam() {
        addTopping("Ham");
    }

    public void addPesto() {
        addTopping("Pesto");
    }

    public void addSpicyPork() {
        addTopping("Spicy Pork");
    }

    public void addHamAndPineapple() {
        addTopping("Ham and Pineapple");
    }

    public void resetToppings() {
        this.toppings = new ArrayList<>();
    }

    public Pizza build() {
        if (this.size == null || this.size.trim().isEmpty()) {
            throw new IllegalStateException("Size is required and must be set!");
        }
        return new Pizza(this);
    }
}

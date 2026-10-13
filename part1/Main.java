package part1;

public class Main {
    public static void main(String[] args) {
        System.out.println("          Part 1:                ");
        System.out.println("          PAPA JOHNS             ");

        PizzaBuilder pjSmallBuilder = new PizzaBuilder();
        pjSmallBuilder.setPizzaChain("Papa Johns");
        pjSmallBuilder.setSize("Small");
        pjSmallBuilder.addBacon();
        pjSmallBuilder.addMushrooms();
        pjSmallBuilder.addChicken();
        Pizza pjSmall = pjSmallBuilder.build();
        pjSmall.eat();

        PizzaBuilder pjMediumBuilder = new PizzaBuilder();
        pjMediumBuilder.setPizzaChain("Papa Johns");
        pjMediumBuilder.setSize("Medium");
        pjMediumBuilder.addSpicyPork();
        pjMediumBuilder.addOnions();
        pjMediumBuilder.addExtraCheese();
        pjMediumBuilder.addPeppers();
        pjMediumBuilder.addTomatoAndBasil();
        pjMediumBuilder.addOlives();
        Pizza pjMedium = pjMediumBuilder.build();
        pjMedium.eat();

        PizzaBuilder pjLargeBuilder = new PizzaBuilder();
        pjLargeBuilder.setPizzaChain("Papa Johns");
        pjLargeBuilder.setSize("Large");
        pjLargeBuilder.addPepperoni();
        pjLargeBuilder.addSausage();
        pjLargeBuilder.addHam();
        pjLargeBuilder.addBeef();
        pjLargeBuilder.addMushrooms();
        pjLargeBuilder.addSpinach();
        pjLargeBuilder.addPesto();
        pjLargeBuilder.addHamAndPineapple();
        pjLargeBuilder.addBacon();
        Pizza pjLarge = pjLargeBuilder.build();
        pjLarge.eat();

        System.out.println("\n       PART 2: THREE PIZZA CHAINS       ");

        PizzaBuilder phLargeBuilder = new PizzaBuilder();
        phLargeBuilder.setPizzaChain("Pizza Hut");
        phLargeBuilder.setSize("Large");
        phLargeBuilder.addHamAndPineapple();
        phLargeBuilder.addBacon();
        phLargeBuilder.addExtraCheese();
        Pizza phLarge = phLargeBuilder.build();
        phLarge.eat();

        PizzaBuilder phSmallBuilder = new PizzaBuilder();
        phSmallBuilder.setPizzaChain("Pizza Hut");
        phSmallBuilder.setSize("Small");
        phSmallBuilder.addPepperoni();
        phSmallBuilder.addSpicyPork();
        Pizza phSmall = phSmallBuilder.build();
        phSmall.eat();

        PizzaBuilder littleCaesarsMediumBuilder = new PizzaBuilder();
        littleCaesarsMediumBuilder.setPizzaChain("Little Caesars");
        littleCaesarsMediumBuilder.setSize("Medium");
        littleCaesarsMediumBuilder.addSausage();
        littleCaesarsMediumBuilder.addBeef();
        littleCaesarsMediumBuilder.addPeppers();
        littleCaesarsMediumBuilder.addOnions();
        littleCaesarsMediumBuilder.addMushrooms();
        littleCaesarsMediumBuilder.addOlives();
        littleCaesarsMediumBuilder.addChicken();
        littleCaesarsMediumBuilder.addExtraCheese();
        Pizza littleCaesarsMedium = littleCaesarsMediumBuilder.build();
        littleCaesarsMedium.eat();

        PizzaBuilder littleCaesarsSmallBuilder = new PizzaBuilder();
        littleCaesarsSmallBuilder.setPizzaChain("Little Caesars");
        littleCaesarsSmallBuilder.setSize("Small");
        littleCaesarsSmallBuilder.addSpinach();
        littleCaesarsSmallBuilder.addTomatoAndBasil();
        littleCaesarsSmallBuilder.addPesto();
        littleCaesarsSmallBuilder.addMushrooms();
        littleCaesarsSmallBuilder.addOnions();
        littleCaesarsSmallBuilder.addBacon();
        Pizza littleCaesarsSmall = littleCaesarsSmallBuilder.build();
        littleCaesarsSmall.eat();

        PizzaBuilder dominosSmallBuilder = new PizzaBuilder();
        dominosSmallBuilder.setPizzaChain("Dominos");
        dominosSmallBuilder.setSize("Small");
        dominosSmallBuilder.addSpicyPork();
        Pizza dominosSmall = dominosSmallBuilder.build();
        dominosSmall.eat();

        PizzaBuilder dominosLargeBuilder = new PizzaBuilder();
        dominosLargeBuilder.setPizzaChain("Dominos");
        dominosLargeBuilder.setSize("Large");
        dominosLargeBuilder.addChicken();
        dominosLargeBuilder.addSpinach();
        dominosLargeBuilder.addPesto();
        Pizza dominosLarge = dominosLargeBuilder.build();
        dominosLarge.eat();
    }
}

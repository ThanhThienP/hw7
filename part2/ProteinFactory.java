package part2;

import java.util.Random;

public class ProteinFactory {
    private static ProteinFactory instance;
    private Random randomFoodGenerator = new Random();

    private ProteinFactory() {
    }

    public static ProteinFactory getInstance() {
        if (instance == null) {
            instance = new ProteinFactory();
        }
        return instance;
    }

    public String createProtein(String dietPlan) {
        String[] choices;
        switch (dietPlan) {
            case "No Restriction":
                choices = new String[] { "Fish", "Chicken", "Beef", "Tofu" };
                break;
            case "Paleo":
                choices = new String[] { "Fish", "Chicken", "Beef" };
                break;
            case "Vegan":
                choices = new String[] { "Tofu" };
                break;
            case "Nut Allergy":
                choices = new String[] { "Fish", "Chicken", "Beef", "Tofu" };
                break;
            default:
                choices = new String[] { "Fish", "Chicken", "Beef", "Tofu" };
                break;
        }
        return choices[randomFoodGenerator.nextInt(choices.length)];
    }
}
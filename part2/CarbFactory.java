package part2;

import java.util.Random;

public class CarbFactory {
    private static CarbFactory instance;
    private Random randomFoodGenerator = new Random();

    private CarbFactory() {
    }

    public static CarbFactory getInstance() {
        if (instance == null) {
            instance = new CarbFactory();
        }
        return instance;
    }

    public String createCard(String dietPlan) {
        String[] choices;
        switch (dietPlan) {
            case "No Restriction":
                choices = new String[] { "Cheese", "Bread", "Lentils", "Pistachio" };
                break;
            case "Paleo":
                choices = new String[] { "Pistachio" };
                break;
            case "Vegan":
                choices = new String[] { "Bread", "Lentils", "Pistachio" };
                break;
            case "Nut Allergy":
                choices = new String[] { "Cheese", "Bread", "Lentils" };
                break;
            default:
                choices = new String[] { "Cheese", "Bread", "Lentils", "Pistachio" };
                break;
        }

        return choices[randomFoodGenerator.nextInt(choices.length)];
    }
}

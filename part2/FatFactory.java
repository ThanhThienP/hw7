package part2;

import java.util.Random;

public class FatFactory {
    private static FatFactory instance;
    private Random randomChoiceGenerator = new Random();

    private FatFactory() {
    }

    public static FatFactory getInstance() {
        if (instance == null) {
            instance = new FatFactory();
        }
        return instance;
    }

    public String createFat(String dietPlan) {
        String[] choices;
        switch (dietPlan) {
            case "No Restriction":
                choices = new String[] { "Avocado", "Sour cream", "Tuna", "Peanuts" };
                break;
            case "Paleo":
                choices = new String[] { "Avocado", "Tuna", "Peanuts" };
                break;
            case "Vegan":
                choices = new String[] { "Avocado", "Peanuts" };
                break;
            case "Nut Allergy":
                choices = new String[] { "Avocado", "Sour cream", "Tuna" };
                break;
            default:
                choices = new String[] { "Avocado", "Sour cream", "Tuna", "Peanuts" };
                break;
        }
        return choices[randomChoiceGenerator.nextInt(choices.length)];
    }
}
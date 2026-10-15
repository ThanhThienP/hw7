package part2;

public class MacronutrientAbstractFactory {
    private static MacronutrientAbstractFactory instance;

    private MacronutrientAbstractFactory() {
    }

    public static MacronutrientAbstractFactory getInstance() {
        if (instance == null) {
            instance = new MacronutrientAbstractFactory();
        }
        return instance;
    }

    public CarbFactory getCarbFactory() {
        return CarbFactory.getInstance();
    }

    public ProteinFactory getProteinFactory() {
        return ProteinFactory.getInstance();
    }

    public FatFactory getFatFactory() {
        return FatFactory.getInstance();
    }

    public Meal createMeal(String dietPlan) {
        String carb = getCarbFactory().createCard(dietPlan);
        String protein = getProteinFactory().createProtein(dietPlan);
        String fat = getFatFactory().createFat(dietPlan);
        return new Meal(carb, protein, fat);
    }
}

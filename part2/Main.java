package part2;

public class Main {
    public static void main(String[] args) {
        MacronutrientAbstractFactory mealGenerator = MacronutrientAbstractFactory.getInstance();

        Customer pham = new Customer("Pham", "No Restriction");
        Meal meal1 = mealGenerator.createMeal(pham.getDietPlan());
        meal1.print(pham);

        Customer theresa = new Customer("Theresa", "Paleo");
        Meal meal2 = mealGenerator.createMeal(theresa.getDietPlan());
        meal2.print(theresa);

        Customer john = new Customer("John", "Vegan");
        Meal meal3 = mealGenerator.createMeal(john.getDietPlan());
        meal3.print(john);

        Customer josh = new Customer("Josh", "Nut Allergy");
        Meal meal4 = mealGenerator.createMeal(josh.getDietPlan());
        meal4.print(josh);

        Customer adam = new Customer("Adam", "Vegan");
        Meal meal5 = mealGenerator.createMeal(adam.getDietPlan());
        meal5.print(adam);

        Customer sid = new Customer("Sid", "Paleo");
        Meal meal6 = mealGenerator.createMeal(sid.getDietPlan());
        meal6.print(sid);

    }

}

package part2;

public class Meal {
    private String carb;
    private String protein;
    private String fat;

    public Meal(String carb, String protein, String fat) {
        this.carb = carb;
        this.protein = protein;
        this.fat = fat;
    }

    public void print(Customer customer) {
        System.out.println("Customer name: " + customer.getName() + "\nDiet plan: " + customer.getDietPlan());
        System.out.println("Carb: " + carb + ", Protein: " + protein + ", Fat: " + fat + "\n");
    }

}

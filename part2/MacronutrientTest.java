package part2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MacronutrientTest {

    @Test
    public void testSingletonFactories() {
        CarbFactory carb1 = CarbFactory.getInstance();
        CarbFactory carb2 = CarbFactory.getInstance();
        assertSame(carb1, carb2);

        ProteinFactory protein1 = ProteinFactory.getInstance();
        ProteinFactory protein2 = ProteinFactory.getInstance();
        assertSame(protein1, protein2);

        FatFactory fat1 = FatFactory.getInstance();
        FatFactory fat2 = FatFactory.getInstance();
        assertSame(fat1, fat2);

        MacronutrientAbstractFactory factory1 = MacronutrientAbstractFactory.getInstance();
        MacronutrientAbstractFactory factory2 = MacronutrientAbstractFactory.getInstance();
        assertSame(factory1, factory2);
    }

    @Test
    public void testCustomerCreation() {
        Customer customer = new Customer("Pham", "Vegan");
        assertEquals("Pham", customer.getName());
        assertEquals("Vegan", customer.getDietPlan());
    }

    @Test
    public void testPaleoRestrictions() {
        CarbFactory carbFactory = CarbFactory.getInstance();
        String carb = carbFactory.createCard("Paleo");
        assertEquals("Pistachio", carb);

        FatFactory fatFactory = FatFactory.getInstance();
        String fat = fatFactory.createFat("Paleo");
        assertNotEquals("Sour cream", fat);
    }

    @Test
    public void testVeganRestrictions() {
        ProteinFactory proteinFactory = ProteinFactory.getInstance();
        String protein = proteinFactory.createProtein("Vegan");
        assertEquals("Tofu", protein);

        CarbFactory carbFactory = CarbFactory.getInstance();
        String carb = carbFactory.createCard("Vegan");
        assertNotEquals("Cheese", carb);
    }

    @Test
    public void testNutAllergyRestrictions() {
        CarbFactory carbFactory = CarbFactory.getInstance();
        String carb = carbFactory.createCard("Nut Allergy");
        assertNotEquals("Pistachio", carb);

        FatFactory fatFactory = FatFactory.getInstance();
        String fat = fatFactory.createFat("Nut Allergy");
        assertNotEquals("Peanuts", fat);
    }

    @Test
    public void testCreateMeal() {
        MacronutrientAbstractFactory factory = MacronutrientAbstractFactory.getInstance();
        Meal meal = factory.createMeal("No Restriction");
        assertNotNull(meal);
    }
}

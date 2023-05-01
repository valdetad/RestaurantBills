package restaurantbills;
/**
 Contains the application constants, which are called in different classes.
 */
public class AppConstants {
    // Meals and their Costs
    String[] DISH = {"Sandwich", "Coffee", "French Fries", "Salad"};
    double[] COST = {6.5, 3.2, 4.0, 3.5};

    // Quanitity for meals
    public static final int QUANTITY_ONE = 1;
    public static final int QUANTITY_TWO = 2;

    // Available Meals
    public static final String MEAL_SANDWICH = "Sandwich";
    public static final String MEAL_COFFEE = "Coffee";
    public static final String MEAL_FRENCHFRIES = "French Fries";
    public static final String MEAL_SALAD = "Salad";

    // Total cost message and new line
    public static String TOTAL_COST_MSG = "Total cost is = ";
    public static String NEW_LINE = "\n";
}
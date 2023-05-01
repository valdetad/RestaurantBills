package restaurantbills;

import java.text.MessageFormat;
/**
 Create methods which could be used across the application.
 */
public class Shared {
    private static AppConstants Constants = new AppConstants();
    private static Bill myBill = new Bill();

    /**
     Helps to add a new order, calculate it, and also prints the total cost.
     */
    public static void CalculatedBill() {
        myBill.addOrder(AppConstants.MEAL_SANDWICH, AppConstants.QUANTITY_TWO,
                Constants.DISH, Constants.COST);
        myBill.addOrder(AppConstants.MEAL_COFFEE, AppConstants.QUANTITY_TWO,
                Constants.DISH, Constants.COST);
        myBill.addOrder(AppConstants.MEAL_FRENCHFRIES, AppConstants.QUANTITY_ONE,
                Constants.DISH, Constants.COST);
        myBill.addOrder(AppConstants.MEAL_SALAD, AppConstants.QUANTITY_ONE,
                Constants.DISH, Constants.COST);
        myBill.getOrder();

        // Prints the total cost final message.
        System.out.println(MessageFormat.format("{0}{1}{2}",
                AppConstants.TOTAL_COST_MSG,
                myBill.getTotal(),
                AppConstants.NEW_LINE));
    }
}
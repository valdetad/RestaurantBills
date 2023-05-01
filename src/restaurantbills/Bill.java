package restaurantbills;
import java.util.ArrayList;
/**
 *
 */
public class Bill {
    private ArrayList<String> orderedFood;
    private ArrayList<Integer> orderedQuantity;
    private double totalCost;

    /**
     Used to create ArrayList.
     */
    public Bill() {
        orderedFood = new ArrayList<String>();
        orderedQuantity = new ArrayList<Integer>();
    }

    /**
     Helps to get total cost of the bill.
     */
    public double getTotal() {
        return totalCost;
    }

    public void addOrder(String meal, int quantity,
                         String[] dish, double[] cost) {
        orderedFood.add(meal);
        orderedQuantity.add(quantity); // autoboxing here
        for (int i = 0; i < dish.length; i++) {
            //totalCost is initialized to be zero
            //when a Bill instance is constructed
            if (meal.equals(dish[i])) {
                totalCost += quantity * cost[i];
            }
        }
    }

    /**
     Gets the current order and current quantity.
     */
    public void getOrder() {
        for (int i = 0; i < orderedFood.size(); i++) {
            System.out.println(orderedFood.get(i) + " " +
                    orderedQuantity.get(i));
        }
    }
}
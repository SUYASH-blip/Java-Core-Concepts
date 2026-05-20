package Collections_Framework.List.ArrayLists;
import java.util.ArrayList;
public class ArrayListsExample {
    public static void main(String[] args) {



            // Creating ArrayList
            ArrayList<String> fruits = new ArrayList<>();

            // Adding elements
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Mango");
            fruits.add("Orange");

            // Printing ArrayList
            System.out.println("Fruits List: " + fruits);

            // Accessing element
            System.out.println("First Fruit: " + fruits.get(0));

            // Updating element
            fruits.set(1, "Grapes");

            // Removing element
            fruits.remove("Mango");

            // Printing updated list
            System.out.println("Updated Fruits List: " + fruits);

            // Looping through ArrayList
            System.out.println("All Fruits:");
            for (String fruit : fruits) {
                System.out.println(fruit);
            }

            // Checking size
            System.out.println("Total Fruits: " + fruits.size());
        }
    }


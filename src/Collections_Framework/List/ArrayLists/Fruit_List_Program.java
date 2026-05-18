package Collections_Framework.List.ArrayLists;

import java.util.ArrayList;
public class Fruit_List_Program {
    public static void main(String[] args) {




                // Creating ArrayList
                ArrayList<String> fruits = new ArrayList<>();

                // Adding fruits
                fruits.add("Apple");
                fruits.add("Mango");
                fruits.add("Banana");
                fruits.add("Orange");
                fruits.add("Grapes");

                // Displaying all fruits
                System.out.println("Fruit List:");
                System.out.println(fruits);

                // Accessing element
                System.out.println("\nFirst Fruit: " + fruits.get(0));

                // Updating element
                fruits.set(2, "Pineapple");

                // Removing element
                fruits.remove("Orange");

                // Checking element
                System.out.println("\nContains Mango? " + fruits.contains("Mango"));

                // Size of list
                System.out.println("Total Fruits: " + fruits.size());

                // Traversing using loop
                System.out.println("\nAll Fruits:");

                for(String fruit : fruits) {
                    System.out.println(fruit);
                }

                // Clearing list
                // fruits.clear();

                System.out.println("\nFinal List:");
                System.out.println(fruits);
            }
        }



package CopyOnWriteArrayLists;
import java.util.concurrent.CopyOnWriteArrayList;
public class Basic_Methods {
    public static void main(String[] args) {






                // read more

                CopyOnWriteArrayList<String> shoppingList = new CopyOnWriteArrayList<>();

                shoppingList.add("Milk");
                shoppingList.add("Eggs");
                shoppingList.add("Bread");

                System.out.println("Initial Shopping List: " + shoppingList);

                for (String item : shoppingList) {

                    System.out.println(item);

                    // Try to modify the list while reading
                    if (item.equals("Eggs")) {

                        shoppingList.add("Butter");

                        System.out.println("Added Butter while reading.");
                    }
                }

                System.out.println("Updated Shopping List: " + shoppingList);
            }
        }

// WE CANNOT DO THIS TYPE OF OPERATTION(READING WHILE WRITING) IN ARRAYLISTS
// BUT POSSIBLE IN COPYONWRITEARRAYLISTS

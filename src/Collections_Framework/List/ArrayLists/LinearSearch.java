package Collections_Framework.List.ArrayLists;

public class LinearSearch {

        public static void main(String[] args) {
            int[] arr = {10, 25, 30, 45, 50};
            int key = 45;

            int position = -1;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    position = i;
                    break;
                }
            }

            if (position != -1) {
                System.out.println("Element found at index: " + position);
            } else {
                System.out.println("Element not found");
            }
        }
    }


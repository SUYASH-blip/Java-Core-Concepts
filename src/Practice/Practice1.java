package Practice;

import java.util.Arrays;
import java.util.Random;

public class Practice1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Test<String> test = new Test<>("Hello");
        Test<Double> test2 = new Test<>(25.0005);
        test.print_Tvalue(test);
        test2.print_Tvalue(test2);
        Integer[] nums = new Integer[10];


        for (int i = 0; i <nums.length; i++) {
            nums[i] = rand.nextInt(1500)+10;

        }
        Test.printArray(nums);

    }
}
class Test<T>{
    public T  value;

    Test(T value){
        this.value = value;
    }
    public  void print_Tvalue(Test t){
        System.out.println(t.value);
    }
    public static <T> void printArray(T[] arr){
        System.out.println(Arrays.toString(arr));
    }

}

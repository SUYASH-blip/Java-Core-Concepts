package Java_Input_output_Package.BufferedReader;
import java.io.*;
import java.util.InputMismatchException;

public class Program1 {
    public static void main(String[] args) throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(s);

    }
}

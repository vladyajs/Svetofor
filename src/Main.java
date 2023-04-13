import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "C:" + separator +"Users" + separator + "user" + separator + "Desktop" + separator + "JavaTest.txt";
        File file = new File(path);

        Scanner sc = new Scanner(file);
        String line = sc.nextLine();
        String [] numbers = line.split(" ");
        int arr_number [] = new int[3];
        int counter = 0;

        for (String el: numbers){
            arr_number[counter++] = Integer.parseInt(el);
        }
        System.out.println(Arrays.toString(arr_number));

        sc.close();



    }
}
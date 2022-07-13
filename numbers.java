package task;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        int rnd_nums ;
        int user_numbers;
        String  user_name ;
        int[] my_arr = new int[100];
        int exists;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your name :");
        user_name = scn.nextLine();
        System.out.println("Let the game begin");
        Random rnd  = new Random();
        for (int xx =0 ; xx<100;xx++) {
            rnd_nums = rnd.nextInt(100);
            my_arr[xx] = rnd_nums;
        }
        Arrays.sort(my_arr);
        System.out.println("enter number ");
        while (true) {

            user_numbers = scn.nextInt();

            exists = Arrays.binarySearch(my_arr,user_numbers);
            if (exists >= 0) {
                System.out.println("Congratulations, "+user_name);
                break;
            } else System.out.println("try again");
        }
    }
}

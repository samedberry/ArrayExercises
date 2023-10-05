//1 call a method to which you pass an array and an int. Method return true if value exists, false otherwise.

import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        //get initial input
        Scanner input1 = new Scanner(System.in);
        System.out.println("Input goes here: ");
        int number = input1.nextInt();

        int[] numbers = {1,2,3,4,5,1,2,3,4,5};

        System.out.println(findValue(numbers, number));

    }

    public static boolean findValue(int[] numbers, int number) {
        for (int i : numbers) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }
}

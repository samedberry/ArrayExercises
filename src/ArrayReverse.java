//2 call method that takes an array and reverses elements, then return it.
import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {


        int[] numbers = {1,2,1,2,1,2,1,2,1};

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(intArrayReverse(numbers)));

    }


    //Try a regular for loop and see what happens.
    public static int[] intArrayReverse(int[] array) {
        int[] reversal = new int[array.length];

        for (int i : array) {
            reversal[i-1] = array[array.length-i];
        }

        return reversal;
    }
}

//
//
//    //Try a regular for loop and see what happens.
//    public static int[] intArrayReverse(int[] array) {
//        int[] reversal = new int[array.length];
//
//        for (int i = 0; i < array.length; i++) {
//            reversal[i] = array[array.length-(i+1)];
//        }
//
//        return reversal;
//    }
//}

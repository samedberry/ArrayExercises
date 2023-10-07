//4 find the number of even and odd integers in an array of integers

public class FindEvenOdd {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,6,6,6,7};
        int evenCount = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("There are " + evenCount + " even numbers and " + (array1.length-evenCount) + " odd numbers in the array.");
    }

}

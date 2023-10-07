//3 call method that takes two arrays as arguments,
// finds the common elements between them
// returns them in a third array.
// print the third array using Arrays.toString()

import java.util.Arrays;

public class FindCommon {
    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5};
        int[] array2 = {2,3,6,9,2};
        System.out.println(Arrays.toString(commonElements(array1, array2)));

    }

    public static int[] commonElements(int[] array1, int[]array2) {

        int[] elementLog;
        if (array1.length > array2.length) {
            elementLog = new int[array1.length];
        } else {
            elementLog = new int[array2.length];
        }

        int counter = 0;
        for (int i1 = 0; i1 < array1.length; i1++) {
            for (int i2 = 0; i2 < array2.length; i2++) {
                if (array1[i1] == array2[i2]) {
                    elementLog[counter] = array1[i1];
                    counter++;
                    break;
                }
            }
        }
        int[] commonElements = Arrays.copyOf(elementLog, counter);
        return commonElements;
    }
}

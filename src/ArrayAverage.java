//5 compute average of an array of integers except largest and smallest values

public class ArrayAverage {
    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5,6,6,6,6,7};
        int sum = 0;
//        for (int i : array1) {
//            sum = sum + array1[i];
//            System.out.println("The sum is " + sum);
//        }

        for (int i = 0; i < array1.length; i++) {
            sum = sum + array1[i];
            System.out.println("The sum is " + sum);

        }
        double avg = (double)sum/(double)array1.length;
        System.out.println("The average is " + avg);

        System.out.println("The min is " + minElement(array1));
        System.out.println("The max is " + maxElement(array1));

        double custAvg = ((double)sum-minElement(array1)-maxElement(array1))/((double)array1.length-2);

        System.out.println("The custom funky avg is " + custAvg);
    }

    public static int minElement(int[] array1) {
        int min = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < min) {
                min = array1[i];
            }
        }
        return min;
    }
    public static int maxElement(int[] array1) {
        int max = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > max) {
                max = array1[i];
            }
        }
        return max;
    }
}

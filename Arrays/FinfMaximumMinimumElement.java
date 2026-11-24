public class FinfMaximumMinimumElement {

    public static void main(String[] args) {
        // If Array is sorted
        int[] arr = { 10, 20, 30, 40, 50 };
        int maximum = 0;
        maximum = arr[arr.length - 1];
        int minimum = 0;
        minimum = arr[0];
        System.err.println("Maximum: " + maximum);
        System.err.println("Minimum: " + minimum);

        // If Array is not sorted
        int[] arr2 = { 10, 20, 15, 25, 22, 30, 28 };
        int maximum1 = arr2[0];
        int minimum2 = arr2[0];

        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] > maximum1) {
                maximum1 = arr2[i];
            } else if (arr2[i] < minimum2) {
                minimum2 = arr2[i];
            }
        }
        System.out.println(maximum1);
        System.err.println(minimum2);

    }
}

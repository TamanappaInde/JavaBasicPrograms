import java.util.Arrays;

public class Program1 {

    public static void main(String[] args) {
        // Reverse an array using for loop
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        System.err.println(Arrays.toString(arr));

        // Using new array
    int[] arr2 = { 1, 2, 3, 4, 5 };
    int[] reversed = new int[arr2.length];for(
    int i = 0;i<arr2.length;i++)
    {
        reversed[i] = arr2[arr2.length - 1 - i];

    }
    System.out.println(Arrays.toString(arr2));

    }

    

}

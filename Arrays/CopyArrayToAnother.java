import java.util.Arrays;

public class CopyArrayToAnother {
    public static void main(String[] args) {
        
        // Copy Array to another array using loop copy
        int[] a = { 1, 2, 3 };
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        System.out.println(Arrays.toString(b));

        // Array copy using System.arraycopy
        int[] c = new int[a.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.out.println(Arrays.toString(c));

        // Arrays of copyof meythod
        int[] d = Arrays.copyOf(a, a.length);
        System.out.println(Arrays.toString(d));

    }
}

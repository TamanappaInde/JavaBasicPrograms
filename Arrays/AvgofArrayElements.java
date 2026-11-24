public class AvgofArrayElements {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40 };
        int sum = 0;
        int avg = 0;

        for (int num : nums) {
            sum += num;
            avg = sum / nums.length;
        }
        System.out.println(avg);

    }
}

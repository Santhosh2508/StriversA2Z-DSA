import java.util.Arrays;

public class Leetcode1838 {
    public static void main(String[] args) {
        int k = 5;
        int[] nums = {1, 2, 4};
        int res = maxFrequency(nums, k);
        System.out.println(res);
    }

    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0, r = 0;
        long res = 0, total = 0;  // Use long to handle large sums

        while (r < nums.length) {
            total += nums[r];

            while (nums[r] * (r - l + 1L) > total + k) {
                total -= nums[l++];
            }

            res = Math.max(res, r - l + 1L);
            r++;
        }
        return (int) res;
    }
}

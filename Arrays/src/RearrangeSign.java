import java.util.Arrays;

public class RearrangeSign {
    public static void main(String[] args) {
        int[] nums = {28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};
        int n = nums.length;
        int pos = 0;
        int neg = 1;
        System.out.println(Arrays.toString(nums));
        while (pos < n && neg < n) {
            while (pos < n && nums[pos] > 0) {
                pos += 2;
            }
            while (neg < n && nums[neg] < 0) {
                neg += 2;
            }
            if (pos < n && neg < n) {
                int temp = nums[pos];
                nums[pos] = nums[neg];
                nums[neg] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}


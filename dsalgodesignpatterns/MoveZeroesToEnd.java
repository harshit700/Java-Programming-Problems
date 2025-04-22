package dsalgodesignpatterns;
import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] nums = {1, 0, 8, 3, 12, 0};
        int left = -1;
        int right = 0;
        while (right < nums.length) {
            if (nums[right] != 0) {
                if (left == -1) {
                    left++;
                } else {
                    int temp = nums[right];
                    nums[right] = nums[left];
                    nums[left] = temp;
                    right++;
                    left++;
                }
            } else {
                right++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}

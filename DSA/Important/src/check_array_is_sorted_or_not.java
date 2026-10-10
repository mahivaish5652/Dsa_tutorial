import java.util.ArrayList;
import java.util.Arrays;

public class check_array_is_sorted_or_not {
    static boolean checksorted( ArrayList<Integer> nums) {
        int n = nums.size();
        for (int i = 0; i < n-1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                return false;
            }
        }
            return true;
    }
    static void main() {
        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1,2,4,3,5,6));
        System.out.println(checksorted(nums));
    }
}

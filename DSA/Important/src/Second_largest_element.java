public class Second_largest_element {
    static int Secondlargest(int[] nums) {
        int n = nums.length;
        int largest = nums[0];
        int seclargest = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > seclargest && nums[i] != largest) {
                seclargest = nums[i];
            }
        }
        return seclargest;
    }

    static void main() {
        int[] nums = {2, 6, 8, 5, 5, 9, 3};
        int ans = Secondlargest(nums);
        System.out.println(ans);
    }
}

public class max_subarray_kadanes_algorithm {
    static int maxSumsubarray(int []nums) {
        int n = nums.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
            max = Math.max(sum, max);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
    static void main() {
        int []nums={-1,2,4,-2,5,3,2,-3};
        int ans=maxSumsubarray(nums);
        System.out.println(ans);
    }
}

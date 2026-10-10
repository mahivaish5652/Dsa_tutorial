public class longest_subarray_with_sum_K {
    static int maxlength(int []nums,int k){
        int n=nums.length;
        int sum=0;
        int left=0,right=0;
        int maxlen=0;
        while(right<n){
            sum=sum+nums[right];
            while(left<=right && sum>k){
                sum=sum-nums[left];
                left++;
            }
            if(sum==k){
                maxlen=Math.max(maxlen,right-left+1);
            }
            right++;
        }
        return maxlen;
    }
    static void main() {
        int []nums={10,5,6,8,5,2,3};
        int ans=maxlength(nums,15);
        System.out.println(ans);
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
         int n=nums.length;
        int sum=0;
        int maxlen=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            sum=sum+nums[i];
        maxlen=Math.max(sum,maxlen);
        
        if(sum<0){
            sum=0;
        }
        }
        return maxlen;
    }
}
public class kadanes_algorithm {
    static int maxsubarray(int []nums){
        int n=nums.length;
        int maxlen=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<n; i++){
            sum=sum+nums[i];
            maxlen=Math.max(sum,maxlen);
            if(sum<0){
                sum=0;
            }
        }
        return maxlen;
    }
    static void main() {
        int []nums={-2,1,-3,4,-1,2,1,-5,4};
        int ans=maxsubarray(nums);
        System.out.println(ans);
    }
}

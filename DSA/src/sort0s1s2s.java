public class sort0s1s2s {
    static int[] sort(int []nums){
        int n=nums.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
        return nums;
    }
    static void main() {
        int []nums={0,2,1,2,0,1,2};
        int ans[]=sort(nums);
        for(int k:ans)
        System.out.print(k + " ");
    }
}

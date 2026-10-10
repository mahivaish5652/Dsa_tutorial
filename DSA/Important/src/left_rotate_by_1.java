public class left_rotate_by_1 {
    static int[] leftrotate(int []nums){
        int n=nums.length;
        int temp=nums[0];
        for(int i=0; i<n-1; i++){
            nums[i]=nums[i+1];
        }
        nums[n-1]=temp;
        return nums;
    }

    static void main() {
        int nums[]={1,2,3,4,5};
        int ans[]=leftrotate(nums);
        for(int k: ans){
            System.out.print(k + " ");
        }
    }
}

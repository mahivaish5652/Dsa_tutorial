public class Move_zero_at_last {
    static void movezero(int []nums){
        int n=nums.length;
        int j=-1;
        for(int i=0; i<n; i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return;
        }
        for(int i=j+1; i<n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
    static void main() {
        int []nums={0,2,4,5,0,8,0,12};
        movezero(nums);
        for(int k: nums)
        System.out.print(k + " ");
    }
}

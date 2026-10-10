public class linear_search {
    static boolean searchtarget(int []nums,int target){
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]==target){
                return true;
            }
        }
        return false;
    }
    static void main() {
        int []nums={2,3,7,9,0,6};
        System.out.println(searchtarget(nums,8));

    }
}

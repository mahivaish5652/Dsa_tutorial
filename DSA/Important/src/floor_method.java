public class floor_method {
    static int floor(int []nums,int target){
        int n=nums.length;
        int str=0;
        int end=n-1;
        int ans=-1;
        while(str<=end){
            int mid=str+(end-str)/2;
            if(nums[mid]<=target){
                ans=nums[mid];
                str=mid+1;
            }else{
                end=mid-1;
            }

        }
        return ans;
    }
    static void main() {
        int []nums={1,2,3,5,7,8,9};
        int output=floor(nums,6);
        System.out.println(output);
    }
}

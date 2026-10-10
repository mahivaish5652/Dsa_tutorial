public class first_largest_element {
    static int Firstlargest(int []nums){
        int n=nums.length;
        int largest=nums[0];
        for(int i=0; i<n; i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
        }
        return largest;
    }

    static void main() {
        int nums[]={2,5,8,4,6,9};
        int ans=Firstlargest(nums);
        System.out.println("first largest element = " +ans);
    }
}

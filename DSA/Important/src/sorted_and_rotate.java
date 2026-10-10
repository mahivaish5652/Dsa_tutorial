public class sorted_and_rotate {
    //rotate krne pr sort h ki nhiii
    static boolean sorted(int []nums){
        int n=nums.length;
        int drop=0;
        for(int i=0; i<n; i++){
            if(nums[i]>nums[(i+1)%n]){
                drop++;
            }
            if(drop>1){
                return false;
            }
        }
        return true;
    }

    static void main() {
        int nums[]={3,4,5,1,2};
        System.out.println(sorted(nums));

    }
}

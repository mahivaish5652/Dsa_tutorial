import java.util.Arrays;
import java.util.HashSet;
public class union_of_sorted_array {
    static int[] union(int []nums1 , int []nums2){
        HashSet<Integer> set=new HashSet<>();
       int n=nums1.length;
       int m=nums2.length;
        for(int i:nums1){
            set.add(i);
        }
        for(int i:nums2){
            set.add(i);
        }
        int []ans=new int[set.size()];
        int k=0;
        for(int i:set){
            ans[k]=i;
            k++;
        }
        Arrays.sort(ans);
        return ans;
    }
    static void main() {
        int []nums1={1,2,3,5,7,8};
        int []nums2={1,3,9,10};
        int []result=union(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }
}

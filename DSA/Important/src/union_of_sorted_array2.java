import java.util.ArrayList;

public class union_of_sorted_array2 {

    // this code is optimal for union of two sorted array........

    public int[] unionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        int n=nums1.length;
        int m=nums2.length;
        int i=0,j=0;

        while(i<n && j<m){
            int val;
            if(nums1[i]==nums2[j]){
                val=nums1[i];
                i++;
                j++;
            }else if (nums1[i]<nums2[j]){
                val=nums1[i];
                i++;
            }else{
                val=nums2[j];
                j++;
            }

            if(list.isEmpty() || list.get(list.size()-1)!=val){
                list.add(val);
            }
        }
        while(i<n){
            if(list.isEmpty() || list.get(list.size()-1)!=nums1[i]){
                list.add(nums1[i]);
            }
            i++;
        }
        while(j<m){
            if(list.isEmpty() || list.get(list.size()-1)!=nums2[j]){
                list.add(nums2[j]);
            }
            j++;
        }
        int []ans=new int [list.size()];
        for(int k=0; k<list.size(); k++){
            ans[k]=list.get(k);
        }
        return ans;
    }
      public static void main(String []args){
        int []nums1={3,4,6,7,9,9};
        int []nums2={1,5,7,8,8};
        union_of_sorted_array2 obj= new  union_of_sorted_array2();
        int []ans=obj.unionArray(nums1,nums2);
          for(int x : ans){
        System.out.print(x + " ");
        }
}
}

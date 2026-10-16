import java.util.ArrayList;
import java.util.Arrays;

public class Intersection_of_two_sorted_array {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] ans = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            ans[k] = list.get(k);
        }
        return ans;
    }
        static void main (String[]args){
            int[] nums1 = {1, 2, 2, 3, 3, 3};
            int[] nums2 = {2, 3, 3, 4, 5, 6, 7};
            Intersection_of_two_sorted_array obj= new Intersection_of_two_sorted_array();
            int []ans=obj.intersectionArray(nums1,nums2);
            System.out.print(Arrays.toString(ans));
        }
    }


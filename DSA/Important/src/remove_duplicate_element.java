import java.util.*;
public class remove_duplicate_element {
    static int duplicate(int []nums){
        int n=nums.length;
       int i=0;
       int j=1;
       while(j<n){
           if(nums[i]==nums[j]){
               j++;
           }else {
               i++;
               nums[i] = nums[j];
               j++;
           }
        }
       return i+1;
    }

   public static void main(String[] args) {
        int nums[]={1,2,2,5,6,7,7,8};
        int ans=duplicate(nums);
           System.out.print(ans);
       }
    }

public class Add_two_Sum {
    static int[] Twosum(int []arr){
        int n=arr.length;
        int target=10;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==target){
                    int output[]={i,j};
                    return output;
                }
            }
        }
        int[] ans={};
        return ans;
    }
    static void main() {
        int [] arr={2,3,4,1,6,5};
      int ans[]=Twosum(arr);
      for(int k :ans)
        System.out.println(k);
    }
}

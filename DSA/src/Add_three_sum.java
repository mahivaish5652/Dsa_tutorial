public class Add_three_sum {
    static int[] Threesum(int []arr){
        int n=arr.length;
        int target=15;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        int output[]={i,j,k};
                        return output;
                    }
                }
            }
        }
        int ans[] ={};
        return ans;
    }

    static void main() {
        int []arr={2,5,-5,1,2,8,3};
         int ans[]=Threesum(arr);
         for(int m : ans){
             System.out.println(m);
         }
    }
}

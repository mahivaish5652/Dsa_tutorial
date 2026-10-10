public class sorted_array_of_0_and_1 {
    static int[] sortedArray(int []arr){
         int n=arr.length;
          int i=0;
          int j=n-1;
       while(i<j){
          if(arr[i]==1 && arr[j]==0){
              arr[i]=0;
              arr[j]=1;
          }
          if(arr[i]==0){
              i++;
          }
          if(arr[j]==1){
              j--;
          }
      }
        return arr;
    }
    static void main() {
        int []arr={1,0,1,1,0,0,1};
        int ans[]=sortedArray(arr);
        for(int k: ans)
        System.out.print(k + " ");
    }
}

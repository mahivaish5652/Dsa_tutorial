public class shift_element_by_1position {
   // right shift by 1 digit.....

// static void RightshiftBY1(int []arr){
//    int n=arr.length;
//     int temp=arr[n-1];
//     for(int i=n-1; i>0; i--){
//         arr[i]=arr[i-1];
//     }
//      arr[0]=temp;
// }
 static void LeftshiftBY1(int []arr){
     int n=arr.length;
     int temp=arr[0];
     for(int i=0; i<n-1; i++){
         arr[i]=arr[i+1];
     }
     arr[n-1]=temp;
 }

     static void main() {
     int []arr={1,2,7,3,4,6};
     //RightshiftBY1(arr);
         LeftshiftBY1(arr);
     for(int k: arr){
         System.out.println(k);
     }
    }
}

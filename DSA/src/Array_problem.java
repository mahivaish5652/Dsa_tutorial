import java.sql.SQLOutput;

//class Array {
    // find average...........

//        static double getaverage(int[] arr) {
//            double sum = 0;
//            int n = arr.length;
//            for (int i = 0; i < n; i++) {
//                sum = sum + arr[i];
//            }
//            double average = sum / n;
//            System.out.println("average = " + average);
//            return average;

    // multiply each element by 10.........

//        static int[]  getmultiplyBY10(int []arr){
//            int n=arr.length;
//            int []newArray= new int[n];
//            for(int i=0; i<n; i++){
//                newArray[i]= arr[i]*10;
//            }
//            return newArray;
//        }
//    }
    // linear search.........

//        static boolean getTarget(int arr[], int target) {
//            int n = arr.length;
//            for (int i = 0; i < n; i++) {
//                if (arr[i] == target) {
//                    return true;
//                }
//            }
//                    return false;
//        }
//    }

    // find maximum element........

//        static int getmax(int[] arr) {
//            int n = arr.length;
//            int max = arr[0];
//            for (int i = 0; i < n; i++) {
//                if (arr[i] > max) {
//                    max = arr[i];
//                }
//            }
//            return max;
//        }
//    }

    // return sum of +ve or -ve number........

//        static int[] getnumber(int []arr){
//        int n=arr.length;
//        int negative_number=0;
//        int positive_number=0;
//        for(int i=0; i<n; i++){
//            if(arr[i]>0){
//                positive_number=positive_number+arr[i];
//
//            }else{
//                negative_number=negative_number+arr[i];
//            }
//        }
//          return new int[] {positive_number,negative_number};
//        }
//    }

    // count zero's and one's.........

//        static int[] getcountnumber(int[] arr) {
//            int n = arr.length;
//            int zerocount = 0;
//            int onecount = 0;
//            for (int i = 0; i < n; i++) {
//                if (arr[i] == 0) {
//                    zerocount++;
//                } else {
//                    onecount++;
//                }
//            }
//            return new int[]{zerocount, onecount};
//        }
//    }

    //find first unsorted element...........

//        static int getunsorted(int[] arr) {
//            int n = arr.length;
//            for (int i = 0; i < n; i++) {
//                if (arr[i+1] <= arr[i]) {
//                    return arr[i + 1];
//                }
//            }
//            return -1;
//        }
//    }

    // swap alterante element in array...........

//        static int[] getswapalternate(int[] arr) {
//            int n = arr.length;
//            int temp;
//            for (int i = 0; i < n-1; i=i+2) {
//                temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//            return arr;
//        }
//    }

    // print intersection(common) element in array......

//        static void getintersection(int []arr1,int []arr2){
//            int m=arr1.length;
//            int n=arr2.length;
//            int result;
//            for(int i=0; i<m; i++) {
//                for (int j = 0; j < n; j++) {
//                    if (arr1[i] == arr2[j]) {
//                        result=arr1[i];
//                        System.out.print(result + " ");
//                    }
//                }
//            }
//
//            }
//        }


    // print alternate extreme element......[2,3,6,4,9,5]-> 2,5,3,9,6,4
      //continue......
//    static void getextremeelement(int[] arr) {
//        int n = arr.length;
//        int i = arr[0];
//        int j = n-1;
//        for ( i = 1; i < n; i++) {
//            if (arr[i] % 2 == 0 && arr[j] % 2 != 0) {
//                arr[i + 1] = arr[j];
//                j--;
//            }
//        }
//    }
//}
//    public class Array_problem {
//        static void main() {
//            int []arr={2,4,8,5,9,6};
//           int ans= Array.getextremeelement(arr);
//

//            int [] arr1={3,5,8,7,2};
//            int [] arr2={2,4,6,3,5};
//            Array.getintersection(arr1,arr2);

//            int []arr={2,4,6,3,8,5};
//            int ans[]=Array.getswapalternate(arr);
//            for(int e: ans)
//            System.out.print(e + " ");

//            int []arr={1,2,5,4,9};
//            int ans=Array.getunsorted(arr);
//            System.out.println(ans);

//            int arr[]={0,1,0,1,0,0,1,0};
//            int ans[]= Array.getcountnumber(arr);
//            System.out.println("count zero = "+ ans[0]);
//            System.out.println("count one = "+ ans[1]);



//           int arr[]={4,5,-5,7,-8,9};
//         int ans[]=Array.getnumber(arr) ;
//            System.out.println(ans[0]);
//            System.out.println(ans[1]);


//            int []arr={2,9,4,7,5};
//            int ans=Array.getmax(arr);
//            System.out.println(ans);


//            int arr[] = {2, 4, 7, 9, 3};
//            boolean ans = Array.getTarget(arr, 7);
//            System.out.println(ans);


//            int[] arr = {1, 2, 3, 4, 5, 6};
//            int ans[] = Array.getmultiplyBY10(arr);
//            for (int i : ans) {
//                System.out.println(i);
//            }


//            int arr[]={1,2,0,4,7};
//           double ans= Array.getaverage(arr);
//            System.out.println(ans);
       // }
   // }

        // get intersection using retainAll().....
//        static int getintersection(int []arr){
//            int n= arr.length;
//            int m=arr.length;
//            for(int i=0; i<n; i++){
//                for(int j=0; j<m; j++){
//
//                }
//
//            }
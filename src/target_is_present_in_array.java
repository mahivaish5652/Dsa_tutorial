public class target_is_present_in_array {
    // find target present in array...
     public static void main(String []args) {
         int[] arr = {2, 4, 7, 9, 5};
         int target = 3;
         boolean isininteger = false;
         for (int e : arr) {
             if (e == target) {
                 isininteger = true;
                 break;
             }
         }
         if (isininteger) {
             System.out.println("target is present in array");
         } else {
             System.out.println("target is not present in array");
         }
     }
}
//2nd method
//int[] arr = {1, 2, 3, 4, 5};
//int target = 7;
//int n = arr.length;
//        for (int i = 0; i < n; i++) {
//        if (arr[i] == target) {
//        System.out.println("target is present in array");
//                return;
//                        }
//                        }
//                        System.out.println("target is not present in array");
//    }
//            }

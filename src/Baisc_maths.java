public class Baisc_maths {
  static void printAllprime(int n){
      for(int i=2; i<=n; i++){
          int count =0;
          for(int j=1; j<=i; j++){
              if(i%j==0){
                  count++;
              }
          }
         if(count==2) {
             System.out.println(i + ", prime number");
         }
      }
    }
    static void main() {
        int n=100;
        printAllprime(n);
    }
}


//static void printevennumber(int num) {
//    int count =0;
//for(int i=0; i<=num; i++){
//    if(i%2==0){
//        System.out.println(i + " even number");
//        count ++;
//    }
//}
//}
//    static void main() {
//        int num=10;
//          printevennumber(num);
//    }
//}


    //    static boolean primenumber(int n) {
//        for (int i = 2; i * i <=n; i++){
//       // for (int i = 2; i < 10; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//         return true;
//    }
//    static void main(String[]args) {
//        int n=6;
//        System.out.println(primenumber(n));
//    }
//}


//    static void odd_even_number(int n) {
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 == 0) {
//                System.out.println("even number");
//            } else {
//                System.out.println("odd number");
//            }
//        }
//    }
//      public static void main(String[]args){
//        int n=10;
//        odd_even_number(n);
//
//    }
//}

//    static void palindromeno(int n) {
//        int original=n;
//        int revnum = 0;
//        while (n != 0) {
//            int digits = n % 10;
//            revnum = revnum * 10 + digits;
//            n = n / 10;
//        }
//
//        System.out.println(revnum);
//        if(original == revnum) {
//            System.out.println("no is palindrome ");
//        } else {
//            System.out.println("no is not palindrome");
//        }
//    }
//     static void main(String[]args) {
//        int n=126321;
//         palindromeno(n);
//     }
//}

//    static void reverseanumber(int n){
//        int revnum=0;
//        while(n!=0){
//            int digits=n%10;
//            int ans=revnum*10 + digits;
//            System.out.println(ans);
//            n=n/10;
//        }
//    }
//
//    static void main() {
//        int n=123;
//        reverseanumber(n);
//    }
//}
//    static int sumofdigits(int n){
//        int sum=0;
//        while(n!=0){
//            int digits=n%10;
//            sum=sum+digits;
//            n=n/10;
//        }
//        return sum;
//    }
//
//    static void main(String[]args) {
//        int n =1235;
//        System.out.println(sumofdigits(n));
//    }
//}

//   static int countdigits(int num) {
//       int count = 0;
//       while (num != 0) {
//           int digits = num % 10;
//           count++;
//           num = num / 10;
//       }
//       return count;
//   }
//    static void main(String[]args) {
//        int num=532673;
//        int ans= countdigits(num);
//        System.out.println(ans);
//    }
//}


//    static void printdigits(int num) {
//            while (num != 0) {
//                int digit = num % 10;
//                System.out.println(digit);
//                num = num / 10;
//        }
//    }
//        static void main (String[]args){
//            int num = 53217;
//            printdigits(num);
//    }
//}

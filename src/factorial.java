public class factorial {
    static int fact(int n){
        if(n==0||n==1){
            return n;
        }else{
            return n * fact(n-1);
        }
    }

    static void main() {
        int n=5;
        System.out.println(fact(n));
    }
}
//    static int factorial(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            return n * factorial(n - 1);
//        }
//    }
//
//    static int factorial_iterative(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            int product = 1;
//            for (int i = 1; i <= n; i++) {
//                product = product * i;
//            }
//            return product;
//        }
//    }
//        public static void main (String[]args){
//            int x = 3;
//            System.out.println("factorial is :" + factorial(x));
//            System.out.println("factorial iterative is : " + factorial_iterative(x));
//        }
//    }
//


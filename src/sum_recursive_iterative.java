public class sum_recursive_iterative {
    static int sumrec(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
                return sum;
            }
        }
        public static void main (String[]args){
            System.out.println(sumrec(5));
    }
}

public class sum_using_recursion_method {
    static int sumrec(int n){
        if(n==1||n==0){
            return 1;
        }else{
            return n + sumrec(n-1);
        }
    }
    public static void main(String[]args) {
        System.out.println(sumrec(5));
    }
}

public class nthterm_of_fibonacci_series {
    static int nfib(int n){
//        if(n==1){
//            return 0;
//        }
//        else if(n==2){
//            return 1;
        if(n==1||n==2){
            return n-1;
        }else{
            return nfib(n-1)+nfib(n-2);
        }
    }

    public static void main(String[]args) {
       System.out.println(nfib(7));
    }
}

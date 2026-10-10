public class pattern_using_recursion {
    static int patternrec(int n){
        if(n>0){
            patternrec(n-1);
            for(int i=0; i<n; i++){
                System.out.print("*");
            }
            System.out.println(" ");
            return n;
        }else{
             return n * patternrec(n-1);
        }
    }
    public static void main(String[]args) {
       System.out.println(patternrec(4));
    }
}

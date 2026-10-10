public class multiplication_table_using_method {
    static void multiplication(int n){
        for(int i=1;i<=10;i++){
            int x= n*i;
            System.out.println(n+"*"+i+ " = " + x);
        }
    }
   public static void main(String[]args) {
        multiplication(3);
    }
}

public class armstrong_number {
    static void armsnum(int n){
        int sum=0;
        int originalnumber=n;
        while(n!=0){
           int d= n % 10;
             sum=sum+d*d*d;
            n=n/10;
        }
        System.out.println("sum = " +sum);
        if(originalnumber==sum){
            System.out.println("yes, it is a armstrong number");
        }else{
            System.out.println("no, it is not a armstrong number");
        }
    }

    static void main() {
        int n=370;
        armsnum(n);
    }
}

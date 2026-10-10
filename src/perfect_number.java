public class perfect_number {
    static void perfectnumber(int n) {
        int num= n;
        int sum = 1;
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                int firstnum=i;
                int secondnum=n/i;
                sum=sum+firstnum+secondnum;
            }
        }
        System.out.println("sum = " +sum);
        if(num == sum){
            System.out.println("perfect number");
        }else{
            System.out.println("not perfect number ");
        }
    }
    static void main() {
        int n=6;
        perfectnumber(n);
}
}
        //        int sum = 0;
//        for (int i = 2; i * i <= n; i++) {    //root n tak nikal rhe isliye i*i <=n liya h
//            if (n % i == 0) {
//                int firstnum = i;
//                int secondnum = n / i;
//                sum = sum + firstnum + secondnum;
//            }
//            System.out.println(sum);
//            if (sum == n) {
//                System.out.println("perefct number");
//            } else {
//                System.out.println("not a perfect mumber");
//            }
//        }
//    }
//    static void main() {
//        int n=7;
//        perfectnumber(n);
//    }
//}

public class Euclidean_gcd_hcf_number {
    public static int getGCD(int a,int b) {
        while (b != 0) {
            int originalvalueofb = b;
            b = a % b;
            a = originalvalueofb;
        }
            return a;
        }
        public static int getLCM ( int a, int b) {
            int GCD = getGCD(a, b);
            int product = a * b;
            int lcm = product / GCD;
            return lcm;
        }
    static void main() {
        System.out.println(getLCM(18, 12));
    }
}
//    public static int gcdnumber(int a,int b){
//        // gcd(a,b)=gcd(b,a%b)
//        while(b!=0){
//            int originalvalueofb=b;
//            b=a%b;
//            a=originalvalueofb;
//        }
//        return a;
//    }
//
//    static void main() {
//        System.out.println(gcdnumber(18,12));
//    }
//}

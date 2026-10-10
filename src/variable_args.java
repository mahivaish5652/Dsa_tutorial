public class variable_args {
    static int sum(int...arr) {
        int result=0;
        for (int e : arr) {
            result += e;
        }
        return result;
    }
    public static void main(String[]args){
        System.out.println(sum(3, 4));
        System.out.println(sum(1, 4, 5));
        System.out.println(sum(2, 6, 3, 3));
    }
}

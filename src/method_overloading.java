//public class method_overloading {
//static void change(int a){
//    a=48;
//}
//static void change2(int[]arr){
//    arr[0]=98;
//}
//   public static void main(String[]args) {
//        int []marks={58,95,77,36,62};
//        change2(marks);
//        System.out.println(marks[0]);
//    }
//    }
//problem 2
public class method_overloading{
    static void foo() {
        System.out.println("good morning bro!!");
    }

    static void foo(int a) {
        System.out.println("good night bro!!" + a);
    }

    public static void main(String[]args){
        foo();
        foo(34);
    }
}

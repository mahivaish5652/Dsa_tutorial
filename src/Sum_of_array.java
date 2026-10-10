public class Sum_of_array {
    public static void main(String[] args) {
        float[] marks = {2.3f, 4.5f, 5.6f, 8.6f, 9.7f};
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println(sum/marks.length);
    }
}
// 2nd method
//        for (int i = 0; i<marks.length; i++) {
//            sum = sum + marks[i];
//        }
//        System.out.println(sum);
//    }
//}

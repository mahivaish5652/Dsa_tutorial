import java.sql.SQLOutput;

public class avg_passed_by_args {
    static double average(int... arr) {
        double sum = 0;
        int n=arr.length;
        for (int i =0; i<n; i++) {
            sum = sum + arr[i];
        } //System.out.println(sum);
        double avg = sum /n;
        return avg;
    }

    public static void main(String[] args) {
        System.out.println(average(1,2,3,5));
        System.out.println(average(1, 2,3, 4, 5));
    }
}

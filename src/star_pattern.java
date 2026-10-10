import org.w3c.dom.ls.LSOutput;

public class star_pattern {
    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    static void pattern1(int n) {
        for (int i =n ; i>=1; i--) {
            for (int j = 1; j <i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        pattern(5);
        System.out.println(" ");
        pattern1(5);
    }
}


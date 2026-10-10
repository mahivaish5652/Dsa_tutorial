public class convert_celsius_to_fahrenheit {
    static double convert(int c) {
       double f = (c * 1.8) + 32;
      return f;
}
   public static void main(String[]args) {
        System.out.println(convert(7));
    }
}

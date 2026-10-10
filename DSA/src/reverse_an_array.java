public class reverse_an_array {
    static void getReverseArray(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main() {
        int[] arr = {1, 4, 5, 3, 2, 6};
       getReverseArray(arr);
       for(int k: arr){
           System.out.print(k + " ");
       }
    }
}

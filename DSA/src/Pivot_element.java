public class Pivot_element {
    static int pivotelement(int []arr) {
        int n = arr.length;
        int Leftsum[] = new int[n];
        int Rightsum[] = new int[n];
        Leftsum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            Leftsum[i] = Leftsum[i - 1] + arr[i];
        }
        Rightsum[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            Rightsum[i] = Rightsum[i + 1] + arr[i];
        }
        for (int i = 0; i < n-1; i++){
            if (Leftsum[i] == Rightsum[i]) {
                return arr[i];
            }
    }
        return -1;
    }
    static void main() {
        int []arr={1,7,3,6,5,6};
        int ans=pivotelement(arr);
        System.out.println(ans);
    }
}

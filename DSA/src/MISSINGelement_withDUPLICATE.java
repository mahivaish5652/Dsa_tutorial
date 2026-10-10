import java.util.ArrayList;
import java.util.List;

public class MISSINGelement_withDUPLICATE {
    static List<Integer> missingelement(int []arr) {
        List<Integer> list= new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int value = Math.abs(arr[i]);
            int position = value - 1;
            if (arr[position] > 0) {
                arr[position] = -arr[position];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
              list.add(i+1);
            }
        }
        return list;
    }
    static void main() {
        int [] arr={1,4,4,5,2,2};
        List<Integer> ans=missingelement(arr);
        System.out.println(ans);
    }
}

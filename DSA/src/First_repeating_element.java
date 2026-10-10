import java.util.HashMap;
public class First_repeating_element {
        static int Firstrepeating(int[] arr) {
            HashMap<Integer, Integer> freq = new HashMap<>();
            for (int nums : arr) {
                freq.put(nums, freq.getOrDefault(nums, 0) + 1);
            }
            for (int i :freq.keySet()) {
            if(freq.get(i)>1) {
                return i;
            }
        }
            return -1;
        }
    public static void main(String[]args) {
        int[] arr = {2, 4, 6, 8, 7, 6, 8};
        int ans=Firstrepeating(arr);
        System.out.println(ans);
    }
}
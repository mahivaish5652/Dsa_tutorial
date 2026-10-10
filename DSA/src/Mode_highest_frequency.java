import java.util.HashMap;

public class Mode_highest_frequency {
    public class Hashmap {
        static int highestFreq(int[] arr) {
            HashMap<Integer, Integer> freq = new HashMap<>();
            for(int num : arr) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }
//            for(int i : freq.keySet()){
//                System.out.println(i + " -> " + freq.get(i));
//            }
            int maxfreq=-1;
            int maxfreqkey=-1;
            for(int key : freq.keySet()){
                int currentkey=key;
                int currentkeyfreq= freq.get(key);
                if(currentkeyfreq>maxfreqkey){
                    maxfreqkey=currentkeyfreq;
                    maxfreq=currentkey;
                }
            }
            return maxfreq;
        }
    }
    static void main() {
        int []arr={2,5,7,7,7,1,5,9,7,1,5};
         int ans =Hashmap.highestFreq(arr);
        System.out.println(ans);
    }
}

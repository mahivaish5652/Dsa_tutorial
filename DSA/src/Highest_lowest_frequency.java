import java.util.HashMap;

public class Highest_lowest_frequency {
    static int[] HighestLowestfreq(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        int highestfreq=Integer.MIN_VALUE;
        int highestkey=-1;
        for(int key : freq.keySet()) {
            int currentkey = key;
            int currentfreq = freq.get(key);
            if (currentfreq > highestfreq) {
                highestfreq=currentfreq;
                highestkey = currentkey;
            }
        }
            int lowestfreq=Integer.MAX_VALUE;
            int lowestkey=-1;
            for(int key : freq.keySet()){
                int currentkey=key;
                int currentfreq=freq.get(key);
                if(currentfreq<lowestfreq){
                    lowestfreq=currentfreq;
                    lowestkey=currentkey;
                }
        }
            int ans[]={highestkey,lowestkey};
            return ans;
    }

    static void main() {
        int []arr={2,3,5,3,6,2,6,7,2,4,5,4,2};
        int []ans=HighestLowestfreq(arr);
        System.out.println("highest frequency vala number = "+ arr[0]);
        System.out.println("lowest frequency vala number = "+ arr[1]);
    }
}
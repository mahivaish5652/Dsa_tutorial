public class Missing_number {
    static int getmissingnumber(int []arr){
        int xorsum=0;
        for(int n : arr ) {
            xorsum = xorsum ^ n;
        }
            int k = arr.length;
            for (int i = 0; i <= k; i++) {
                xorsum = xorsum ^ i;
        }
        return xorsum;
    }
    static void main() {
        int []arr={3,0,1};
      int ans= getmissingnumber(arr);
        System.out.println(ans);
    }
}

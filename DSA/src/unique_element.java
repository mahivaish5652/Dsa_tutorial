//import java.util.HashMap;
//import java.util.*;
public class unique_element{
    static int getuniqueelement(int []arr){
        int xorsum=0;
        for(int n: arr){
            xorsum=xorsum^n;
        }
        return xorsum;
    }
    static void main() {
        int []arr={4,7,9,6,7,4,3,6,9};
        int ans= getuniqueelement(arr);
        System.out.println(ans);
    }
}

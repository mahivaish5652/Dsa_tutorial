public class remove_duplicate_from_sorted_array {
    static int removeduplicate(int []arr){
        int n=arr.length;
        int i=0;
        int j=1;
        while(j<n){
            if(arr[i]==arr[j]){
                j++;
            }else{
                i++;
                arr[i]=arr[j];
                j++;
            }
        }
        return i+1;
    }
    static void main() {
        int []arr={1,2,2,2,2,3,3,4};
        int ans=removeduplicate(arr);
            System.out.println(ans);
    }
}

public class Reverse_an_array {
    public static void main(String[]args) {
        int []arr={4,6,9,3,5};
        int temp;
        int l=arr.length;
        int n=Math.floorDiv(l,2);
        for(int i=0; i<n; i++){
            temp=arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;
        }for(int element:arr){
            System.out.print(element + " ");
        }
    }
}

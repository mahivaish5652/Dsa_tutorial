public class max_element {
    public static void main(String[]args) {
        int []arr={4,8,5,7,9,2};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }System.out.println(max);
    }
}

public class min_element {
    public static void main(String[] args) {
        int[]arr={4,6,8,2,7,9};
        int min=Integer.MAX_VALUE;
        //int min=arr[0];
       for(int i=0; i<arr.length; i++){
           if(arr[i]<min){
               min=arr[i];
            }
        }System.out.println(min);
    }
}

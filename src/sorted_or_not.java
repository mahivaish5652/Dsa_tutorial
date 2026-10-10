public class sorted_or_not {
   public static void main(String[]args) {
       int []arr={4,6,9,12,15};
       boolean issorted=true;
       for(int i=0; i<arr.length-1; i++){
           if(arr[i]>arr[i+1]){
               issorted=false;
               break;
           }
       }
       if(issorted){
           System.out.println("array is sorted");
       }else{
           System.out.println("array is not sorted");
       }
       }

    }

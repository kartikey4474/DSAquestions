package arrays;

public class maxmin {

   static class Pair{
       int min;
       int max;
   }

   static Pair getmaxmin(int arr[])
   {
    Pair minmax = new Pair();
       int n = arr.length;
       if (n==1) {
           minmax.max = arr[0];
           minmax.min = arr[1];
           return minmax;
       }
       if (arr[0] > arr[1]) {
           minmax.max = arr[0];
           minmax.min = arr[1];
       }
       else{
           minmax.max = arr[1];
           minmax.min = arr[0];

           for(int i =2; i<n; i++){
               if(arr[i]> minmax.max){
                   minmax.max = arr[i];
               } else if(arr[i] < minmax.min){
                   minmax.min = arr[i];
               }
               }
               return minmax;
           }
    return minmax;
       }
           
       



   

    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;
        Pair minmax = getmaxmin(arr);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
 
    }

}
    


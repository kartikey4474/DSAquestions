package arrays;

public class negativeToOneside {

    void rearrange(int arr[]){
        int n = arr.length;
        int j = 0;
        for(int i =0; i<n; i++){
            if (arr[i] <0) {
                if (i != j) {
                    arr[i] += arr[j] - (arr[j] = arr[i]); //swap without using third variable
                }
                j++;
            }
        }

    }

    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args) {
        
     int arr[] = {1,-2,3,-1,-4};
     int n = arr.length;
     negativeToOneside obj = new negativeToOneside();
     obj.rearrange(arr);
     obj.printArray(arr, n);

    }
}

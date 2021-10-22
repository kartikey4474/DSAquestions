package hashing;

import java.util.Arrays;
import java.util.HashSet;

public class countdistinct {
    

    int countDistinct(Integer arr[]){

        HashSet<Integer> s = new HashSet<>(Arrays.asList(arr));
        return s.size();

    }
    
    public static void main(String[] args) {

        Integer arr[] = {10,10,20,40,40,50,50};
        
        countdistinct obj  = new countdistinct();

        System.out.println(obj.countDistinct(arr));
    }
}

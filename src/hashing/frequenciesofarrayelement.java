package hashing;

import java.util.HashMap;
import java.util.Map;



public  class frequenciesofarrayelement {

    void frequenciesOfArray(int arr[])
    { HashMap <Integer, Integer> h = new HashMap<>();
        for(int x: arr)
        h.put(x, h.getOrDefault(x,0) +1);

        for(Map.Entry<Integer,Integer> e: h.entrySet())
        System.out.println(e.getKey() + " " + e.getValue());
        // write your code here.
    }

    public static void main(String[] args) {
        // driver code here
        int arr[] = {50,50,10,40,10};
        frequenciesofarrayelement obj = new frequenciesofarrayelement();
        obj.frequenciesOfArray(arr);

    }
    
}

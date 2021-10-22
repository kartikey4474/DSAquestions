package hashing;

import java.util.*;

public class hashset { // implementation of hashset.
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("add");
        hs.add("kartikey");
        hs.add("singh");

        System.out.println(hs);  
        System.out.println(hs.contains("singh"));
        System.out.println(hs.size());
        hs.remove("singh");
        System.out.println(hs.size());
        for (String s: hs){
            System.out.println(s + " ");
        } // return a boolean and check wheather the element is present or not.

        Iterator<String> i = hs.iterator(); 

        while (i.hasNext()) {   //  returns a boolean .has next means it will print until element is present.
 
            System.out.println(i.next() + " ");
           
            
        }


            
        


    }
}

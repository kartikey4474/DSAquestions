package hashing;

import java.util.HashMap;

public class hashmap {

    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<String, Integer>();
        m.put("gfg", 10);
        m.put("ide", 15);
        m.put("kk boss", 420);

        // no prediction about the order of the elements when print.

        System.out.println(m);
        System.out.println(m.size());


        if(m.containsKey("ide"))
        System.out.println("yes");
        else
        System.out.println("NO");

        m.remove("ide");

        System.out.println(m.size());

    }
    
}

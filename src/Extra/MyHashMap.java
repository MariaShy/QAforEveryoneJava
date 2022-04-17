package Extra;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        Map<Integer,String> passport = new HashMap<>();
        passport.put(12340, "Petr Petrov");
        passport.put(12341, "Petr Petrov"); // value can duplicate
        passport.put(12342, "Ivan Ivanov");
        passport.put(null, "Ivan Ivanov"); // key can be null
        passport.put(12343, null); // value can be null
        passport.put(12342, "Ivanna Ivanova"); //key must be unique - the next value is rewriten

        System.out.println(passport);
        System.out.println(passport.keySet()); // all keys
        System.out.println(passport.values()); // all values
        System.out.println(passport.get(12340)); // get value by key

        passport.remove(12340); //remove by key

        System.out.println(passport.containsValue("Ivan Ivanov")); // =true
        System.out.println(passport.containsKey(12345)); // =false


    }

}

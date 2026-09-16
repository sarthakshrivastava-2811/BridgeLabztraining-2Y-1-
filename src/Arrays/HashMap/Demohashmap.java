package Arrays.HashMap;

import java.util.HashMap;

public class Demohashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> studentAges = new HashMap<>();
        studentAges.put("Rahul",21);
        studentAges.put("Gourang",22);
        studentAges.put("Rahul",23);
        for(String name : studentAges.keySet()) {
            System.out.println(name + " : " + studentAges.get(name));
        }

    }
}

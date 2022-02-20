package immutable;

import java.util.HashMap;
import java.util.Map;

public class main {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("1", "first");
        map.put("2", "second");

        Student s = new Student("ABC", 101, map);


        System.out.println(s.getName());
        System.out.println(s.getRegNo());
        System.out.println(s.getMetadata());

        // Uncommenting below line causes error (has private access and set to be immutable in Student class
        //s.regNo = 102;

        map.put("3", "third");
        // Remains unchanged due to deep copy in constructor
        System.out.println(s.getMetadata());
        s.getMetadata().put("4", "fourth");
        // Remains unchanged due to deep copy in getter
        System.out.println(s.getMetadata());
    }
}

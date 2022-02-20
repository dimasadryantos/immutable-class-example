package immutable;


import java.util.HashMap;
import java.util.Map;

//to make class immutable use final
final class Student {

    //to make immutable , encapsulate fields to final and make it final to protect from changing reference
    private final String name;
    private final int regNo;
    private final Map<String, String> metaData;

    //constructor of immutable class
    //parameterized constructor
    public Student(String name, int regNo, Map<String, String> metaData) {
        //this keyword refer to current instance it self
        this.name = name;
        this.regNo = regNo;


        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry : metaData.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }

        this.metaData = tempMap;
    }

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    // Note that there should not be any setters

    // Method 3
    // User -defined type
    // To get meta data
    public Map<String, String> getMetadata() {

        // Creating Map with HashMap reference
        Map<String, String> tempMap = new HashMap<>();

        for (Map.Entry<String, String> entry :
                this.metaData.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }


}

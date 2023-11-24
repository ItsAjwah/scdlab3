import java.util.Map;
import java.util.Set;

public class HashMap {
    public static void main(String[] args) {

        java.util.HashMap<String, Integer> hashMap = new java.util.HashMap<>();

//1st part
        hashMap.put("Ajwa", 20);
        hashMap.put("Alyan", 30);
        hashMap.put("Zoya", 28);
        hashMap.put("Sunny", 22);

//2nd part
        String keyToRetrieve = "Ajwa";
        if (hashMap.containsKey(keyToRetrieve)) {
            Integer age = hashMap.get(keyToRetrieve);
            System.out.println(keyToRetrieve + "'s age is " + age);
        } else {
            System.out.println(keyToRetrieve + " not found in the HashMap.");
        }

//3rd part
        String check_key = "rabia";
        if (hashMap.containsKey(check_key)) {
            System.out.println(check_key+ " exists in the HashMap.");
        } else {
            System.out.println(check_key + " does not exist in the HashMap.");
        }

//4th part
        System.out.println("\nHashMap Contents:");
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " -> " + value);
        }
    }
}

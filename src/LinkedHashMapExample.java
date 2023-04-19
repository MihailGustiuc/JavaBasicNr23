import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Ion", 23);
        linkedHashMap.put("Vasile", 18);
        linkedHashMap.put("Mihai", 27);
        linkedHashMap.put("Maxim", 25);


        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            linkedHashSet.add(entry.getValue());
        }


        LinkedList<String> linkedList = new LinkedList<>();
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            linkedList.add(entry.getKey());
        }


        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("LinkedList: " + linkedList);
    }
}
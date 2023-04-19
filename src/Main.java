import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Cheie1", 1);
        linkedHashMap.put("Cheie2", 2);
        linkedHashMap.put("Cheie3", 3);

        Set<Integer> linkedHashSet = new LinkedHashSet<>(linkedHashMap.values());

        List<String> linkedList = new LinkedList<>(linkedHashMap.keySet());
    }
}
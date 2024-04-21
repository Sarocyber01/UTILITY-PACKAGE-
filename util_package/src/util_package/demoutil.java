import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionExamples {
    public static void main(String[] args) {
        // LinkedList Example
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        System.out.println("LinkedList: " + linkedList);
        System.out.println("Contains Banana: " + linkedList.contains("Banana"));
        linkedList.remove("Banana");
        System.out.println("LinkedList after removing Banana: " + linkedList);
        System.out.println();

        // ArrayList Example
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Red");
        arrayList.add("Green");
        arrayList.add("Blue");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Contains Green: " + arrayList.contains("Green"));
        arrayList.remove("Green");
        System.out.println("ArrayList after removing Green: " + arrayList);
        System.out.println();

        // HashMap Example
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 25);
        hashMap.put("Charlie", 35);
        System.out.println("HashMap: " + hashMap);
        System.out.println("Has Alice: " + hashMap.containsKey("Alice") + ", Age: " + hashMap.get("Alice"));
        hashMap.remove("Alice");
        System.out.println("HashMap after removing Alice: " + hashMap);
        System.out.println();

        // HashSet Example
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Paris");
        hashSet.add("New York");
        hashSet.add("Tokyo");
        System.out.println("HashSet: " + hashSet);
        System.out.println("Contains Tokyo: " + hashSet.contains("Tokyo"));
        hashSet.remove("Tokyo");
        System.out.println("HashSet after removing Tokyo: " + hashSet);
    }
}

package AleksLiss.LearningJavaCore.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapAndNull {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(null, 1);
        map.put(null, null);
        System.out.println(map.get(null));


        Map<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(null, 1); // NPE -> Because compareTo()
        System.out.println(treeMap.get(null));

        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(null, 1);
        linkedHashMap.put(null, null);
        linkedHashMap.get(null);
    }
}

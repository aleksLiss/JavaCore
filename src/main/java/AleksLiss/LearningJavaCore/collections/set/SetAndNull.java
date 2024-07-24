package AleksLiss.LearningJavaCore.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetAndNull {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        set.add(null);
        System.out.println(set.contains(null));

        linkedHashSet.add(null);
        System.out.println(linkedHashSet.contains(null));

        treeSet.add(null); // NPE!
    }
}

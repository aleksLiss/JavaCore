package AleksLiss.LearningJavaCore.stream.terminalMethods;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TerminalMethods {
    public static void main(String[] args) {
        List<Integer> list = getList();
        Set<Integer> set = getSet();
//        forEachStream(list);
//        collectToList(set);
//        Object[] array = getArray(set);




    }


    private static void collectToList(Set<Integer> set) {
        set.stream()
                .collect(Collectors.toList());
    }

    private static void forEachStream(List<Integer> list) {
        list.forEach(System.out::println);
    }

    private static Object[] getArray(Set<Integer> set) {
        return set.stream()
                .toArray();
    }

    private static Set<Integer> getSet() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        return set;
    }

    private static List<Integer> getList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        return list;
    }
}

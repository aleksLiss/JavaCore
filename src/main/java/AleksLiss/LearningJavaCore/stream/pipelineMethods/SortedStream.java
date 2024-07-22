package AleksLiss.LearningJavaCore.stream.pipelineMethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortedStream {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };
        getList().stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }

    private static List<Integer> getList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        return list;
    }
}
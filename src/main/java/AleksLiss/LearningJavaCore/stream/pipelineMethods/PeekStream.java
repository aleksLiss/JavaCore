package AleksLiss.LearningJavaCore.stream.pipelineMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PeekStream {
    public static void main(String[] args) {
        List<Integer> list = getList();
        list.stream()
                .peek(System.out::println)
                .map(i -> "#_" + i)
                .peek(System.out::println)
                .peek(s -> System.out.println("------"))
                .collect(Collectors.toList());
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

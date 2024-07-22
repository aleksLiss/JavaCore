package AleksLiss.LearningJavaCore.stream.pipelineOperations;

import java.util.ArrayList;
import java.util.List;

public class FilterStream {
    public static void main(String[] args) {
        List<Integer> list = getList();
        list.stream()
                .filter(i -> i > 3)
                .filter(i -> i < 7)
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

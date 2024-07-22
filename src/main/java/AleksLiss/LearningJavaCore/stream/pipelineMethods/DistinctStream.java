package AleksLiss.LearningJavaCore.stream.pipelineMethods;

import java.util.ArrayList;
import java.util.List;

public class DistinctStream {
    public static void main(String[] args) {
        getList().stream()
                .distinct()
                .forEach(System.out::println);
    }

    private static List<Integer> getList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(6);
        list.add(6);
        return list;
    }
}

package AleksLiss.LearningJavaCore.stream.pipelineMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapStream {
    public static void main(String[] args) {
        Map<Integer, String> map = getList().stream()
                .collect(
                        Collectors.toMap(
                                k -> k,
                                v -> "#" + v,
                                (oldV, newV) -> oldV
                        ));
        map.forEach((a, b) -> System.out.println(a + ": " + b));
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

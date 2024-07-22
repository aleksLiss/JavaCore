package AleksLiss.LearningJavaCore.stream.pipelineMethods;

import java.util.ArrayList;
import java.util.List;

public class FindFirstStream {
    public static void main(String[] args) {
        List<Integer> list = getList();
        List<Integer> emptyList = new ArrayList<>();
        Integer a = list.stream()
                .findFirst()
                .orElse(-1);
        System.out.println(a);

        Integer b = emptyList.stream()
                .findFirst()
                .orElse(-1);
        System.out.println(b);
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

package AleksLiss.LearningJavaCore.stream.pipelineMethods;

import java.util.ArrayList;
import java.util.List;

public class FlatMapStream {

    public static void main(String[] args) {
        List<Integer> listOne = getListOne();
        List<Integer> listTwo = getListTwo();
        listOne.stream()
                        .flatMap(one -> listTwo.stream()
                                .map(two -> one + two))
                                .forEach(System.out::println);
    }

    private static List<Integer> getListTwo() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        return list;
    }

    private static List<Integer> getListOne() {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        return list;
    }
}

package AleksLiss.LearningJavaCore.stream.pipelineMethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PipelineMethods {
    public static void main(String[] args) {
        List<Integer> list = getList();
        filterStream(list);
        mapStream(list);
        mapToDoubleStream(list);
        peekStream(list);
        skipStream(list);
        sortStreamWithComparator(list);
        limitStream(list);
        distinctStream(list);
    }

    private static void distinctStream(List<Integer> list) {
        list.stream()
                .distinct()
                .forEach(System.out::println);
    }

    private static void limitStream(List<Integer> list) {
        list.stream()
                .limit(2)
                .forEach(System.out::println);
    }

    private static void skipStream(List<Integer> list) {
        list.stream()
                .skip(2)
                .forEach(System.out::println);
    }

    private static void sortStreamWithComparator(List<Integer> list) {
        CustomSorted customSorted = new CustomSorted();
        list.stream()
                .sorted(customSorted)
                .forEach(System.out::println);
    }

    private static void peekStream(List<Integer> list) {
        list.stream()
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    private static void mapToDoubleStream(List<Integer> list) {
        list.stream()
                .mapToDouble(n -> n / 5)
                .forEach(System.out::println);
    }

    private static void mapStream(List<Integer> list) {
        list.stream()
                .map(n -> n + 100)
                .forEach(System.out::println);
    }

    private static void filterStream(List<Integer> list) {
        list.stream()
                .filter(n -> n > 0)
                .forEach(System.out::println);
    }

    private static List<Integer> getList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(-2);
        list.add(-2);
        list.add(5);
        list.add(7);
        list.add(-9);
        list.add(-9);
        list.add(-9);
        return list;
    }
}


class CustomSorted implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
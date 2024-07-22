package AleksLiss.LearningJavaCore.stream.terminalMethods.agregationFunc;

import java.util.List;

public class CountFunc {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        long sum = list.stream()
                .filter(i -> i % 2 == 0)
                .count();
        System.out.println(sum);
    }
}

package AleksLiss.LearningJavaCore.stream.terminalMethods.agregationFunc.matches;

import java.util.List;
import java.util.stream.IntStream;

public class AnyMatch {
    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(1, 5).boxed().toList();
        boolean result = list.stream()
                .anyMatch(i -> i == 5);
        System.out.println(result);
    }
}

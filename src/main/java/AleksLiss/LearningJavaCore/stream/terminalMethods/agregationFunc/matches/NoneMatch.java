package AleksLiss.LearningJavaCore.stream.terminalMethods.agregationFunc.matches;

import java.util.List;
import java.util.stream.IntStream;

public class NoneMatch {
    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(1, 5).boxed().toList();
        boolean result = list.stream()
                .noneMatch(i -> i < 0);
        System.out.println(result);
    }
}

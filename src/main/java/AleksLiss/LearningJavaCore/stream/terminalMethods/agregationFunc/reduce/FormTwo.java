package AleksLiss.LearningJavaCore.stream.terminalMethods.agregationFunc.reduce;

import java.util.List;
import java.util.Optional;

public class FormTwo {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Integer res = list.stream()
                .reduce(100, (a, b) -> a + b);
        System.out.println(res);
    }
}

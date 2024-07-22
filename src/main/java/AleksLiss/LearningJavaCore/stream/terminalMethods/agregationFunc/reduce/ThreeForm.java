package AleksLiss.LearningJavaCore.stream.terminalMethods.agregationFunc.reduce;

import java.util.List;

public class ThreeForm {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Integer res = list.stream()
                .reduce(0, (a, b) -> a + b,
                        Integer::min);
        System.out.println(res);
    }
}

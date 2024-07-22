package AleksLiss.LearningJavaCore.stream.terminalMethods.agregationFunc.reduce;

import java.util.List;
import java.util.Optional;

public class FormOne {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Optional res = list.stream()
                .reduce((a, b) -> a + b);
        System.out.println(res.get());
        System.out.println("------------");
        List<String> strings = List.of("1", "2", "3");
        Optional<String> result = strings.stream()
                .reduce((a, b) -> a + ", " + b);
        System.out.println(result.get());
    }
}

package AleksLiss.LearningJavaCore.stream.terminalMethods.agregationFunc.matches;

import java.util.List;
import java.util.stream.IntStream;

public class allMatch {
    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(1, 5).boxed().toList();
        boolean r = list.stream()
                .allMatch(i -> i > 0);
        System.out.println(r);
    }
}

package AleksLiss.LearningJavaCore.stream.pipelineMethods;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapStreamTwo {
    public static void main(String[] args) {
        Integer[][] array = {{1, 2},
                            {3, 4},
                            {5, 6}};
        Stream.of(array)
                .flatMap(Arrays::stream)
                .forEach(System.out::println);
    }
}

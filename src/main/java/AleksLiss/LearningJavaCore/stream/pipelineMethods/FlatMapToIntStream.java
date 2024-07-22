package AleksLiss.LearningJavaCore.stream.pipelineMethods;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapToIntStream {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] array3 = {7, 8, 9};
        Stream.of(array1, array2, array3)
                .flatMapToInt(Arrays::stream)
                .boxed().
                forEach(System.out::println);
    }
}

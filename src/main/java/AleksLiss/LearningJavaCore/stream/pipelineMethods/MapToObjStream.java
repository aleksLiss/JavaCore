package AleksLiss.LearningJavaCore.stream.pipelineMethods;

import java.util.List;
import java.util.stream.IntStream;

public class MapToObjStream {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 5)
                .mapToObj(String::valueOf)
                .forEach(System.out::println);
    }
}

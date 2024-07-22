package AleksLiss.LearningJavaCore.stream.pipelineMethods;

import java.util.List;

public class MapToDoubleStream {
    public static void main(String[] args) {
        List<String> list = List.of("1", "2", "3");
        list.stream()
                .mapToDouble(Double::parseDouble)
                .forEach(System.out::println);
    }
}

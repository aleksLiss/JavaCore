package AleksLiss.LearningJavaCore.stream.terminalMethods.agregationFunc;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageFunc {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Vova", 23),
                new Person("Goga", 45),
                new Person("Nina", 54)
        );
        OptionalDouble averageAge = people.stream()
                .mapToInt(Person::age)
                .average();
        System.out.println(averageAge.getAsDouble());
    }
}

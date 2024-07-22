package AleksLiss.LearningJavaCore.stream.terminalMethods.agregationFunc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxFunc {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Nina", 29),
                new Person("Grisha", 45),
                new Person("Kolya", 77)
        );
        Optional<Person> persWithMaxAge = list.stream()
                .max(Comparator.comparing(Person::age));
        System.out.println(persWithMaxAge.get().age());
    }
}

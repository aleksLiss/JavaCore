package AleksLiss.LearningJavaCore.stream.terminalMethods.agregationFunc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinFunc {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Vova", 37),
                new Person("Nina", 67),
                new Person("Zina", 77),
                new Person("Petr", 18)
        );
        Optional<Person> minAge = list.stream()
                .min(Comparator.comparing(Person::age));
        System.out.println(minAge.get().age());
    }
}

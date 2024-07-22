package AleksLiss.LearningJavaCore.stream.terminalMethods.agregationFunc;

import java.util.List;

public class SumFunc {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Joka", 23),
                new Person("Boka", 12),
                new Person("Koka", 8)
        );
        Integer sumAges = people.stream()
                .mapToInt(Person::age)
                .sum();
        System.out.println(sumAges);
    }
}

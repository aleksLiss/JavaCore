package AleksLiss.LearningJavaCore;

public class HashAndEquals {
    public static void main(String[] args) {

        Person p1 = new Person(1, "Nina", 3);
        Person p2 = new Person(1, "Nina", 3);

    }

    public static final class Person {
        private int id;
        private int age;
        private String name;

        public Person(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public int hashCode() {
            return this.id;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) return true;

            if (obj == null || getClass() != obj.getClass()) return false;

            Person person = (Person) obj;

            if (id != person.id) return false;
            return age == person.age;

        }

    }
}

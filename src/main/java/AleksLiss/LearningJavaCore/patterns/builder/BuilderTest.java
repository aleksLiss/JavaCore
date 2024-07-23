package AleksLiss.LearningJavaCore.patterns.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Builder builder = new Builder();
        User user = builder
                .buildAge((byte) 12)
                .buildName("Vova")
                .build();
        System.out.println(user);
    }
}

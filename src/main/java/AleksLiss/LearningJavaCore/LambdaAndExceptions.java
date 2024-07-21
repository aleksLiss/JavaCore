package AleksLiss.LearningJavaCore;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaAndExceptions {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 0, -4, 2, 4);
        Consumer<Integer> consumer = throwingExceptionConsumerWrapper(LambdaAndExceptions::throwingException);
        list.forEach(consumer);
    }

    private static void throwingException(Integer n) throws IOException {
        System.out.printf("%d: %b%n", n, n > 0);
    }

    private static <T> Consumer<T> throwingExceptionConsumerWrapper(
            ThrowingExceptionConsumer<T, Exception> throwingExceptionConsumer
    ) {
        return result -> {
            try {
                throwingExceptionConsumer.accept(result);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        };
    }

}

@FunctionalInterface
interface ThrowingExceptionConsumer<T, E extends Exception> {
    void accept(T t) throws E;
}
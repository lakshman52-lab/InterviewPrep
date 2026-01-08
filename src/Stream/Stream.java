import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        Predicate<Integer> condition = n -> n % 2 == 0;

        List<Integer> even = numbers.stream()
                .filter(condition)
                .collect(Collectors.toList());

        List<String> names = Arrays.asList("ALakshman","ASwetha","cKarthikeya");

        List<String> result = names.stream()
                .filter(n -> n.startsWith("A"))
                .toList();

        int sum = numbers.stream().reduce(0, Integer::sum);

        // Task 1: Predicate
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(10)); // true

        // Task 2: Function (dummy example since Employee class doesn't exist)
        Function<String, Integer> lengthFn = s -> s.length();
        System.out.println(lengthFn.apply("Lakshman"));

        // Task 3: Consumer
        Consumer<String> printer = System.out::println;
        printer.accept("Hello Lakshman");

        // Task 4: Supplier
        Supplier<String> idGen = () -> UUID.randomUUID().toString();
        System.out.println(idGen.get());

        // Task 5: UnaryOperator
        UnaryOperator<Integer> square = n -> n * n;
        System.out.println(square.apply(5)); // 25
    }
}
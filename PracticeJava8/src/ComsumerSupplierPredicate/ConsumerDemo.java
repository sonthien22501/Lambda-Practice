package ComsumerSupplierPredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Consumer<T> used in all contexts where an object needs to be consumed. takes as input,
//some operation is  to be performed on the object WITHOUT returning any result

public class ConsumerDemo{

    public static void main(String[] args) {
//        Consumer<Integer> consumer = t -> System.out.println("Printing: " + t);
//        consumer.accept(2);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().forEach(t -> System.out.println("Printing: " + t));
    }
}

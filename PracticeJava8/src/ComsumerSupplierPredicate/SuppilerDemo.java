package ComsumerSupplierPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

//Supplier in all context where NO INPUT  but YES OUTPUT.
public class SuppilerDemo {
    public static void main(String[] args) {
//        Supplier<String> supplier = () -> "Nothing here";
//        System.out.println(supplier.get());

        List<String> list1 = Arrays.asList("a","b","c","d","e");
        List<String> list2 = Arrays.asList();
        System.out.println(list1.stream().findAny().orElseGet(() -> "Nothing here"));
        System.out.println("-----------------------------------------------");
        System.out.println(list2.stream().findAny().orElseGet(() -> "Nothing here"));

    }
}

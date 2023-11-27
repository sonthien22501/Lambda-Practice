package ComsumerSupplierPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


//Predicate<T> used for conditional check
//true/false returning functions in day to day => Predicate
public class PredicateDemo {

    public static void main(String[] args) {
//        Predicate<Integer> predicate = t -> {
//            if (t % 2 == 0){
//                return true;
//            } else return false;
//        };
//        Predicate<Integer> predicate = t -> t%2==0 ? true : false;
//        Predicate<Integer> predicate = t -> t%2==0;

//        System.out.println(predicate.test(40));

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        list.stream().filter(t -> t%2==0).forEach(a -> System.out.println("print: "+ a));
    }
}

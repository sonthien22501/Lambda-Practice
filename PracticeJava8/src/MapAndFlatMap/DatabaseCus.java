package MapAndFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DatabaseCus {
    public static List<Customer> getCustomers(){
        return Stream.of(
                new Customer(101,"Thien","thien@gmail.com", Arrays.asList("215263263","8921554")),
                new Customer(102,"Hoang","hoang@gmail.com", Arrays.asList("63415","253215")),
                new Customer(103,"Thong","thong@gmail.com", Arrays.asList("58363","15315652")),
                new Customer(104,"Minh","minh@gmail.com", Arrays.asList("7163163","274536"))
        ).collect(Collectors.toList());
    }
}

package Optional;

import MapAndFlatMap.Customer;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        Customer customer = new Customer(101,"Thien",null, Arrays.asList("215263263","8921554"));

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        Optional<Object> emailOptional = Optional.of(customer.getEmail());
        System.out.println(emailOptional);
    }
}

package MapAndFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {
    public static void main(String[] args) {
        List<Customer> customerList = DatabaseCus.getCustomers();

        //List<Customer> convert List<String> -> Data Transformation
        // mapping: customer -> customer.getEmail() - one to one mapping (each cus has only 1 email)
        List<String> emails =customerList.stream().map(customer -> customer.getEmail())
                .collect(Collectors.toList());
        System.out.println(emails);
        List<List<String>> phoneNos =customerList.stream().map(customer -> customer.getPhoneNo())
                .collect(Collectors.toList());
        System.out.println(phoneNos);
        //List<List<String>> here we cannot seperate all the phoneNo
        //[[215263263, 8921554], [63415, 253215], [58363, 15315652], [7163163, 274536]]
        // List in List
        //So we need to use flatmap for one to many mapping
        List<String> phoneNosFlat =  customerList.stream().flatMap(customer -> customer.getPhoneNo().stream())
                .collect(Collectors.toList());
        //Stream of stream: we get list phone no convert it to stream, then stream again.
        System.out.println(phoneNosFlat);

    }
}

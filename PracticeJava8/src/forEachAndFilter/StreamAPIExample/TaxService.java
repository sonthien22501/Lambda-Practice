package forEachAndFilter.StreamAPIExample;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
    public static List<Employee> evaluateTaxUsers(String input){
        return (input.equalsIgnoreCase("tax"))
                ? Database.getEmployees().stream().filter(s -> s.getSalary()>=500000).collect(Collectors.toList())
                : Database.getEmployees().stream().filter(s -> s.getSalary()<500000).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(evaluateTaxUsers("Tax"));
        System.out.println(evaluateTaxUsers("Non-tax"));
    }
}

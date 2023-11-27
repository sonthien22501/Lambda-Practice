package SortingLambda;

import forEachAndFilter.StreamAPIExample.Database;
import forEachAndFilter.StreamAPIExample.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(521);
        list.add(1);
        list.add(25);

        Collections.sort(list);//ACS
        Collections.reverse(list);//DES
        System.out.println((list));

//        list.stream().sorted().forEach(t -> System.out.println(t));//ASC
//        list.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.println(t));//DES
//        list.stream().sorted((t1,t2) -> t2.intValue() - t1.intValue()).forEach(t -> System.out.println(t));
        //t2.intValue() - t1.intValue(): DES
        //t1.intValue() - t2.intValue(): ACS

        List<Employee> employeeList = Database.getEmployees();
//        Collections.sort(employeeList, (o1,o2) -> (int) (o2.getSalary()-(o1.getSalary())));
//        employeeList.stream().sorted((o1,o2) -> (int) (o2.getSalary()-(o1.getSalary()))).forEach(System.out::println);
//        employeeList.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(System.out::println);
//      System.out.println(employeeList);
        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);

    }
}

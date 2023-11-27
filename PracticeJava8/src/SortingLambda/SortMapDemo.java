package SortingLambda;

import forEachAndFilter.StreamAPIExample.Database;
import forEachAndFilter.StreamAPIExample.Employee;

import java.util.*;

public class SortMapDemo {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("eight",8);
        map.put("one",1);
        map.put("four",4);
        map.put("seven",7);

        List<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
//        Collections.sort(entries,(o1,o2) -> o1.getValue()-(o2.getValue()));

//        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return o1.getValue()-(o2.getValue());
//            }
//        });
//        for (Map.Entry<String,Integer> entry: entries){
//            System.out.println(entry);
//        }
//        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
//        map.entrySet().stream().sorted(Map.Entry.comparingByValue((o1,o2) -> o2.intValue()-(o1.intValue()))).forEach(System.out::println);
        Map<Employee, Integer> employeeMap = new TreeMap<>((o1,o2) -> (int) (o1.getSalary() - o2.getSalary()));
//        public int compare(Employee o1, Employee o2) {
//            return (int) (o1.getSalary() - o2.getSalary());
//        }
        employeeMap.put(new Employee(215,"Thien","IT", 100000), 60);
        employeeMap.put(new Employee(623,"Hoang","ABC", 400000), 90);
        employeeMap.put(new Employee(732,"Thong","HR", 900000), 50);
        employeeMap.put(new Employee(814,"Chi","BA", 200000), 40);

        System.out.println(employeeMap);

        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
                .forEach(System.out::println);
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}

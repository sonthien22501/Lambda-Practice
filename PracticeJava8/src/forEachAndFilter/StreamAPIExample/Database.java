package forEachAndFilter.StreamAPIExample;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<Employee> getEmployees(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(215,"Thien","IT", 100000));
        employeeList.add(new Employee(623,"Hoang","ABC", 400000));
        employeeList.add(new Employee(732,"Thong","HR", 900000));
        employeeList.add(new Employee(814,"Chi","BA", 200000));
        return employeeList;
    }

}

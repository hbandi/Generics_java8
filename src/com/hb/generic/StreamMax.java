package com.hb.generic;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Signature of the max method in stream calss
        Optional<T> max(Comparator<? super T> comparator)

 */
public class StreamMax {

    public static void main(String[] args) {

        List<Employee> employees = Stream.of(new Employee(1, "Hanumanth"),
                new Employee(2, "Satish"), new Employee(3, "Zadson"), new Employee(4, "Rama")).collect(Collectors.toList());

        Employee maxIdEmployee=employees.stream().max(new Comparator<Employee>() {
            @Override
            public int compare(Employee employee, Employee t1) {
                return employee.getId()-t1.getId();
            }
        }).orElse(Employee.DEFAULT_EMPLOYEE);

        Employee maxLexNameEmployee=employees.stream().max(new Comparator<Object>() {
            @Override
            public int compare(Object employee, Object t1) {
                return employee.toString().compareTo(t1.toString());
            }
        }).orElse(Employee.DEFAULT_EMPLOYEE);

        System.out.println("Max Id Employee :: "+maxIdEmployee);
        System.out.println("Max Name Employee :: "+maxLexNameEmployee);

        Employee maxIdEmployeeWithLamda=employees.stream().
                max((employee, t1) -> employee.getId()-t1.getId()).orElse(Employee.DEFAULT_EMPLOYEE);

        Employee maxLexNameEmployeeWithLamda=employees.stream().
                max((Comparator<Object>) (employee, t1) -> employee.toString().compareTo(t1.toString())).orElse(Employee.DEFAULT_EMPLOYEE);

        System.out.println("Max Id Employee With Lamda :: "+maxIdEmployeeWithLamda);
        System.out.println("Max Name Employee With Lamda :: "+maxLexNameEmployeeWithLamda);

    }


}

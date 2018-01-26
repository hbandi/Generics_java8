package com.hb.generic;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapMethodInStream {

    /*
        map method in stream
            signature::
                <R> Stream<R> map(Function<? super T,? extends R> mapper)
               <R> -- declaration
               <Stream<R> return Type.
               Function<? super T,? extends R>
                        ? super T --> is consuming attribute. --> since its super
                        ? extends R --> producing attribute  --> since its extends
     */

    public static void main(String[] args) {

        List<Employee> employees = Stream.of(new Employee(1, "Hanumanth"),
                new Employee(2, "Satish"), new Employee(3, "Zadson"), new Employee(4, "Rama")).collect(Collectors.toList());

        List<String> allEmployeeNames=employees.stream().map(emp->emp.getName()).collect(Collectors.toList());
        System.out.println("all Employee Names:: "+allEmployeeNames);

        System.out.println("******************************************");
        List<Integer> allEmployeeIds=employees.stream().map(emp->emp.getId()).collect(Collectors.toList());
        System.out.println("all Employee Ids :: "+allEmployeeIds);

        System.out.println("*******************************************");
        int totalNamesLength=employees.stream().map(emp->emp.getName()).mapToInt(str->str.length()).sum();
        System.out.println("Total Employee names Length :: "+totalNamesLength);
    }
}

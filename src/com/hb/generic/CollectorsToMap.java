package com.hb.generic;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsToMap {
    /*
            public static <T,K,U> Collector<T,?,Map<K,U>> toMap(Function<? super T,? extends K> keyMapper,
                                                    Function<? super T,? extends U> valueMapper)
            <T,K,U>  -- Declaration of Types
            Collector<T,?,Map<K,U>> -- Return Type As
                        T input Type and ? un known type(Mostly accumulator function that will map from keyMapper To value mapper)

            Function<? super T,? extends K> keyMapper,
                                                    Function<? super T,? extends U> valueMapper --

            Function<? super T,? extends K> keyMapper --> From Type T to Key K
            Function<? super T,? extends U> valueMapper  -> from Type T to Value U.

     */

    public static void main(String[] args) {
        List<Employee> employees = Stream.of(new Employee(1, "Hanumanth"),
                new Employee(2, "Satish"), new Employee(3, "Zadson"), new Employee(4, "Rama")).collect(Collectors.toList());

        //Create a Map key as Id value is Employee it self.
        Map<Integer,Employee> employeeMap=employees.stream().collect(Collectors.toMap(emp->emp.getId(), emp->emp));
        System.out.println(" employee map with id as key :: "+employeeMap);
    }
}

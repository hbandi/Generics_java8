package com.hb.generic;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    UpperBounded Type means (? extends Duck)
    Which is nothing but named as covarient

 */
public class UpperBoundedType {


    public static void main(String[] args) {

        List<? extends Number> listOfNumbers = Stream.of(1, 2.314, 3, 4, 5, new BigDecimal(7.006)).collect(Collectors.toList());

        /*
            Print will work since Number calss is super calss of Integer,Float and Double.
            and also Number has toString implemented.
         */
        //listOfNumbers.forEach(System.out::print);

        /*
            Lets Try with sum and map to integer.
         */
        System.out.println(sum(listOfNumbers));

        List<BigDecimal> bigDecimalList = Stream.of(new BigDecimal(1), new BigDecimal(2.314), new BigDecimal(3), new BigDecimal(4), new BigDecimal(5), new BigDecimal(7.006)).collect(Collectors.toList());

        System.out.println(sum(listOfNumbers));

        List<Float> floatDecimalList = Stream.of(1.0F, 2.314F, 3.0F, 4.0F, 5.0F, 7.006F).collect(Collectors.toList());
        System.out.println(sum(floatDecimalList));
    }

    public static double sum(List<? extends Number> list) {
        return list.stream().mapToDouble(i -> i.doubleValue()).sum();
    }
}

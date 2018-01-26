package com.hb.generic;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LowerBoundedType {

    public static void main(String[] args) {
        /*
        On Iteratable interface
            added this
                default void forEach(Consumer<? super T> action)
         */

        List<String> strings= Stream.of("a","an","ant","epic","eptom").collect(Collectors.toList());

        strings.forEach(str-> System.out.println(str.toUpperCase()));
        strings.forEach((Object o)-> System.out.println(o.hashCode()));

        /*
            Stream<T> peek(Consumer<? super T> action)
            if i define a list of integers ,
            it will consider as ? super Integer which is nothing but it will accept Number,Double etc

         */
        List<Integer> integers=Stream.of(3,1,7,8,0,12,17).
                peek(i-> System.out.println(Integer.toBinaryString(i))).
                peek((Number n)-> System.out.println(n.doubleValue())).
                peek((Object o)-> System.out.println(o.hashCode())).collect(Collectors.toList());

        /*
        Thumb Rule.
        PECS.
            When writing producers ,type should be extends ? extends Number
            When writing consumers ,type should be super.  ? super Integer.
         */
    }
}

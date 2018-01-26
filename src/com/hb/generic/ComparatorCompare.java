package com.hb.generic;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComparatorCompare {

    /*
    *
    *
    *
    *
    *
    *  Signature
    *     static <T,U extends Comparable<? super U>> Comparator<T> comparing(Function<? super T,? extends U> keyExtractor)

          Declaration of Type :: <T,U extends Comparable<? super U>>
          Return Type :Comparator<T>
          In parameter:: Function<? super T,? extends U> keyExtractor

          First Analysing In Parameter ::   Function<? super T,? extends U> keyExtractor
                    which will take a function as in parameter of Type T - ? super T [when you are consuming use Super ,i.e CS]
                    and
                        then transform as U :: when you are producing use Extends like ? extends U
          -- in parameter is Clear.

          Return Type:: is returning comparator of Type T ,since returns another comaprator of same Type for applying thenCompare use cases.

          Declaration::
            <T,U extends Comparable<? super U>>
                T is in Type,already defined in Comaparator it self.
                U is Of type "U extends Comparable<? super U>" means,U has natural ordered comapable like Integer,String then also
                which is again consuming so its ? super U
     */

    public static void main(String[] args) {

        List<String> listOfStrings = Stream.of("a", "z", "ant", "pot", "poet", "son").collect(Collectors.toList());

        List<String> resultList=listOfStrings.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        /*
            Here key Extractor is ::
            String::length ---> integer
            Comparator.comparing(String::length) --> of the type String(T)
         */
        System.out.println("result List:: "+resultList);

    }
}

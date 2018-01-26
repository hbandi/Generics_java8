package com.hb.generic;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * Unbounded Type is nothing butt you define a structure with using ?
 * <p>
 * For Example.
 * List<?> its a unbounded list you can put any Object in that list
 * But while accessing it you need to call only object related methods in that.
 */
public class UnBoundedType {

    public static void main(String[] args) {
        List<?> unKnownTypeList = Arrays.asList("Hanu", "sinu", LocalDate.now(), 3, 90.89);
        /*
            You can calle any list operations
         */
        System.out.println(" size:: " + unKnownTypeList.size());

        /*
        You can call println on eache object since toString has been invoked on each object
         */
        unKnownTypeList.forEach(System.out::println);
        /*
            But when you try to add any thing to list,it will fail since
            its not able to find type of in argument
        unKnownTypeList.add("system");
        */

        /*
            in this i dont care about under lying object type.
         */
        //public boolean containsAll(Collection<?> collection)

        /*
            same issue as above,below also fail.
         */
        //unKnownTypeList.addAll(Arrays.asList("kill","test"));
    }

}

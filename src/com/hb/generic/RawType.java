package com.hb.generic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RawType {

    public static void main(String[] args) {

        List rawList = new ArrayList();
        rawList.add("hanu");
        rawList.add("sam");
        rawList.add("ramu");
        rawList.add(LocalDate.now());
        /**
         * List will print properly since Object toString()
         * Will be called and it does nothing just print object
         */
        rawList.stream().forEach(System.out::println);
        /**
         * If you want to type cast and do dome operation
         * in this case it will give class cast exception at run time since
         * not able to case local date to String
         */
        for(Object o:rawList){
            String str=(String)o;
            System.out.println(" "+o);
        }

    }
}

package com.refact.example;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");

        list.forEach(System.out::println);

        list.forEach(el -> {
            System.out.println(el);
            el = el + "concat";
            System.out.println(el);
        });



    }
}

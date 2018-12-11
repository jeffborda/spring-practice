package com.jeffborda.springpractice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String helloWorld() {
        return "hello";
    }

    @RequestMapping("/capitalize//{stringToCapitalize}")
    public String capitalize(@PathVariable() String stringToCapitalize) {

        return toAllCaps(stringToCapitalize);
    }

    public static String toAllCaps(String words) {

        return words.toUpperCase();
    }

}

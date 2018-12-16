package com.jeffborda.springpractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "Hello there!";
    }

    @RequestMapping("/capitalize//{stringToCapitalize}")
    public String capitalize(@PathVariable() String stringToCapitalize) {

        return toAllCaps(stringToCapitalize);
    }

    public static String toAllCaps(String words) {

        return words.toUpperCase();
    }

}

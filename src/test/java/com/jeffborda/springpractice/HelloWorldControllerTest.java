package com.jeffborda.springpractice;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldControllerTest {

    @Test
    public void toAllCaps() {
        String testWord1 = "thismustbecapitalized";
        String testWord2 = "Capitalize With Spaces";
        String testWord3 = "Cap with s3cia1 char$";
        assertEquals("Should return string to all caps.", "THISMUSTBECAPITALIZED", HelloWorldController.toAllCaps(testWord1));
        assertEquals("Should return string to all caps.", "CAPITALIZE WITH SPACES", HelloWorldController.toAllCaps(testWord2));
        assertEquals("Should return string to all caps.", "CAP WITH S3CIA1 CHAR$", HelloWorldController.toAllCaps(testWord3));
    }
}
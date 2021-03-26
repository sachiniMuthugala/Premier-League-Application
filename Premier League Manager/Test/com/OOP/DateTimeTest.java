package com.OOP;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DateTimeTest {

    private Assert Assertions;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSetYear() {
        DateTime testDate = new DateTime();
        testDate.setYear(1000);

    }

    @Test
    public void testSetMonth() {
        DateTime testDate = new DateTime();
        testDate.setYear(1000);
        testDate.setMonth(23);
    }

    @Test
    public void testSetDay() {
        DateTime testDate = new DateTime();
        testDate.setYear(1000);
        testDate.setMonth(23);
        testDate.setDay(34);
    }

    @Test
    public void getYear() {
        testSetYear();
    }

    @Test
    public void getMonth() {
        testSetMonth();
    }

    @Test
    public void getDay() {
        testSetDay();
    }

    @Test
    public void testToString() {

    }
}
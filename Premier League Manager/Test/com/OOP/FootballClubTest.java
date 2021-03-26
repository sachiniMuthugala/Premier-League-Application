package com.OOP;

import junit.framework.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class FootballClubTest {

    private Assert Assertions;

    @Test
    public void compareTo() {

        //f2.points > f1.points
        FootballClub f1 = new FootballClub("sl",new DateTime(2020,3,3),"sl",new BigDecimal(200),"+94 763116008",1,1,1,1,2,1,3);
        FootballClub f2 = new FootballClub("japan",new DateTime(2012,4,4),"japan",new BigDecimal(400),"+84 63546283718923",1,1,1,1,5,1,4);

        System.out.println("f1.points = 3, f2.points = 4");
        Assertions.assertEquals(f1.compareTo(f2), -1);
        System.out.println("Test 1 ----> f1.points - f2.points = -1");

        Assertions.assertEquals(f2.compareTo(f1), 1);
        System.out.println("Test 2 ----> f2.points - f1.points = 1");

        //f1.points == f2.points
        FootballClub f3 = new FootballClub("Arsenal",new DateTime(2020,3,3),"sl",new BigDecimal(200),"+94 763116008",1,1,1,1,3,1,4);
        FootballClub f4 = new FootballClub("Aston Villa",new DateTime(2012,4,4),"japan",new BigDecimal(400),"+84 63546283718923",1,1,1,1,7,2,4);

        System.out.println("f3.points == f4.points AND f3.GD = 2, f4.GD = 5");
        //when points are equal then goes to goal difference
        Assertions.assertEquals(f4.compareTo(f3), 3);
        System.out.println("Test 3 ----> f4.points - f3.points = 3");


        Assertions.assertEquals(f3.compareTo(f4), -3);
        System.out.println("Test 4 ----> f3.points - f4.points = -3");




    }

}
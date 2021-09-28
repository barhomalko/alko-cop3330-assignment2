/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 barhom alko
 */
package ex34;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

@DisplayName("Test")

public class TestAriCalc {


    @Test
    @DisplayName("Test method")
    void TestMethod()
    {
        ArrayList<String> names=new ArrayList();
        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");
        AriCalc obj=new AriCalc();
        boolean b=obj.removeName(names,"Chris Jones");

        Assertions.assertTrue(b);
    }

}
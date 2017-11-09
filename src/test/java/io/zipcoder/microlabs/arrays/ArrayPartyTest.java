package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartyTest {

    @Test
    public void printArrayTest() {
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest() {
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty lastElement = new ArrayParty();
        String expected = "Mushrooms";
        //: When
        String actual = lastElement.lastElement(breakfast);
        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    //TODO Define the method lastButOneTest
    @Test
    public void lastButOneTest() {
//: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty lastButOneTest = new ArrayParty();
        String expected = "Tomatoes";

        //: When
        String actual = lastButOneTest.lastButOneTest(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);

    }


    //TODO Define the method reverseTest
    @Test
    public void reverseTest() {
        //: Given
    String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
    ArrayParty reverseTest = new ArrayParty();
    String expected = "*** Output ***\n" +
            "Mushrooms\n" +
            "Tomatoes\n" +
            "Bacon\n" +
            "Beans\n" +
            "Eggs\n" +
             "Sausage";

    //: When
    String actual = reverseTest.reverseTest(breakfast);

    //: Then
        Assert.assertEquals("The two string outputs are equal",expected,actual);
}

    //TODO Define the method isPalindromeTest

    @Test
    public void isPalindromeTest() {
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty isPalindromeTest = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Mushrooms, Tomatoes, Bacon, Beans, Eggs, Sausage";

        //: When
        String actual = isPalindromeTest.isPalindromeTest(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }



    //TODO Define the method compressTest

    @Test
    public void compressTest() {
        int [] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};
        ArrayParty compressTest = new ArrayParty();
        String expected = 1 + "\n" + 2 +"\n" + 3 + "\n" + 4;
        //System.out.println(nums);

        String actual = compressTest.compressTest(nums);

        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }



    //TODO Define the method packTest


}

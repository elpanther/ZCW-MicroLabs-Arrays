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
        String actual = lastButOneTest.lastButOne(breakfast);

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
    String actual = reverseTest.reverse(breakfast);

    //: Then
        Assert.assertEquals("The two string outputs are equal",expected,actual);
}

    //TODO Define the method isPalindromeTest

    @Test
    public void isPalindromeTest() {
        //: Given
        String[] palindromic = {"Sausage", "Eggs", "Beans", "Beans", "Eggs", "Sausage"};
        String [] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();


        //: When
        String expected = "True\nFalse";
        String actual = arrayParty.isPalindrome(palindromic)+"\n"+arrayParty.isPalindrome(breakfast);


        //: Then
        Assert.assertEquals(expected, actual);
    }



    //TODO Define the method compressTest

    @Test
    public void compressTest() {
        int [] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};
        ArrayParty compressTest = new ArrayParty();
        String expected = "compress(nums)\n*** Output ***\n" + 1 + "\n" + 3 + "\n" + 2 + "\n" + 1  + "\n" +  4;
        //System.out.println(nums);

        String actual = compressTest.compress(nums);

        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }



    //TODO Define the method packTest
    @Test
    public void packTest() {
        char [] letters = {'a','a','a','a','b','c','c','a','a','d','e','e','e','e'};
        ArrayParty lettersTest = new ArrayParty();
        String expected = "pack(nums)\n*** Output ***\n: aaaa, b, cc, aa, d, eeee";
        //System.out.println(nums);

        String actual = lettersTest.pack(letters);

        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }


}

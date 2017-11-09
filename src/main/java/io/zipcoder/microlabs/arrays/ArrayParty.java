package io.zipcoder.microlabs.arrays;


import com.sun.deploy.util.ArrayUtil;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.Collections;

public class ArrayParty {

       public String printArray(String[] inputArray){
        String output = "*** Output ***";
          String [] myPartyList =  {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};

          for (int i = 0; i < myPartyList.length; i++){
              output += "\n" + myPartyList[i];

          }

        return output;
    }

    public String lastElement(String[] inputArray){

        String output = "";
        String [] breakfast =  {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        for (int i = 0; i < breakfast.length; i++) {
            if (i == breakfast.length-1)
            output += breakfast[i];
        }
        return output;
    }

   // TODO Define the method lastButOne

    public String lastButOneTest(String[] inputArray){

        String output = "";
        String [] breakfast =  {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        for (int i = 0; i < breakfast.length; i++) {
            if (i == breakfast.length-2)
                output += breakfast[i];
        }
        return output;

    }


    //TODO Define the method reverse

    public String reverseTest(String[] inputArray){
        String output = "*** Output ***";
        //String temp = new StringBuilder();
        String [] myPartyList =  {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};

        for (int i = myPartyList.length -1; i >= 0; i--){
            output += "\n" + myPartyList[i];
        }
        return output;
    }

    //TODO Define the method isPalindrome

    public String isPalindromeTest(String[] inputArray){
        String output2 = "";
        String output1 = "";
        String outputTrue = "True";
        String outputFalse = "False";
        //String temp = new StringBuilder();
        String [] myPartyList =  {"Sausage", "Eggs", "Beans", "Beans", "Eggs", "Sausage"};

        for (int i = myPartyList.length -1; i >= 0; i--){
            output2 += myPartyList[i] + ", ";
            //System.out.println(output2);
        }

        for (int i = 0; i < myPartyList.length; i++){
            output1 += myPartyList[i] + ", ";
        }
        if (output2.equals(output1) ){
            return outputTrue;
        }

        return outputFalse;

    }


    //TODO Define the method compress

    public String compressTest(int[] inputArray){
        int [] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};
        String output = "";
        String j = "";

        for (int i = nums.length; i < nums.length; i++){
            //for (int j = 1; j < nums.length; j++){

                if (nums[i] != nums[i+1] ) {
                output += nums[i];
               // }
            }

        }

        return output;
    }



    //TODO Define the method pack



}

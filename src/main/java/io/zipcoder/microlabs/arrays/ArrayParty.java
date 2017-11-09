package io.zipcoder.microlabs.arrays;


import com.sun.deploy.util.ArrayUtil;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.Collections;

public class ArrayParty {

       public String printArray(String[] inputArray){
        String output = "*** Output ***";
         // String [] myPartyList =  {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};

          for (int i = 0; i < inputArray.length; i++){
              output += "\n" + inputArray[i];

          }

        return output;
    }

    public String lastElement(String[] inputArray){

        String output = "";
       // String [] breakfast =  {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        for (int i = 0; i < inputArray.length; i++) {
            if (i == inputArray.length-1)
            output += inputArray[i];
        }
        return output;
    }

   // TODO Define the method lastButOne

    public String lastButOne(String[] inputArray){

        String output = "";
        String [] breakfast =  {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        for (int i = 0; i < breakfast.length; i++) {
            if (i == breakfast.length-2)
                output += breakfast[i];
        }
        return output;

    }


    //TODO Define the method reverse

    public String reverse(String[] inputArray){
        String output = "*** Output ***";
        //String temp = new StringBuilder();
     //   String [] myPartyList =  {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};

        for (int i = inputArray.length -1; i >= 0; i--){
            output += "\n" + inputArray[i];
        }
        return output;
    }

    //TODO Define the method isPalindrome

    public String isPalindrome(String[] inputArray){
        for(int i = 0 ; i<inputArray.length/2;i++){
                        if(!inputArray[i].equals(inputArray[inputArray.length-1-i])){
                               return "False";
                            }
                   }
                return "True";
            }




    //TODO Define the method compress

    public String compress(int[] inputArray){
      //  int [] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};
        String output = "compress(nums)\n*** Output ***\n"+inputArray[0];

        for (int i = 1; i < inputArray.length; i++){
                if (inputArray[i] != inputArray[i-1] ) {
                output += "\n" + inputArray[i];
            }
        }
        return output;
    }



    //TODO Define the method pack
    public String pack(char[] inputArray){
        //char [] letters = {'a','a','a','a','b','c','c','a','a','d','e','e','e','e'};
        String output = "pack(nums)\n*** Output ***\n: "+inputArray[0];

        for (int i = 1; i < inputArray.length; i++){
            if (inputArray[i]==(inputArray[i-1])) {
                output += inputArray[i];
            } else {
                output += ", " + inputArray[i];
            }
        }
        return output;
    }




}

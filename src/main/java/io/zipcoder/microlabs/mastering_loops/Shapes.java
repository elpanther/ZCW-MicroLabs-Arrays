package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

    public String triangle(){
        String output = "triangle()\n*** Output ***";
        int lines = 6;
        for (int t =1; t < lines; t++){
            String star = "";
           for (int i=0; i<t; i++) {
               star +="*";
                          }
            output += "\n" + star;
        }

        return output;
    }

    public String tableSquare(){
        String output = "tableSquare()\n*** Output ***";
        for (int l =1; l <5; l++){
            int newNum = 0;
                output += "\n";
                for (int cnt =0; cnt < 4; cnt++){
                    newNum = newNum + l;
                    output +=  "|" + newNum ;
            }
            output +=  "|";

        }

        return output;
    }

    public String tableSquares(int n){
        String output = "###Example\ntableSquares(6)\n*** Output ***\nA 6 x 6 table square";
        int increase = 6;
        for (int l =1; l <=increase; l++){
            int newNum = 0;
            output += "\n";
            for (int cnt =0; cnt < increase; cnt++){
                newNum = newNum + l;
                output +=  "|" + newNum ;
            }
            output +=  "|";
        }
        return output;
    }
}

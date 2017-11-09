<<<<<<< HEAD
# Arrays

## 1 Print Array
Write a method that returns a string of elements in an array, one element per line.

```
Example
1: String [] breakfast = {"Sausage", "Eggs", "Beans",
"Bacon", "Tomatoes", "Mushrooms"};
2:
3: printArray(breakfast)
4: *** Output ***
5: Sausage
6: Eggs
7: Beans
8: Bacon
9: Tomatoes
10: Mushrooms
```

## 2 Last Element of Array
Write a method that returns the last element of a string in an given array

```
Example
1: String [] breakfast = {"Sausage", "Eggs", "Beans",
"Bacon", "Tomatoes", "Mushrooms"}
2:
3: System.out.println(lastElement(breakfast));
4: *** Output ***
5: Mushrooms
```

## 3 Last But One Element of Array
Write a method that returns the last but one element of a string in a given array.

```
Example
1: String [] breakfast = {"Sausage", "Eggs", "Beans",
"Bacon", "Tomatoes", "Mushrooms"}
2:
3: System.out.println(lastButOne(breakfast));
4: *** Output ***
5: Tomatoes

```

## 4 Reverse an Array

Write a method that reverses the elements of an array

```
Example
1: String [] breakfast = {"Sausage", "Eggs", "Beans",
"Bacon", "Tomatoes", "Mushrooms"};
2:
3: System.out.println(reverse(breakfast));
4: *** Output ***
5: : Mushrooms
6: : Tomatoes
7: : Bacon
8: : Beans
9: : Eggs
10: : Sausage
11:
```

## 5 Palindromic Arrays

Write a method that tests to see if an array is palindromic, i.e. the elements are the same when reversed.

```
Example
1: String [] palindromic = {"Sausage", "Eggs", "Beans",
"Beans", "Eggs", "Sausage"};
2: String [] breakfast = {"Sausage", "Eggs", "Beans",
"Bacon", "Tomatoes", "Mushrooms"}
3:
4: System.out.println(isPalindrome(palindromic));
5: System.out.println(isPalindrome(breakfast));
6: *** Output ***
7: True
8: False

```

## 6 Consecutive Duplicates

Write a method to print out an int array with consecutive duplicates eliminated.

```
1: int [] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};
2:
3: compress(nums)
4: *** Output ***
5: : 1
6: : 3
7: : 2
8: : 1
9: : 4
10: 
```

## 7 Pack Duplicates

Pack consecutive duplicates of a char array into Strings.

```
1: char [] letters = {'a' 'a' 'a' 'a' 'b' 'c' 'c' 'a' 'a' 'd'
'e' 'e' 'e' 'e'};
2:
3: pack(nums)
4: *** Output ***
5: : aaaa, b, cc, aa, d, eeee
6:
```
=======
# ZCW-MicroLabs-Loops

##1) 1 to 10
In the class **Numbers**, complete the method called **oneToTen()** so that it returns a string of the numbers 1 to 10. The Unit Test is provided for you.

###Example<br>
1: oneToTen()<br>2: *** Output ***<br>3: 1<br>4: 2<br>5: 3<br>6: 4<br>7: 5<br>8: 6<br>9: 7<br>10: 8<br>11: 9<br>12: 10<br>
## 2) Odd NumbersIn the class **Numbers**, complete the method called **oddNumbers()** so that it returns a string of the positive odd numbers less than 20. The Unit Test is not provided for you, you must complete it.

###Example<br>
1: oddNumbers()<br>2: *** Output *** <br>3: 1<br>4: 3<br>5: 5<br>6: 7<br>7: 9<br>8: 11<br>9: 13<br>10: 15<br>11: 17<br>12: 19<br>
## 3) Square NumbersIn the class **Numbers**, complete the method called **squares()** so that it returns a string of the square numbers up to 100. The Unit Test is not provided for you, you must complete it.
###Example<br>
1: squares()<br>2: *** Output *** <br>3: 1<br>4: 4<br>5: 9<br>6: 16<br>7: 25<br>8: 36<br>9: 49<br>10: 64<br>11: 81<br>12: 100<br>
## 4) Random NumbersIn the class **Numbers**, complete the method called **random4()** so that it returns a string of out four random integers between 1 and 10. The Unit Test is not provided for you, you must complete it.

###Example<br>
1: random4()<br>2: *** Output *** <br>3: 3<br>4: 5<br>5: 2<br>6: 8<br>
## 5) Even Numbers < nIn the class **Numbers**, complete the method called **even()** so that it returns a string of the positive even numbers less than n. The Unit Test is not provided for you, you must complete it.###Example<br>
1: even(20)<br>2: *** Output *** <br>3: 2<br>4: 4<br>5: 6<br>6: 8<br>7: 10<br>8: 12<br>9: 14<br>10: 16<br>11: 18<br>
## 6) Powers of 2In the class **Numbers**, complete the method called **powers()** so that it returns a string of out the powers of 2 from 2^1 up to to 2^n. The Unit Test is not provided for you, you must complete it.

###Example<br>
1: powers(8)<br>2: *** Output *** <br>3: 2<br>4: 4<br>5: 8<br>6: 16<br>7: 32<br>8: 64<br>9: 128<br>10: 256<br>
## 7) Are we there yet?In the class **CarRide**, complete the class so that it returns that outputs "Are we there yet?" and then waits for input. If the input is "Yes" the program ouputs "Good!" and exits, otherwite the program loops. The Unit Tests is not provided for you, you must complete it.

###Example<br>
1: "Are we there yet?"<br>2: No<br>3: "Are we there yet?"<br>4: Spoons<br>5: "Are we there yet?"<br>6: Yes<br>7: Good!<br>
## 8) TriangleIn the class **Shapes**, complete the method called **triangle()** so that it uses nested loops to produce the following pattern . The Unit Test is not provided for you, you must complete it.

###Example<br>1: triangle()<br>2: *** Output *** <br>3: * <br>4: ** <br>5: *** <br>6: **** <br>7: ***** <br>
## 9) Table SquareIn the class **Shapes**, complete the method called **tableSquare()** so that it uses nested loops to produce a 4x4 table square. The Unit Test is not provided for you, you must complete it.

###Example<br>
tableSquare()<br>*** Output *** <br>A 4 x 4 table square<br>
 ```
 | 1 |  2 |  3 |  4 | | 2 |  4 |  6 |  8 |
 | 3 |  6 |  9 | 12 |
 | 4 |  8 | 12 | 16 |
 
 ```
## 10) Table SquaresIn the class **Shapes**, extend your answer to the last question produce a method that will return string of characters out og ***n x n*** table square. The Unit Test is not provided for you, you must complete it.
###Example<br>
 tableSquares(6)<br> *** Output *** <br> A 6 x 6 table square<br>
 
 ```
 | 1 |  2 |  3 |  4 |  5 |  6 | | 2 |  4 |  6 |  8 | 10 | 12 |
 | 3 |  6 |  9 | 12 | 15 | 18 |
 | 4 |  8 | 12 | 16 | 20 | 24 |
 | 5 | 10 | 15 | 20 | 25 | 30 |
 | 6 | 12 | 18 | 24 | 30 | 36 |
 ```
 
>>>>>>> 83d1b8803cf6b6e411003110efb9f990e12c0ce9

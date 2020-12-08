package final_easy;

import java.util.ArrayList;
import java.util.Scanner;


class MyData{
    // ATTENTION: Please don't modify anything on the MyData class.
    // Or else, you will fail the easy part directly.
    int value;

    public MyData(int v){
        this.value = v;
    }
}

public class FinalExamEasy {
    // You can add functions to the FinalExamEasy class.
    // For existing functions, please don't change their name or return type.

    public boolean checkIfANumberIsEven(int number){
        /* TODO Question 1
        Write a program called checkIfANumberIsEven which
        checks if the int variable “number” is odd (return true),
        or even otherwise (return false).
        For example,
        2, 4, 6, 8, 10 are even,
        1, 3, 5, 7, 9 are odd.
        Please don't modify the return type (boolean).
        */
        return false;
    }

    public void printDayOfTheWeekInChinese(int dayNumber){
        /* TODO Question 2
         Write a program called printDayOfTheWeekInChinese which prints
         “星期一”, “星期二”, ... “星期日” if the int variable
         "dayNumber" is 1, ..., 7, respectively.
         Otherwise, it shall print "计算失败".
         Please use a "switch-case-default" statement.
         Please don't modify the return type (void).
         You can use print or println, it won't make any difference to our test.
         */
    }

    public double computePIWithSeriesExpansion(){
        /* TODO Question 3
        We know that PI = 4 * (1/1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)
        Use a for or while loop to calculate this value.
        The loop stops when either of the two conditions is fulfilled:
        1. we are at ... -1/19 + 1/21.
        2. or, if abs(pi - 3.141592663) <= 0.000000001
        Please use a for or while loop statement.
        Please don't modify the return type (double).
        */
        double pi = 0.0;
        return pi;
    }

    public void Question4(){
        /* TODO Question 4
        Write a program called SquarePattern that prompts
        user for the size (a non-negative integer in int);
        and prints the following square pattern using two nested for-loops.
        Enter the size: 5
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        Please don't modify the return type (void).
        */
    }

    public void Question5(){
        /*
        Write a programs called NumberPatternX
         that prompts user for the size
         (a non-negative integer in int); and prints the pattern as shown:
         8 7 6 5 4 3 2 1
         7 6 5 4 3 2 1
         6 5 4 3 2 1
         5 4 3 2 1
         4 3 2 1
         3 2 1
         2 1
         1
         */
    }

    public void Question6(){
        /*
         Sort an array of MyData, using bubblesort or selectionsort.
         Please don't modify anything on the MyData class.
         You can add functions to the FinalExamEasy class.
        */
    }

    public void Question7(){
        /*
         Find the 2nd maximum number of an array of MyData
        */
    }

    public void Question8(){
        /*
        Find the number of an array of MyData whose absolute is the most in proximity to 100.
        */
    }

    public static void main(String[] args) {



    }
}

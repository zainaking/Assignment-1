package demo;

import java.util.Scanner;

public class homework1 {
    //Create a method that ask a user for a number (eg: 100 )
    //If the number is divisible by 3 the print zip
    //if the number is divisible by 5 then print code
    //if the number is divisible by 3 and 5 then print zipcode

    public void zipNum(int x) {



        if (x % 3 == 0 && x % 5 == 0) {
            System.out.println("ZipCode");


        } else if (x % 5 == 0) {
            System.out.println("Code");

        } else if (x % 3 == 0 ) {
            System.out.println("Zip");


        }
    }

}

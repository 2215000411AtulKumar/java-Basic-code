// 9.	Write a Java program to input any character and check whether it is alphabet, digit or special character.

import java.util.Scanner;

public class alphaDigSpec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character to check alphabet or not:");
        char ch = sc.next().charAt(0);
        int ascii =ch;

        if ((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
            System.out.println(ch+" is alphabet.");
        else if(ch>=48 && ch<=57)
            System.out.println(ch+" is Digit.");
        else
            System.out.println(ch+" is Special Character");
    }
}

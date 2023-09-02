// 7.	Write a Java program to check whether a character is alphabet or not.

import java.util.Scanner;
public class alphabetOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character to check alphabet or not:");
        char ch = sc.next().charAt(0);
        int ascii =ch;

        if ((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
            System.out.println(ch+" is alphabet.");
        else
            System.out.println(ch+" is not alphabet.");
    }
}

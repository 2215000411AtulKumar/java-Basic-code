// 8.	Write a Java program to input any alphabet and check whether it is vowel or consonant.

import java.util.Scanner;
public class vowelOrNot {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any character to check vowel or consonant or not:");
            char ch = sc.next().charAt(0);
            if ((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') ||(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'))
                System.out.println(ch+" is vowel.");
            else
                System.out.println(ch+" is not consonant.");

    }
}

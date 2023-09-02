// 1.	Write a  Java program to find maximum between two numbers.

import java.util.Scanner;
public class maxTowNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int fnum = sc.nextInt();
        System.out.print("Enter second number:");
        int snum = sc.nextInt();
        if (fnum > snum)
            System.out.println(fnum +" is maximum.");
        else
            System.out.println(snum +" is maximum.");
    }
}

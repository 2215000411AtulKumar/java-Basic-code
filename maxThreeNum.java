// 2.	Write a   Java   program to find maximum between three numbers.

import java.util.Scanner;
public class maxThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int fnum = sc.nextInt();
        System.out.print("Enter second number:");
        int snum = sc.nextInt();
        System.out.print("Enter third number:");
        int tnum = sc.nextInt();
        if (fnum > snum & fnum > tnum)
            System.out.println(fnum +" is maximum.");
        else if (snum > fnum & snum > tnum)
            System.out.println(snum +" is maximum.");
        else
            System.out.println(tnum +" is maximum.");
    }
}

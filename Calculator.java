//     -----------Name:- Atul Kumar --------Univ. Roll No:- 2215000411 ----------   

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1=sc.nextInt();
        System.out.print("which operation want you perform:");
        String sign = sc.next();

        System.out.print("Enter the second number:");
        int num2=sc.nextInt();
        switch (sign)
        {
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
        }
    }
}

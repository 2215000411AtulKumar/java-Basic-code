import java.util.Scanner;
public class simpleInterest {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle:");
        float p= sc.nextFloat();
        System.out.print("Enter the rate of interest:");
        float r= sc.nextFloat();
        System.out.print("Enter the time:");
        float t= sc.nextInt();
        System.out.println("--------"+"Simple Interest: "+(p*r*t)/100+"--------");
    }
}

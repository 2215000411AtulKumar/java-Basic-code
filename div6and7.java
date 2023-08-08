import java.util.Scanner;
public class div6and7 {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your number:");
        int num = sc.nextInt();
        if(num%6==0 && num%7==0)
            System.out.println(num+" is divisible by 6 and 7.");
        else
            System.out.println(num+" is not divisible by 6 and 7.");   
            
    }
}

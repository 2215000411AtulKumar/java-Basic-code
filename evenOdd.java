import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter to check  your number is even or odd:");
		int num=sc.nextInt();
		if (num==0)	
            System.out.println(num+" is zero");
        else if(num%2==0)
            System.out.println(num+" is even"); 
        else
            System.out.println(num+" is odd");      
	}
}

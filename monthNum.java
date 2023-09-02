import java.util.Scanner;

public class monthNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Month number(1 to 12):");
        int num = sc.nextInt();
        if(num==1 || num==3 || num==5 || num==7 || num==8 || num==10 || num==12)
            System.out.println("This month has 31 days.");
        else if(num==4 || num==6 || num==9 || num==11)
            System.out.println("This month has 30 days.");
        else if(num==2)
            System.out.println("This month has 28/29 days.");
        else
            System.out.println("Please enter the number in given range.");
    }
}


import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number (in  3 digit) to check it is armstrong or not :");
        int num = sc.nextInt();
        double sum=0, cnum=num;
        while(num!=0) {
            int rem = num % 10;
            sum += Math.pow(rem, 3);
            num /= 10;
        }
        if (sum==cnum)
            System.out.println("Number is Armstrong.");
        else
            System.out.println("Number is not Armstrong.");
    }
}

import java.util.Scanner;
public class countAlphaDigSpec {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str =sc.next();
        int alpha=0, digit=0,SpecialChar=0;
        for(int i=0; i<str.length();i++)
        {
            if(str.charAt(i)>=65 && str.charAt(i)<=90 || str.charAt(i)>=97 && str.charAt(i)<=122)
                alpha+=1;
            else if(str.charAt(i)>=48 && str.charAt(i)<=57)
                digit+=1;
            else
                SpecialChar+=1;
        }
        System.out.printf("Alphabet:%d\n",alpha);
        System.out.printf("Digit:%d\n",digit);
        System.out.printf("SpecialCharacter:%d\n",SpecialChar);
    }
}

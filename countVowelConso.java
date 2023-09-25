import java.util.Scanner;
public class countVowelConso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str.toLowerCase();
        int countVowel=0, countConso=0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
                countVowel +=1;
            else if(str.charAt(i)=='A'|| str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
                countVowel +=1;
            else
                countConso+=1;
        }
        System.out.println("Count of Vowel: "+countVowel);
        System.out.println("Count of Consonant: "+countConso);
    }
}

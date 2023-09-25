import java.util.*;
public class Solution{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String k,first;
        
            
        if(s.charAt(0)<=122 && s.charAt(0)>=90)
                {
                  
                    first=s.substring(0,1);
                    k=first.toUpperCase()+s.substring(1);
                    System.out.println(k);

                }
                
        else 
            System.out.println(s); 
             
        }
    }
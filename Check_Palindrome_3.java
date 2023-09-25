import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        str = str.replaceAll("\\s", "").toLowerCase();

        StringBuilder reversed = new StringBuilder(str).reverse();
        
        if (str.equals(reversed.toString())) 
            System.out.println("true");
        else 
            System.out.println("false");
    }
}
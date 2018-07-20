import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution {
	public static void main (String[] args) throws java.lang.Exception {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        boolean flag = false;

        if(s.equals(new StringBuffer(s).reverse().toString())) {
            // s is a palindrome
            for(int i=s.length(); i>=0; i--) {
                if(!(s.substring(0, i).equals(new StringBuffer(s.substring(0, i)).reverse().toString()))) {
                    System.out.println(s.substring(0, i).length());
                    flag = true;
                    break;
                }
            }

            if(!flag) {
                System.out.println(0);
            }

        } else {
            // s is not a palindrome
            System.out.println(s.length());
        }

        scanner.close();
	}
}

import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        while(T-->0) {
            
            String s1 = scanner.nextLine();            

            StringBuilder stringA = new StringBuilder(s1);

            String s2 = scanner.nextLine();
            StringBuilder stringB = new StringBuilder(s2);

            ArrayList<Character> deletedChars = new ArrayList<>();

            for(int i=0; i<stringA.length(); i++) {
                for(int j=0; j<stringB.length(); j++) {
                    if(stringA.charAt(i) == stringB.charAt(j)) {
                        deletedChars.add(stringA.charAt(i));
                        stringA.deleteCharAt(i);
                        System.out.println(i);
                    }  
                }
                System.out.println(stringA);
            }

            System.out.println(deletedChars);

            for(int i=0; i<stringB.length(); i++) {
                for(int j=0; j<deletedChars.size(); j++) {
                    if(stringB.charAt(i) == deletedChars.get(j)) {
                        stringB.deleteCharAt(i);
                    }
                }
                System.out.println(stringB);
            }

            System.out.println(stringA.append(stringB));
        
        }
        scanner.close();
    }
}

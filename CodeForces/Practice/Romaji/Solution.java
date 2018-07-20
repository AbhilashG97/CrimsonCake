import java.util.Scanner;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        int lastIndex = 0; 
        
        ArrayList<Character> vowelList = new ArrayList<>();
        
        vowelList.add('a');
        vowelList.add('e');
        vowelList.add('i');
        vowelList.add('o');
        vowelList.add('u');

        if(s.length() == 1) {
            if(s.charAt(0) == 'n' || vowelList.contains(s.charAt(0))) {
                System.out.println("YES");
                System.exit(0);
            } else {
                System.out.println("NO");
                System.exit(0);
            }
        }

        for(int i=0; i< s.length() - 1; i++) {
            if(!vowelList.contains(s.charAt(i)) && (s.charAt(i) != 'n')) { 
                if(!vowelList.contains(s.charAt(i+1))) {
                    System.out.println("NO");
                    System.exit(0);;
                } 
            } else {

            }
            lastIndex = i;
        }            

        if(vowelList.contains(s.charAt(lastIndex))) {
            if(vowelList.contains(s.charAt(lastIndex+1)) || (s.charAt(lastIndex+1) == 'n')) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            if(vowelList.contains(s.charAt(lastIndex+1)) || (s.charAt(lastIndex+1) == 'n')) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } 

        scanner.close();
    }
}
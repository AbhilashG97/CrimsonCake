import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int stringLength = s.length();
        
        System.out.println((stringLength+1)*26 - (stringLength));
        scanner.close();
    }
}
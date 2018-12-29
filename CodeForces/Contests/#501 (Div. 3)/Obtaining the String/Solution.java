import java.util.Scanner;

public class Solution {

    public static String swap(String s, int index) {
        StringBuilder sb = new StringBuilder(s);
        char tmp = sb.charAt(index);

        sb.setCharAt(index, sb.charAt(index-1));
        sb.setCharAt(index-1, tmp);

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();

        String s = scanner.nextLine();
        String t = scanner.nextLine();

        for(int i=0; i<n; i++) {
            if(t.charAt(i) != s.charAt(i)) {
                for(int k=i; k < n; k++) {
                    
                }
                System.exit(0);
            }
        }
        scanner.close();
    }
}
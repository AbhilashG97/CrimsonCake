import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;

public class Solution {

    public static String reverseChars(int limit, String input) {

        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder(input);

        for(int i=0; i<limit; i++) {
            stack.push(input.charAt(i));
        }

        for(int j=0; j<limit; j++) {
            stringBuilder.setCharAt(j, stack.pop());
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String t = scanner.nextLine();
        ArrayList<Integer> divisorList = new ArrayList<>();

        for(int i=1; i<=n; i++) {
            if(n%i == 0) {
                divisorList.add(i);
            }
        }

        for(int j=0; j<divisorList.size(); j++) {
            t = reverseChars(divisorList.get(j), t);
        }

        System.out.println(t);
        scanner.close();
    }
}
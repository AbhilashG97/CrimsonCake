import java.util.Scanner;

public class Solution {

    public static void getResult(String a, String b) {
        int tempCount = 0;

        for(int i=0; i<a.length(); i++) {
            if(!(a.charAt(i) == b.charAt(i))) {
                ++tempCount;
            }

            if(tempCount > 1) {
                System.out.println("NO");
                System.exit(0);
            }
        }

        if(tempCount == 1) {
            System.out.println("YES");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        if(input.length() == 1) {
            System.out.println("YES");
            System.exit(0);
        }

        if(input.length()%2 == 0) {
            // even
            String a = input.substring(0, input.length()/2);
            String b = new StringBuilder(input.substring(input.length()/2))
                                        .reverse().toString();

            if(a.equals(b)) {
                System.out.println("NO");
                System.exit(0);
            }
            
            getResult(a, b);

        } else {
            // odd
            String a = input.substring(0, input.length()/2);
            String b = new StringBuilder(input.substring(input.length()/2+1))
                                        .reverse().toString();

            if(a.equals(b)) {
                System.out.println("YES");
                System.exit(0);
            }
            getResult(a, b);

        }
        scanner.close();
    }    
}
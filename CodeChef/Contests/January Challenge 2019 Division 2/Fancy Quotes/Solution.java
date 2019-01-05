import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        Scanner iterator = null;
        while (T-->0) { 
            String S = scanner.nextLine();
            iterator = new Scanner(S);
            boolean containsNot = false;
            while(iterator.hasNext()) {
                String token = iterator.next();
                if(token.equals("not")) {
                    System.out.println("Real Fancy");
                    containsNot = true;
                    break;
                }
            }
            if(!containsNot) {
                System.out.println("regularly fancy");
            }
        }
        iterator.close();
        scanner.close();
    }   
}
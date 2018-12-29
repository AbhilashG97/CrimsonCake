import java.util.Scanner;

public class Solution {

    private static int getFirstAndLastCharSameIndex(String string) {
        int returnValue = 0;
        for(int i=0; i<string.length()/2; i++) {
            if(string.charAt(i) == string.charAt(string.length()-(i+1))) {
                System.out.println(i+" "+(string.length()-(i+1)));
                returnValue = i;
            } else {
                if(i >= string.length()/2) {
                    System.out.println(i+1);
                    return i+1;
                } else {
                    
                }
            }
        }
        return returnValue+1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        String t = scanner.nextLine();
        StringBuilder sb = new StringBuilder(t);

        if(n==1) {
            for(int i=0; i<k-1; i++) {
                sb.append(t);
            }
            System.out.println(sb);
            System.exit(0);
        }

        int index = getFirstAndLastCharSameIndex(t);

        String subString = t.substring(index);

        System.out.println(index+" "+subString);

        for(int i=0; i<k-1; i++) {
            sb.append(subString);
        }

        System.out.println(sb);


        scanner.close();
    }
}
import java.util.Scanner;

public class Solution {

    private static final int[] COLORS = new int[]{2, 5, 8}; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int totalNumberOfBooks = 0;

        for(int i=0; i<COLORS.length; i++) {
            int remainder = 0;
            int quotient = 0;
            remainder = (COLORS[i]*n)%k;
            quotient = (COLORS[i]*n)/k;

            if(remainder == 0) {
                totalNumberOfBooks+=quotient;
            } else {
                totalNumberOfBooks+=(quotient+1);
            }
        }
        System.out.println(totalNumberOfBooks);
        scanner.close();
    }    
}
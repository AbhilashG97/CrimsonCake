import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while(t-->0) {
            long a = scanner.nextInt();
            long b = scanner.nextInt();
            long k = scanner.nextInt();
            long distance = 0;

            if(a == b) {
                if(k%2 == 0) {
                    distance=0;
                } else {
                    distance=a;
                }
            } else {
                long limit = k/2;
                if (k%2 == 0) {    
                    distance=(limit*a)-(limit*b); 
                } else {
                    distance=(a*(limit+1))-(b*limit);
                }
            }
            System.out.println(distance);
        }
        scanner.close();        
    }
}
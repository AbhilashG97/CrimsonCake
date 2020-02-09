
// https://codeforces.com/problemset/problem/1176/A
import java.util.Scanner;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        ArrayList<Long> primeList;
        // int count = 1;
        while (q-- > 0) {
            long n = scanner.nextLong();
            boolean temp = false;
            int result = 0;
            int numberOfThrees = 0;
            int numberOfFives = 0;
    
            primeList = new ArrayList<>();
    
            if (n == 1) {
                System.out.println("0");
            }
    
            while (n % 2 == 0) {
                primeList.add(2L);
                n /= 2;
            }
    
            for (long i = 3; i <= Math.sqrt(n); i += 2) {
                while (n % i == 0) {
    
                    if (i == 3) {
                        primeList.add(i);
                        numberOfThrees++;
                    }
    
                    if (i == 5) {
                        primeList.add(i);
                        numberOfFives++;
                    }
    
                    if (i > 5) {
                        System.out.println("-1");
                        // System.out.println(count + " " + "-1");
                        primeList.clear();
                        temp = true;
                        break;
                    }
    
                    n /= i;
                }
            }
    
            if (n > 2) {
                if (n == 5){
                    primeList.add(n);
                    numberOfFives++;
                } else if (n == 3){
                    primeList.add(n);
                    numberOfThrees++;
                }
                if (n > 5 && !temp) {
                    System.out.println("-1");
                    // System.out.println(count + " " + "-1");
                    primeList.clear();
                }
            }
    
            if (!primeList.isEmpty()) {
                result = primeList.size() + numberOfFives*2 + numberOfThrees;
                // System.out.println(count + " " + result);
                System.out.println(result);
            }
            // count++;
        }
        scanner.close();
    }
}
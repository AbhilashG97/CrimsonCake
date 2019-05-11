import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        int sum1 = x1 + v1;
        int sum2 = x2 + v2;
        String result = "NO";

        if((x1 == x2) && (v1 == v2)) {
            return "YES";
        }

        while (true) {
            System.out.println(sum1 + " " + sum2);
            if(sum1 == sum2) {
                result = "YES";
                break;
            }
            sum1 += v1;
            sum2 += v2;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int v1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int v2 = scanner.nextInt();

        System.out.println(kangaroo(x1, v1, x2, v2));
        scanner.close();
    }
}

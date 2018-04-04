import java.util.*;
import java.lang.*;
import java.io.*;

public class CodeForces {
	public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] squares = new int[m];
        int[] count = new int[n+1];

        for(int i=0; i<m; i++) {
            squares[i] = scanner.nextInt();
            count[squares[i]]++;
        }

        Arrays.sort(count);
        System.out.println(count[1]);
        scanner.close();
	}
}
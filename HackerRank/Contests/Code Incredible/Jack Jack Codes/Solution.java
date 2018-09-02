import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
    
        int[] numbers = new int[N];

        for(int i=0; i<N; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        // for(int i=0; i<N; i++) {
        //     System.out.println(numbers[i]);
        // }

        int begin = 0, end = numbers.length-1;

        while(begin < end) {
            if(numbers[begin] + numbers[end] == M) {
                System.out.println("True");
                System.exit(0);
            } else if (numbers[begin] + numbers[end] > M) {
                end--;
            } else {
                begin++;
            }
        }

        System.out.println("False");
        scanner.close();
    }
}
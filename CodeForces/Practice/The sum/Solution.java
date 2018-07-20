import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int a = 1;
        int b = 1;
        int sum = 2, c=0;
        //System.out.println(a+" "+b); 

        if(K == 1) {
            System.out.println(1);
        } else {
            for(int i=2; i<K; i++) {
                sum = sum + a + b;
                c = a+b;
                a = b;
                b = c;
                //System.out.print(c+" ");
            }
            System.out.println(sum);
        }

        scanner.close();
    }
}
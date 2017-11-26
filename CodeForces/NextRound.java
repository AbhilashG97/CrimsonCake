import java.util.Scanner;

public class NextRound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] scores = new int[n];
        int temp = 0, count = 0;
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        for (int j = 0; j < n; j++) {
            if (scores[j] > 0) {
                temp = scores[k - 1];
                if (temp <= scores[j]) {
                    count++;
                } else {
                    break;
                }
            } else {
                System.out.println(count);
                return;
            }
        }
        System.out.println(count);
    }

}
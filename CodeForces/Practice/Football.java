import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.contains("1111111") || input.contains("0000000")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
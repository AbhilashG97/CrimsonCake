import java.util.Scanner;
import java.util.ArrayList;

public class TooLongWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> words = new ArrayList<>(n);
        while (n-- > 0) {
            words.add(scanner.next());
        }
        for (String i : words) {
            if (i.length() > 10) {
                int number = i.length() - 2;
                System.out.println(i.charAt(0) + "" + number + "" + i.charAt(i.length() - 1));
            } else {
                System.out.println(i);
            }
        }
    }

}
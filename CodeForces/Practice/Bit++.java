import java.util.Scanner;
import java.util.ArrayList;

public class BitPP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        ArrayList<String> input = new ArrayList<>(n);
        while (n-- > 0) {
            ArrayList.add(scanner.next());
        }
        for (String i : input) {
            if (i.contains("+")) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println(count);
    }
}
import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        input = input.toLowerCase();
        if (input.contains("a") || input.contains("e") || input.contains("i") || input.contains("o") || input.contains("u") || input.contains("y")) {
            input = input.replaceAll("[aeiouy]+", "");
        }
        if (input.matches("[^aieouy]+")) {
            input = input.replaceAll("", ".");
        }
        input = input.replaceAll(".$", "");
        System.out.println(input);
        scanner.close();
    }
}
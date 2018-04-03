import java.util.Scanner;

public class CodeForces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String toUppercase = ("" + input.charAt(0)).toUpperCase();
        System.out.println(toUppercase+""+input.substring(1,input.length()));
        scanner.close();
    }
}
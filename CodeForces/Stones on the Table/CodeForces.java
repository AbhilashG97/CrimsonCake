import java.util.Scanner;

public class CodeForces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), countStones=0;
        String inputString = scanner.next();
        char compareChar = inputString.charAt(0);
        for(int i=1; i<n; i++){
            if(compareChar == inputString.charAt(i)){
                countStones++;
            }else {
                compareChar=inputString.charAt(i);
            }
        }
        System.out.println(countStones);
        scanner.close();
    }
}
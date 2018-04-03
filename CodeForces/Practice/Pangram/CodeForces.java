import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class CodeForces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String inputString = (scanner.next()).toLowerCase();
        char[] charArray = inputString.toCharArray();
        
        Set<Character> characterSet = new HashSet<>();
        
        for(char c : charArray){
            characterSet.add(c);
        }

        if(characterSet.size()==26){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        scanner.close();
    }
}
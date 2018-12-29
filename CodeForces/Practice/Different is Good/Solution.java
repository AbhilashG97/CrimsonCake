import java.util.Scanner;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        
        scanner.nextLine();

        String s = scanner.nextLine();

        if(n == 1) {
            System.out.println(-1);
            System.exit(0);
        }

        ArrayList<String> subStringList = new ArrayList<>();
        ArrayList<String> subStringListT = new ArrayList<>();

        for(int i=0; i<s.length(); i++) {
            for(int j=i; j<=s.length(); j++) {
                String tmp = s.substring(i, j);
                if(subStringList.contains(tmp) && !(tmp.equals(""))) {
                    subStringListT.add(tmp);
                } else {
                    if(!tmp.equals("")) { 
                        subStringList.add(tmp);
                    }
                }
            }
        }

        int maxStringLength = 0, count = 0;
        for(String i : subStringListT) {
            if(i.length() >= maxStringLength) {
                maxStringLength = i.length();
                count += maxStringLength;
            }
        }

        System.out.println(subStringList);
        System.out.println(subStringListT);

        if(count > maxStringLength) {
            System.out.println(count);
        } else {
            System.out.println(maxStringLength);
        }
        scanner.close();
    }
}
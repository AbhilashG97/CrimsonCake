import java.util.Scanner;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine();
        String s  = scanner.nextLine();
        ArrayList<String> stringList = new ArrayList<>();


        for(int i=0; i<s.length()-1; i++) {
            stringList.add(s.substring(i, i+2));
        }

        int count = 0, max = 0;
        String substringValue = "";
        for(int j=0; j<stringList.size(); j++) {
            for(int k=0; k<stringList.size(); k++) {
                if(stringList.get(j).equals(stringList.get(k))) {
                    count++;
                }
            }
            if(count > max) {
                max = count;
                substringValue = stringList.get(j);
            }
            count = 0;
        }

        System.out.println(substringValue);
        scanner.close();
    }
}
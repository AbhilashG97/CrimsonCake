// problem - https://codeforces.com/problemset/problem/1077/B

import java.util.Scanner;
import java.util.ArrayList;

public class Solution {

    private static final String DISTURBED_STATE = "101";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder stateOfLight = new StringBuilder();

        int n = scanner.nextInt();
        int k = 0;
        for(int i=0; i<n; i++) {
            stateOfLight.append(String.valueOf(scanner.nextInt()));
        }

        String lightState = stateOfLight.toString();

        if(lightState.contains(DISTURBED_STATE)) {
            for(int i=0; i<lightState.length()-2; i++) {
                if(lightState.subSequence(i, i+3).equals(DISTURBED_STATE)) {
                    i+=2;
                    k++;
                }
            }
        } else {
            k = 0;
            System.out.println(k);
            System.exit(0);
        }
        System.out.println(k);
        scanner.close();
    }
}
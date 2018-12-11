// Problem statement - https://practice.geeksforgeeks.org/problems/ease-the-array/0

import java.util.Scanner;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-->0) {
            int N = scanner.nextInt();
            
            StringBuilder output = new StringBuilder();
            ArrayList<Integer> input = new ArrayList<>();
            int count = 0;

            for(int i=0; i<N; i++) {
                input.add(scanner.nextInt());
            }

            //System.out.println(input);

            for(int i=0; i<input.size()-1; i++) {
                //System.out.println(input.get(i) +" "+input.get(i+1) +" "+i +" "+(i+1));
                if((input.get(i) == input.get(i+1)) && 
                    (input.get(i+1) != 0)) {
                        //System.out.println("** "+input.get(i) +" "+input.get(i+1));
                        int newNumber = input.get(i)*2;
                        output.append(" "+newNumber);
                        input.set(i+1, 0);
                } else {
                    System.out.println(input.get(i)==input.get(i+1));
                    System.out.println(input.get(i) +" "+input.get(i+1) +" "+i +" "+(i+1));
                    if(input.get(i) != 0) {
                        output.append(" "+input.get(i));
                    } else {
                        count++;
                    }
                }
            }
            
            if (input.get(input.size()-1) != 0) {
                output.append(" "+input.get(input.size()-1));
            } else {
                count++;
            }

            //System.out.println(count);

            for(int i=0; i<count; i++) {
                output.append(" 0");        
            }
            System.out.println(output.toString().trim());
        }
         scanner.close();
    }
}
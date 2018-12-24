import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<Integer, Integer> problemMap = new LinkedHashMap<>();
        int T = scanner.nextInt();
        while(T-- > 0) {

            int D = scanner.nextInt();
            for(int i=1; i<=D; i++) {
                /**
                 * key - day
                 * value - problem
                 */
                problemMap.put(scanner.nextInt(), scanner.nextInt());
            }

            int Q = scanner.nextInt();
            while(Q-- > 0) {
                /**
                 * key - deadline
                 * value - required problem
                 */
                int deadline = scanner.nextInt();
                int requirement = scanner.nextInt();
                int totalProblemsSolved = 0;
                for(Map.Entry<Integer, Integer> entry : problemMap.entrySet()) {
                    if(!(deadline >= entry.getKey())) {
                        //System.out.println(totalProblemsSolved+" "+requirement);
                        if(totalProblemsSolved >= requirement) {
                            System.out.println("Go Camp");
                        } else {
                            System.out.println("Go Sleep");
                        }
                        break;
                    } else {
                        totalProblemsSolved+=entry.getValue();
                        if(deadline == entry.getKey()) {
                            //System.out.println(totalProblemsSolved+" "+requirement);                            
                            if(totalProblemsSolved >= requirement) {
                                System.out.println("Go Camp");
                            } else {
                                System.out.println("Go Sleep");
                            }
                            break;
                        }
                    }
                }
            }

        }
        scanner.close();
    }
}
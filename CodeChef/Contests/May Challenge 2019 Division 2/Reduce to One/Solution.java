import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.*;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T-- > 0) {
            ArrayList<Long> numberList = new ArrayList<>();
            int N = scanner.nextInt();
            numberList = Stream.iterate(1L, i -> i + 1).limit(N)
                               .collect(Collectors.toCollection(ArrayList::new));
  
            long result = 0;
            if (numberList.size() == 1) {
                result = 1;
            } else {
                for(int i=0; i<numberList.size()-1; i+=2) {
                    if(i == numberList.size()-1) {
                        break;
                    }
                    long X = numberList.get(i);
                    long Y = numberList.get(i+1);
                    result = (X + Y + (X*Y))%1000000007;
                    numberList.add(result);
                    //System.out.println(numberList);
                }
            }
            System.out.println(result);            
        }
        scanner.close();
    }
}
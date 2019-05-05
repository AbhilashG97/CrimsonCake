import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.*;
import java.math.BigInteger;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T-- > 0) {
            ArrayList<BigInteger> numberList = new ArrayList<>();
            int N = scanner.nextInt();
            // numberList = Stream.iterate(1, i -> i + 1).limit(N)
            //                    .collect(Collectors.toCollection(ArrayList::new));
            for(int i=1; i<=N; i++) {
                numberList.add(new BigInteger(String.valueOf(i)));
            }
            BigInteger result = new BigInteger("0");
            if (numberList.size() == 1) {
                result = new BigInteger("1");
            } else {
                for(int i=0; i<numberList.size()-1; i+=2) {
                    if(i == numberList.size()-1) {
                        break;
                    }
                    BigInteger X = numberList.get(i);
                    BigInteger Y = numberList.get(i+1);
                    result = (X.add(Y)).add(X.multiply(Y));
                    numberList.add(result);
                    //System.out.println(numberList);
                }
            }
            System.out.println(result);
            //System.out.println("\n\n\n");            
        }
        scanner.close();
    }
}
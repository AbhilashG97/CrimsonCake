import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        long n = 7;
        long temp = n;
        int result = 0;
        int numberOfThrees = 0;
        int numberOfFives = 0;

        ArrayList<Long> primeList = new ArrayList<>();

        if (n == 1) {
            System.out.println("0");
        }

        while (n % 2 == 0) {
            primeList.add(2L);
            n /= 2;
        }

        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {

                if (i == 3) {
                    primeList.add(i);
                    numberOfThrees++;
                }

                if (i == 5) {
                    primeList.add(i);
                    numberOfFives++;
                }

                if (i > 5) {
                    System.out.println("-1");
                    primeList.clear();
                }

                n /= i;
            }
        }

        if (n > 2) {
            if (n == 5){
                primeList.add(n);
                numberOfFives++;
            } else if (n == 3){
                primeList.add(n);
                numberOfThrees++;
            }
            if (n > 5) {
                System.out.println("-1");
                primeList.clear();
            }
        }

        if (!primeList.isEmpty()) {
            result = primeList.size() + numberOfFives*2 + numberOfThrees;
            System.out.println(result);
        }
    }
}
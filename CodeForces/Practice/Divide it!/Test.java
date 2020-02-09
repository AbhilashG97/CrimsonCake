import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        
        int n = 89; 

        ArrayList<Integer> list = new ArrayList<>();

        while (n % 2 == 0) {
            // System.out.println(n);
            list.add(2);
            n /= 2;
        }


        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // System.out.println(n);
            while (n % i == 0) {
                // System.out.println(n);
                list.add(i);
                n /= i;
            }
        }

        if (n > 2)
            // System.out.println(n);
            list.add(n);

        System.out.println(list);
    }
}
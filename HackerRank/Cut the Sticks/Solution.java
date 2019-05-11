import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {

    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        ArrayList<Integer> input = Arrays.stream(arr)  
                                    .boxed()          
                                    .collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<input.size(); i++) {
            for(int j=i; j<input.size(); j++) {
                if(input.get(j) - input.get(i) >= 0) {
                    count++;
                    if(input.get(j) - input.get(i) == 0) {
                        input.remove(j);
                    }
                }             
            }
            System.out.println(count);
            result.add(count);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = cutTheSticks(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

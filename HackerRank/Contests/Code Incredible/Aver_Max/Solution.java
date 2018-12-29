import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while(t-->0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            float[] floatNumbers = new float[n];

            float max = 0.0;
            int maxIndex = -1;
            for(int i=0; i<n; i++) {
                floatNumbers[i] = scanner.nextFloat();
                if(max > Math.abs(floatNumbers[i])) {
                    maxIndex = i;
                }
            }

            for(int j=0; j<n; j++) {

            }

            if(floatNumbers[maxIndex] < 0) {
                for(int k=0; k<maxIndex; k++) {
                    if(floatNumber[k]) {
                        
                    }
                }
            } else {

            }

        }

        scanner.close();
    }
}
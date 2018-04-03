import java.util.Scanner;

public class AryaAndBran {

    public static int getNumberOfDays(int n, int k, int[] candies) {
        int[] temp = new int[n];
        int count = 0, sum = 0, left = 0, tsum = 0;

        if (n == 1) {
            if (k > 8) {
                return -1;
            } else {
                return 1;
            }
        } else {
            for (int i = 0; i < n && sum < k; i++) {
                if (candies[i] > 8) {
                    left = candies[i] - 8;
                    candies[n - (i + 1)] += left;
                    sum += 8;
                    if (sum > k) {
                        count++;
                        temp[i] = k - tsum;
                        tsum += k - tsum;
                        break;
                    }
                    count++;
                    temp[i] = 8;
                    tsum += 8;
                } else {
                    sum += candies[i];
                    tsum += candies[i];
                    count++;
                    temp[i] = candies[i];
                }
            }

            // if(candies[n-1] > 8){
            // 	temp[n-1] = k-sum;
            // 	sum += (k-sum);
            // }else{
            // 	temp[n-1] = candies[n-1];
            // 	sum+=candies[n-1];
            // }
            // count++;

            for (int z : temp) {
                System.out.print(z + " ");
            }
            System.out.println();
            System.out.println(tsum + " " + k);

            if (tsum != k) {
                return -1;
            }

            if (temp.length > n) {
                return -1;
            } else {
                return count;
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] candies = new int[n];

        for (int i = 0; i < n; i++) {
            candies[i] = scanner.nextInt();
        }

        int result = AryaAndBran.getNumberOfDays(n, k, candies);
        System.out.println(result);
    }

}
import java.util.Scanner;

public class Solution {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int k = 0, i=0, j=1;
        while(i<nums.length) {
            while(j<nums.length) {
                if(nums[i] + nums[j] == target && (i != j)) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
                j++;
            }
            j=0;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] = scanner.nextInt();
        }
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
        scanner.close();
    }
}
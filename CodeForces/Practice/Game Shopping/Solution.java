import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] costOfGames = new int[n];
        int[] maximWallet = new int[m];

        for(int i=0; i<n; i++) {
            costOfGames[i] = scanner.nextInt();
        }

        for(int j=0; j<m; j++) {
            maximWallet[j] = scanner.nextInt();
        }

        int maximWalletIndex = 0;
        int gamesBought = 0;
        for(int k=0; k<n; k++) {
            if(costOfGames[k] <= maximWallet[maximWalletIndex]) {
                gamesBought++;
                maximWalletIndex++;
            }
            if(maximWalletIndex >= maximWallet.length) {
                break;
            }   
        }

        System.out.println(gamesBought);

        scanner.close();
    }
}
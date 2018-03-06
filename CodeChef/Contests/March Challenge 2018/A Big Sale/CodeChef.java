/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef{

	public static void main (String[] args) throws java.lang.Exception{
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T-->0){
            int N = scanner.nextInt();
            double totalLossIncured = 0;
            for(int i=0; i<N; i++){
                // Get inputs 
                int price=scanner.nextInt();
                int quantity=scanner.nextInt();
                int discount=scanner.nextInt();
                // Calculate loss of each receipe
                double discountAdd = (double) price*((double)discount/100); 
                double newPrice = (double) price + discountAdd;
                double newDiscountSubtract = (double) newPrice*((double)discount/100);
                double finalSellingPrice = newPrice - newDiscountSubtract;
                double lossIncured = ((double)price - finalSellingPrice)*quantity;
                // Compute total loss of the sale
                totalLossIncured += lossIncured;
            }
            System.out.println(totalLossIncured);
        }
        scanner.close();
	}
}

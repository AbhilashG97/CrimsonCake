import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// 30 Days of Code 
// DAY 2

public class Solution {
    
    static int getTotalMealPrice(double mealCost, int tipPercent, int taxPercent) {
        double tipCharge = mealCost*((double)tipPercent/100);
        double taxCharge = mealCost*((double)taxPercent/100);
        double additionalCharge = tipCharge + taxCharge;
        int result = (int)(Math.round(mealCost+additionalCharge));
        return result;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        int result = getTotalMealPrice(meal_cost, tip_percent, tax_percent);
        System.out.println("The total meal cost is "+result+" dollars.");
        in.close();
    }
}
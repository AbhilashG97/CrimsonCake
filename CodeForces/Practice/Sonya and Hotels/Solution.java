import java.util.Scanner;
import java.util.HashSet;

public class Solution {

    private static void printArray(int[] intArray) {
        for(int i : intArray) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        int n = scanner.nextInt();
        int d = scanner.nextInt();

        int[] cities = new int[n];

        for(int i=0; i<n; i++) {
            cities[i] = scanner.nextInt();
        }

        int count = 0;

        for(int i=0; i<n-1; i++) {

            int numA = cities[i] - d;
            int numB = cities[i] + d;
            
            if(i == 0) {
                set.add(numA); // before the 1st city
                if(Math.abs(numB - cities[1]) >= d) {
                    set.add(numB);
                }

            } 
            
            if(i>0) {
                if(Math.abs(numB - cities[i+1]) >= d) {
                    set.add(numB);
                }

                if(Math.abs(numA - cities[i-1]) >= d) {
                    set.add(numA);
                }
            }
        }

        if(cities.length > 1) {
            if(Math.abs((cities[n-1] - d) - cities[n-2]) >= d) {
                set.add(cities[n-1] - d);
            }
        } else {
            set.add(cities[n-1] - d); 
        }

        set.add(cities[n-1]+d); // after the last city

        System.out.println(set.size());

        scanner.close();
    }
}
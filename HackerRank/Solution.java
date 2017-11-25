import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        float positive = 0.0f, negative = 0.0f, zero = 0.0f;
        ArrayList<Integer> arrayOfIntegers = new ArrayList<>(size);
        arrayOfIntegers.addAll(scanner.nextInt());
        System.out.println(arrayOfIntegers);
        for(Integer i : arrayOfIntegers){
            if(i<0){
                negative++;
            }else if(i>0){
                positive++;
            }else{
                zero++;
            }
        }
        System.out.println(positive/(float)size);
        System.out.println(negative/(float)size);
        System.out.println(zero/(float)size);
    }
}
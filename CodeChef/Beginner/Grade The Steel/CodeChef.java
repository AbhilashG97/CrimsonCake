/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{   

    public static int getSteelGrade(int hardness,
                                    double carbonContent,
                                    int tensileStrength){

            if(hardness>50 && carbonContent<0.7 && tensileStrength>5600){
                return 10;
            }else if(hardness>50 && carbonContent<0.7){
                return 9;
            }else if(carbonContent<0.7 && tensileStrength>5600){
                return 8;
            }else if(hardness>50 && tensileStrength>5600){
                return 7;
            }else if(hardness>50 || carbonContent<0.7 || tensileStrength>5600){
                return 6;
            }else{
                return 5;
            }                            
        }

	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T-->0){
            int hardness = scanner.nextInt();
            double carbonContent = scanner.nextDouble();
            int tensileStrength = scanner.nextInt();

            System.out.println(getSteelGrade(hardness, carbonContent, tensileStrength));
        }
        scanner.close();
	}
}

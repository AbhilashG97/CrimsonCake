/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T-->0){
            int salary = scanner.nextInt();
            double DA=0, HRA=0, grossSalary=0; 
            if(salary < 1500){
                DA = ((double)salary)*(0.9);
                HRA = ((double)salary)*(0.1);
                grossSalary = ((double)salary) + DA + HRA;
                System.out.println(grossSalary); 
            }else{
                DA = ((double)salary)*(0.98);
                HRA = 500.0;
                grossSalary = ((double)salary) + DA + HRA;
                System.out.println(grossSalary);
            }
        }
        scanner.close();
	}
}

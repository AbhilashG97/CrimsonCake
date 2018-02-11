/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.regex.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T-->0){
            int count = 0;
            String s = scanner.next();
            if(s.contains("c")&&s.contains("h")&&s.contains("e")&&s.contains("f")){
                //Is lovely
                for(int i=0; i<s.length()-3; i++){
                    String r=s.substring(i,i+4);
                    if(r.contains("c")&&r.contains("h")&&r.contains("e")&&r.contains("f")){
                        count++;
                    }
                }
                if(count!=0){
                    System.out.println("lovely "+count); 
                }else{
                    System.out.println("normal");
                }
            }else{
                //Not lovely
                System.out.println("normal");
            }
        }
        scanner.close();
	}
}


import java.util.*;
import java.lang.*;
import java.io.*;

public class CodeForces
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.next().toLowerCase();
        String string2 = scanner.next().toLowerCase();
        int flag=0;
        for(int i=0; i<string1.length(); i++){
            flag=0;
            if((int)string1.charAt(i) < (int)string2.charAt(i)){
                System.out.println(-1);
                break;
            }else if((int)string1.charAt(i) > (int)string2.charAt(i)){
                System.out.println(1);
                break;
            }else{
                flag=1;
            }
        }
        if(flag == 1){
            System.out.println(0);
        }
        scanner.close();
	}
}

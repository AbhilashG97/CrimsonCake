
import java.util.*;
import java.lang.*;
import java.io.*;


public class CodeForces{

	public static void main (String[] args) throws java.lang.Exception{
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.next();
        Scanner stringReader = new Scanner(s).useDelimiter("[+]+");
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(stringReader.hasNext()){
            arr.add(Integer.parseInt(stringReader.next()));    
        }
        Collections.sort(arr);
        s = "";
        for(int i=0; i<arr.size(); i++){
            s = s+"+"+arr.get(i);
        }
        s = s.substring(1,s.length());
        System.out.println(s);
        stringReader.close();
        scanner.close();
	}
}

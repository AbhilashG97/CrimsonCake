import java.util.Scanner;
import java.util.*;
public class Test {

    public static void main(String [] args)
    { 
        String[] arr = {"purple","green","blue","orange","red",
        "yellow"};
    
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
         String[] b = new String[n];
        ArrayList<Integer> c = new ArrayList<>();
        for(int i=0;i<n;i++){
            b[i] = sc.next();
       
        }
        sc.close();
       
        int k=0;
        
        for(int i=0;i<n;i++){
            
            for(int j=0;j<6;j++){
                if(arr[j].equals(b[i])){
                    
                    c.add(k, j);
                    k=k+1;
                    
                }
            }
        }

        
        int d = 0;

        for(int i=0;i<6;i++){
            
                if(c.get(d) != i ){
                    System.out.println(c.get(d));
                    System.out.println(arr[i]);
                    switch(arr[i]){
                        
                        case "purple" :
                            System.out.println("Power Gem");
                            break;
                        
                        case "green" :
                            System.out.println("Time Gem");
                            break;

                        case "blue" :
                            System.out.println("Space Gem");
                            break;

                        case "orange" :
                            System.out.println("Soul Gem");
                            break;

                        case "red" :
                            System.out.println("Reality Gem");
                            break;

                        case "yellow" :
                            System.out.println("Mind Gem");
                            break;
                        
                    }
                    d=d+1;
                
            }
        }


    
}}
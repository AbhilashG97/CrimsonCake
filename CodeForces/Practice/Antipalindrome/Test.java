import java.util.Scanner;

public class Test{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        String reverse="";
        int p=0;

        int d = original.length();

        for(int i=d-1;i>=0;i--){
            reverse= reverse + original.charAt(i);
            

        }
        for(int i=d-1;i>0;i--){
            if(original.charAt(i)==original.charAt(i-1)){
                p=p+1;
            
        }
    }
   

    
    System.out.println(reverse);

    if(p==(d-1)){
        System.out.println("0");
    
    }
    else{
        if(reverse!=original){
            System.out.println(d);
        }
        else{
            int j=d-1;
            System.out.println(j);
        }

    }

    }
}
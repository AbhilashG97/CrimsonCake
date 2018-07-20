import java.util.Scanner;

public class Test{

    public static void main(String[] args) {
        
        java.util.Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String k = sc.next();
        int l = k.length();
        for (int i=(l-1);i>=(l/2);i--){
            System.out.print(k.charAt(i));
        }
        int h = l/2;
        l=l/4;
        int d=l;
        while (l>1){
            for(int j=l-1;j>=(l/2)-1;j--){
                System.out.print(k.charAt(j));
            }
            l=l/2;
            if(l>1){
                
            for(int g=(l/2)-1;g<=l-1;g++){
                System.out.print(k.charAt(g));
            }

            
            }
        }

    }

}
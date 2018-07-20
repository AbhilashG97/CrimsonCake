import java.util.Scanner;

public class ReverseEncryption{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String k = sc.next();
        int j = k.length();
        int i=0;
            for(i=(j-1);i>=j/2;i--){
                System.out.print(k.charAt(i));
            }
            int h = i;
            j=n/4;
            int l=j;
            while(j/4>0){ 
                for(int d=j-1;d>=(j/2);d--){
                        System.out.print(k.charAt(d));
            }
            

            
            for(int w=(j/4)-1;w<(j/2);w++){
               System.out.print(k.charAt(w));
          }
            j=j/2;
        
            }
           
            for(int g=l;g<=h;g++){
                System.out.print(k.charAt(g));
            }
            sc.close();
            System.out.println();
        
    }   
        

    

}
import java.util.Scanner;




public class WorldCup {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] queue = new int[n];
        for(int i=0;i<n;i++){
            queue[i] = sc.nextInt();
        }
        if(queue[0]==0){
            System.out.println(1);
        }

        int j = 1,k=0;
        while(queue[j]!=0|| k==1){
            for(int i=0;i<n;i++){
                queue[i] = queue[i]-1;

                if((queue[i]==0)&& i==j){
                    System.out.println(j+1);
                    k =1;
                }
            
            }
            ++j;
            if(j==n){
                j=0;
            }

        }
        
        sc.close();

    }
    


}
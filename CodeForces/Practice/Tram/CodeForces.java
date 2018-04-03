import java.util.Scanner;

public class CodeForces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), flag=0, numberOfPeople=0, i=0, j=0, max=0;
        int[] peopleArray = new int[n];
        while(n-->0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(flag==0){
                flag=1;
                peopleArray[i] = b;
                numberOfPeople = peopleArray[i];
                if(numberOfPeople > max){
                    max = numberOfPeople;
                }
            }else{
                numberOfPeople = (peopleArray[j] -a) + b;
                peopleArray[i] = numberOfPeople;
                if(numberOfPeople > max){
                    max = numberOfPeople;
                }
                j++;
            }
            i++;
        }
        System.out.println(max);
        scanner.close();
    }
}
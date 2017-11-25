import java.util.Scanner;

public class TheatreSquare {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextInt();
		long m = scanner.nextInt();
		long a = scanner.nextLong();
		long quo = (n*m)/(a*a);
		long rem = (n*m)%(a*a);
		if(rem == 0){
			System.out.println(quo);
		}else if(quo == 0){
			System.out.println(1);
		}else{
			System.out.println(rem);
		}
	}	
}
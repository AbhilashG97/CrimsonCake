import java.util.Scanner;

public class Watermelon {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int weight = scanner.nextInt();
		if(weight%2 != 0){
			System.out.println("NO");
		}else if(weight == 2){
			System.out.println("NO");
		}else{
			System.out.println("YES");
		}
	}

}
import java.util.Scanner;

public class BitPP {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		String[] input = new String[n];
		for(int i=0; i<n; i++){
			input[i] = scanner.next();
		}
		for(String i : input){
			if(i.contains("+")){
				count++;
			}else{
				count--;
			}
		}
		System.out.println(count);
	}
}
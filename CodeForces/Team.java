import java.util.Scanner;

public class Team {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] inputs = new int[n][3]; 
		int count = 0, temp = 0; 
		for(int i=0; i<n; i++){
			for(int j=0; j<3; j++){
				inputs[i][j] = scanner.nextInt();
				if(inputs[i][j] == 1){
					temp++;
				}
			}
			if(temp >=2){
				count++;
			}			
			temp=0;
		}
		System.out.println(count);
	}
}
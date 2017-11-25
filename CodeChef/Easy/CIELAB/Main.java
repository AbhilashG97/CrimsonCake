import java.io.*;
import java.lang.Exception;

public class Main{

	private int a, b;
	String[] input;

	public Main() throws Exception{
		input = new String[2];
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			input = br.readLine().split(" ");
			a = Integer.parseInt(input[0]);
			b = Integer.parseInt(input[1]);
		}	
	}

	public int getDifference(){
		return Math.abs(a-b);
	}	

	public int getAnswer(int difference) {
		int temp = difference%10;
		if(temp<9){
			return ++difference;
		}else {
			return --difference;
		}
	}

	public static void main(String[] args) throws Exception{
		Main main = new Main();
		System.out.println(main.getAnswer(main.getDifference()));
	}
}
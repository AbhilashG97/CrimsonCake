import java.io.*;

public class MARCHA1 {

	private int n, m, testCases, sum; 
	String[] input;
	int[] arr1;

	public MARCHA1(){
		input = new String[2];
		n = 0;
		m = 0;
		testCases=0;
		sum = 0;
		arr1 = new int[0];
	}

	public void setValues() throws Exception{
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			testCases = Integer.parseInt(br.readLine());
			while(testCases-->0){
				input = br.readLine().split(" ");
				n = Integer.parseInt(input[0]);
				m = Integer.parseInt(input[1]);
				this.arr1 = new int[n];
				for(int i=0; i<n; i++){
					arr1[i] = Integer.parseInt(br.readLine());
				}
			}
		}
	}

	public boolean shouldPay(){
		for(int j=0; j<n; j++){
			for(int i=j; i<arr1.length; i++){
				sum+=arr1[i];
				System.out.println(sum);
				if(sum==m){
					System.out.println("true"+sum+arr1.length);
					return true;
				}
			}			
		}
		System.out.println("false");
		return false;
	}

	public String yesOrNo(boolean input){
		if(input){
			return "Yes";
		}else{
			return "No";
		}
	}

	public static void main(String[] args) throws Exception{
		MARCHA1 main = new MARCHA1();
		main.setValues();
		System.out.println(main.yesOrNo(main.shouldPay()));
	}
}

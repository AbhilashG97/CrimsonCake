import java.util.*;

public class Main{

	private int m, n, indexAt;
	private ArrayList<Integer> jobs;	
	private ArrayList<Integer> totalJobs;
	private int testCases;

	public Main(){
		jobs = new ArrayList<>();
		totalJobs = new ArrayList<>();
		testCases = 0;
		m = n = indexAt = 0;
	}

	public void getResult(){
		Scanner s = new Scanner(System.in);
		testCases = s.nextInt();
		while(testCases-->0){
			jobs.clear();
			totalJobs.clear();
			n = s.nextInt();
			m = s.nextInt();

			for(int i=0; i<m; i++){
				jobs.add(s.nextInt());
			}

			for(int k=1; k<=n; k++){
				totalJobs.add(k);
			}
			Collections.sort(totalJobs);

			if(jobs.size()>=m && (jobs.get(jobs.size()-1))>=n){
				System.out.println();
			}
			
			for(int j=0; j<jobs.size(); j++){
				indexAt = Collections.binarySearch(totalJobs, jobs.get(j));
				totalJobs.remove(indexAt);
			}

			for(int l=0; l<totalJobs.size(); l++){
				if(l%2==0){
					System.out.print(totalJobs.get(l)+" ");
				}
			}
			System.out.println();

			for(int r=0; r<totalJobs.size(); r++){
				if(r%2!=0){
					System.out.print(totalJobs.get(r)+" ");
				}
			}
			System.out.println();
		}
		s.close();
	}

	public static void main(String[] args){
		Main main = new Main();
		main.getResult();
	}

}
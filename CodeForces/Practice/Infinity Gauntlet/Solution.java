import java.util.*;

public class Solution {
	public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        HashMap<String, String> gems = new HashMap<>();

        gems.put("purple", "Power");
        gems.put("green", "Time");
        gems.put("blue", "Space");
        gems.put("orange", "Soul");
        gems.put("red", "Reality");
        gems.put("yellow", "Mind");

        String[] gemsISaw = new String[n];

        int i=0;
        
        while(n-->0) {
            gemsISaw[i] = scanner.nextLine();
            i++;
        }

        System.out.println(6 - gemsISaw.length);
        for(int j=0; j<gemsISaw.length; j++) {
            if(gems.containsKey(gemsISaw[j])) {
                gems.remove(gemsISaw[j]);
            }
        }

        gems.forEach((key, value) -> System.out.println(value));
        scanner.close();    
	}
}

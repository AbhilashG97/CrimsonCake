import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution {
	public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();

        ArrayList<String> directionList = new ArrayList<>();
        ArrayList<String> locationList = new ArrayList<>();

        String address = "";
        
        while(T-- > 0) {
            int N = scanner.nextInt();
            scanner.nextLine();
            while(N-- > 0) {

                address = scanner.nextLine();
                Scanner textScanner = new Scanner(address);

                while(textScanner.hasNext()) {
                    directionList.add(new StringBuffer().append(textScanner.next()).toString().trim());
                    break;
                }

                while(textScanner.hasNext()) {
                    locationList.add(new StringBuffer().append(textScanner.nextLine()).toString().trim());
                }
            }

            int j = directionList.size() - 1; 
            System.out.println(directionList.get(0)+" "+locationList.get(locationList.size()-1));
            for(int i=locationList.size()-2; i>=0; i--) {
                if(directionList.get(j).equals("Right")) {
                    System.out.println("Left"+" "+locationList.get(i));
                } else {
                    System.out.println("Right"+" "+locationList.get(i));
                }
                j--;
            }

            System.out.println();
            directionList.clear();
            locationList.clear();
        }

        scanner.close();
	}
}

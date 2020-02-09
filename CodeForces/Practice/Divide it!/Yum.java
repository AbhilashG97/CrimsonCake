import java.io.*;

public class Yum {
    public static void main(String[] args) throws Exception {
        
        System.out.println(1000);
        File file = new File("output.dat");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("1000\n");

        for(int i=1; i<=1000; i++) {
            fileWriter.write(i+"\n");
        }

        fileWriter.close();
    }
}
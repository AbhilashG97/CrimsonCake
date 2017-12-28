import java.io.*;

public class TestWriter {

    private FileOutputStream outputStream;

    public TestWriter(){
        outputStream = new FileOutputStream("input.txt");
    }

    public void writeToFile() throws IOException {
        for(int i=0; i<998; i++){
            outputStream.write("0 0\n");
        }
    }

    public static void main(String[] args) {
        
    }

}
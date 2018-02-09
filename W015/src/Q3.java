import java.io.*;

public class Q3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        try {
//            fis = new FileInputStream("B:/myfile.txt");
            fis = new FileInputStream("B:/myfile.txt");
        } // If file not found, catch exception
        catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        int k;
        try {
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }
        } // If input or output is null, catch exception
        catch (IOException e2) {
            e2.printStackTrace();
        }
        try { // Trying to close the file input stream
            fis.close();
        } // If input or output is null, catch exception
        catch (IOException e3) {
            e3.printStackTrace();
        }
    }
}

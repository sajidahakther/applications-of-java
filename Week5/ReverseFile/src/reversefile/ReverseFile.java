package reversefile;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.util.Scanner;

public class ReverseFile {

    public static void main(String[] args) {

        FileInputStream fis = null;
        RandomAccessFile raf = null;

        String characterEncoding = "utf-8"; //using utf-8 by default

        try {
            //INPUT file
            Scanner input = new Scanner(System.in); //to scan the input entered
            System.out.print("INPUT - Enter file path: ");
            String inputFileName = input.nextLine(); //file entered
            File in = new File(inputFileName);
            fis = new FileInputStream(in);
            Reader r = new InputStreamReader(fis, characterEncoding); //reads character streams

            //OUTPUT file
            Scanner output = new Scanner(System.in); //to scan the output entered
            System.out.print("OUTPUT - Enter file path or create a new file name: ");
            String outputFileName = output.nextLine(); //file entered
            File out = new File(outputFileName);
            raf = new RandomAccessFile(out, "rw"); //random access file of the same size as the input, to write in reverse order
            raf.setLength(in.length());

            char[] buff = new char[1]; //buffer for the characters we want to read
            long position = in.length(); //keep track of current position, reversing text so start from end
            while ((r.read(buff)) > -1) { //reader returns -1 when it reaches the end

                //String
                Character c = buff[0];
                String s = c + "";
                byte[] bBuff = s.getBytes(characterEncoding); //turning the character into bytes according to the character encoding

                position = position - bBuff.length; //go to the proper position in the random access file
                raf.seek(position);
                raf.write(bBuff); //write one or more bytes for the character
            }

            System.out.println("Content of INPUT file has been copied in reverse order into OUTPUT file.");
            System.out.println("Opening OUTPUT file - '" + outputFileName + "'");

            if (Desktop.isDesktopSupported()) { //if the file is supported by the desktop
                try {
                    File myFile = new File(outputFileName);
                    Desktop.getDesktop().open(myFile); //open the output file
                } catch (IOException ex) { //works with text files, no PDF's
                }
            }

        } catch (IOException e) { //if the file does not exist, throw exception and print file not found
            System.out.println("File not found");
        } finally {

            try {
                fis.close(); //throw exception if file input stream scanner does not successfully close
            } catch (IOException e2) {
            }
            try {
                raf.close(); //throw exception if random access file scanner does not successfully close
            } catch (IOException e2) {
            }
        }

    }

}

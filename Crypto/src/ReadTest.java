import java.io.*;
import java.util.Scanner;

public class ReadTest {
    static ROT13 rot13 = new ROT13();

    public static void main(String[] args) throws IOException {
        String fileName = "/Users/troy/Projects/SimpleCrypt/sonnet18.enc";
        File file = new File(fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st = "";

        while((st = br.readLine()) != null) {
            System.out.println(rot13.decrypt(st));
        }
    }
}

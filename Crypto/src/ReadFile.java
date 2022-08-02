import java.io.*;
import java.util.Scanner;

public class ReadFile {
    static ROT13 rot13 = new ROT13();

    public static void main(String[] args) throws IOException {
        String fileName = "/Users/troy/Projects/SimpleCrypt/sonnet18.txt";
        File file = new File(fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        Scanner scanner = new Scanner(file);

        String st = "";



        while((st = br.readLine()) != null){
            System.out.println(rot13.encrypt(st));
        }
        String newFile = "";
        while(scanner.hasNext()){
            newFile = newFile.concat(rot13.encrypt(scanner.nextLine() + "\n" ));
        }


        FileWriter myWriter = new FileWriter("/Users/troy/Projects/SimpleCrypt/sonnet18.enc");
        BufferedWriter writer = new BufferedWriter(myWriter);
        writer.write(newFile);
        writer.close();
    }

}

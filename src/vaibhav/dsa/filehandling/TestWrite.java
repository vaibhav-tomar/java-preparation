package vaibhav.dsa.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestWrite {

    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("E:\\File.txt");
            fw.write("this ia a test string");
            fw.close();
            File file = new File("E:\\File.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

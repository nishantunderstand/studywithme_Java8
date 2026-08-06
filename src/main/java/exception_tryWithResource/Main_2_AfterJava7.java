package exception_tryWithResource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main_2_AfterJava7 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))){
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package exception_tryWithResource;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * You can Observe How Code Complextity is decreased
 */
public class Main_3_AfterJava7_Resource {
    public static void main(String[] args) throws Exception {
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))){
            System.out.println(br.readLine());
        }
    }
}

package _exception_tryWithResource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main_1_BeforeJava7 {
    public static void main(String[] args) {
        BufferedReader br = null;

        try{
            br = new BufferedReader(new FileReader("test.txt"));
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try{
                if(br!=null){
                    br.close();
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}

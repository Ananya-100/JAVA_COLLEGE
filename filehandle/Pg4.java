import java.util.*;
import java.io.*;
public class Pg4 {
    public static void main(String[] args) {
         String f = "c.txt";
         try(BufferedReader r = new BufferedReader(new FileReader(f))){
            String l;
            while((l=r.readLine())!=null){
                String[] words = l.split("\\s+");
                for(String word : words){
                    System.out.println(word);
                }
            }
            
         } catch (IOException e) {
            System.out.println(e);
         }
    }
   

}

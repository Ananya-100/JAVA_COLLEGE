import java.io.*;

public class Pg3 {
    public static void concate(String f1, String f2, String f3){
        try(BufferedReader r1 = new BufferedReader(new FileReader(f1)); 
            BufferedReader r2 = new BufferedReader(new FileReader(f2));
            BufferedWriter w = new BufferedWriter(new FileWriter(f3))){
                String line;
                while ((line = r1.readLine())!= null) {
                    w.write(line);
                    w.newLine();
                    
                }
                while ((line = r2.readLine())!= null) {
                    w.write(line);
                    w.newLine();
                }
                System.out.println("Content of two files is copied to the third file successfully");
            }
            catch(IOException e){
                System.out.println(e);
            }
    }
    public static void main(String[] args) {
        String f1 = "a.txt";
        String f2 = "b.txt";
        String f3 = "c.txt";

         concate(f1,f2,f3);
    }
       
}

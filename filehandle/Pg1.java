import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Pg1{
    public static void main(String[] args) {
        String fpath = "c.txt";
        try(BufferedReader r = new BufferedReader(new FileReader(fpath))){
            String l;
            while ((l = r.readLine()) != null) {
                System.out.println(l);
                
            }
        }catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
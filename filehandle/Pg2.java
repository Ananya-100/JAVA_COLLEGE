import java.util.*;
import java.io.*;

class Pg2{
    public static void main(String[] args) {

        String f = "a.txt";

        try(BufferedWriter w  = new BufferedWriter(new FileWriter(f))){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter sentences. Type 'q' to quit:");

            String l;
            while (!(l=sc.nextLine()).equalsIgnoreCase("q")) 
            {
                w.write(l);
                w.newLine();
            }
            System.out.println("Saved to the file sucessgully");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}


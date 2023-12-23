public class Prog4 {
    public static void main(String[] args) {
        try{
            try{
                int a[]= new int[5];
                System.out.println(a[6]);
                try{
                    String str = "hello";
                    System.out.println(str.charAt(8));
                 }
                catch(StringIndexOutOfBoundsException e){
                    System.out.println("String index out of bounds");
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array out of range");
             }
        }
        catch(Exception e){
            System.out.println("parent class exception");
        }

    }
}

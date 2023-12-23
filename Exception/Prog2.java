public class Prog2 {
    public static void main(String[] args) {
        int arr[] = new int[4];
        String s = "Ananya";
        try{
            System.out.println(arr[5]);
        }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Array out of range");
    }
    try{
         System.out.println(s.charAt(10));
    }
    catch(StringIndexOutOfBoundsException e){
        System.out.println("string out of range");
    }
    }
    
}

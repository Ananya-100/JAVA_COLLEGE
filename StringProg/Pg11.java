public class Pg11 {
    public static void main(String[] args) {
        String s = "anany";
        int n = s.length();
        
        if(n%2==0){
            int a = n/2;
            System.out.println(s.substring(0, a));
        }
        else{
            System.out.println("no");
        }
    }
    
}

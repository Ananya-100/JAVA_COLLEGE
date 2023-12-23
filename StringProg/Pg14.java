public class Pg14 {
   public static void deleteMe(String s,int m){
        System.out.println(s.substring(0, m)+s.substring(m+1));
    }
    public static void main(String[] args) {
        String s = "force";
        deleteMe(s,3);
    }
    
}

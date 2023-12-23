public class Pg4 {
    public static void main(String[] args) {
        String s = "Ananya";
        String s1=" ";
        int n = s.length();
        for(int i=n-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        System.out.println(s1);
    }
}

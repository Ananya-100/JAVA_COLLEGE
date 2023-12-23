public class Pg6 {
    public static void main(String[] args) {
        String s1 = "mark";
        String s2 = "kate";
        String s3 = "";
        int n = s1.length()-1;
        if(s1.charAt(n) == s2.charAt(0)){
            s3 = s1+s2.substring(1);
        }
        else{
            s3 = s1+s2;
        }
        System.out.println(s3);

    }
    
}

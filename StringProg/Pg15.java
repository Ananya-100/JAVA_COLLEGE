class Pg15{
    static void cut(String s,int m){
        String a =s.substring(m-1);
        StringBuilder sb= new StringBuilder();
        for(int i =1;i<=a.length();i++){
            sb.append(a);
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String s = "Wipro";
        int m=3;
        cut(s,m);
    }
}
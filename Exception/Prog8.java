class RangeorderException extends Exception{
    public String getE(){
        return "input a > input b";
    }
}

public class Prog8 {
    public static void main(String[] args) {
        String s1="",s2="",rev="";
        int a=0,b=0;
        try{
            s1=args[0];
         a=Integer.parseInt(args[1]);
        b=Integer.parseInt(args[2]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("No proper args found");
        }
        catch (NumberFormatException e) {
            System.out.println("Type error");
        }
        try{
            if(a>b)
                throw new RangeorderException();
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            s2=s1.substring(a,b);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        for (int i = 0; i < s2.length(); i++) {
            rev = s2.charAt(i) + rev;
        }
        System.out.println("Reversed = " + rev);

    }
    
}

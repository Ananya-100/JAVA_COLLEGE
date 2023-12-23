public class Pg7 {
    public static void main(String[] args) {
        if(args.length<1){
            System.out.println("invalid");
            return;
        }
        String name = args[0];

        String[] names = name.split(" ");

        StringBuilder res = new StringBuilder();

        if(names.length>0)
        res.append(names[0].charAt(0)).append(".");

        for(int i = 1;i<names.length-1;i++){
            res.append(names[i].charAt(0)).append(".");
        }
        if(names.length>1)
        res.append(names[names.length-1]);
        System.out.println(res);
        
    }
    
}

class EMP{
    String name;
    int id;
    EMP(String name, int id){
        this.name = name;
        this.id = id;
    }
}
class Scientst extends EMP{
    int year,exp;
    Scientst(String name,int id,int year,int exp){
        super(name, id);
        this.year = year;
        this.exp = exp;
    }
}
class Dscientist extends Scientst{
    int awards;
    Dscientist(String name,int id,int year,int exp,int awards){
        super(name, id, year, exp);
        this.awards = awards;
    }
    public String toString(){
        return name+" "+id+" "+year+" "+exp+" "+awards;
    }
}

public class Prog4 {
    public static void main(String[] args) {
        Dscientist d = new Dscientist(args[0],Integer.parseInt(args[1]),Integer.parseInt(args[2]),Integer.parseInt(args[3]),Integer.parseInt(args[4]));
        System.out.println(d);

    }
}

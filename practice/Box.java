class Test{
    double s,l,r;
    Test(double s){
        this.s=s;
        double area = s*s*s;
        System.out.println(area);
    }
        Test(double l,double r){
        this.l=l;
        this.r=r;
        double ar = (l*r)/3;
        System.out.println(ar);

    }
}
class Box{
    public static void main(String[] args) {
        Test t = new Test(4.0);
        Test t1 = new Test(2.0,2.0);
    }
}

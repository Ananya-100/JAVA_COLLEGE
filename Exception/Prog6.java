class Prog6 extends Exception{
    public String getMessage(){
        return "Salary is less than 10000/-";
    }
     public static void main(String[] args) {
        int monthlySalary = 8000; 

        try {
            if(monthlySalary<10000){
                  throw new Prog6();
            }
            
        } catch (Exception e) {
            System.out.println(e);
            
        }
    }
}

    
   


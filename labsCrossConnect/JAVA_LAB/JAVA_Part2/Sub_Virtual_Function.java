package JAVA_Part2;

public class Sub_Virtual_Function extends Virtual_Function {
    private double salary;
    public Sub_Virtual_Function (String name,String address,int number,double salary){
        super(name,address,number);//use father construct function
        //       String a = super.name;//because of super.name is private, priority is not high;
        setSalary(salary);
    }

    @Override
    public void mailCheck(){
        System.out.println("Sub_Virtual_Func ");
        System.out.println("GetName is "+getName()+", salary is "+salary);
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double newSalary){
        if (newSalary >0.0)
        {
            this.salary = newSalary;
        }
    }
    public double computePay(){
        System.out.println("calculate salary , pay to "+getName());
        return salary/52;
    }

}

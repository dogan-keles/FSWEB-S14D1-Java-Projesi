package employee;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper (int id , String name){

        super(id,name);

    }
    @Override

    public void work (){

        System.out.println(super.getName() + " Senior developer begins to work");
        super.setSalary(50000);
    }
}
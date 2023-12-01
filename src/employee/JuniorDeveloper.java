package employee;

public class JuniorDeveloper extends Employee{

    public JuniorDeveloper(int id , String name){

        super(id,name);

    }
    @Override

    public void work (){
        super.setSalary(30000);
        System.out.println(super.getName() + " Junior developer begins to work");


    }
}
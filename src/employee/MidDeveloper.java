package employee;

public class MidDeveloper extends Employee {

    public MidDeveloper(int id , String name){

        super(id,name);

    }
    @Override
    public void work (){
        super.setSalary(40000);
        System.out.println(super.getName() + " Mid-developer begins to work");


    }
}
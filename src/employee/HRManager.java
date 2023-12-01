package employee;

import java.util.Arrays;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, JuniorDeveloper[] juniorDevelopers, MidDeveloper[] midDevelopers,
                     SeniorDeveloper[] seniorDevelopers) {
        super(id, name);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    public HRManager(int id, String name) {

        super(id, name);
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper) {
        try {
            if (juniorDevelopers[index] == null) {

                juniorDevelopers[index] = juniorDeveloper;
            } else {

                System.out.println("Index is full");
            }


        } catch (ArrayIndexOutOfBoundsException exception) {

            System.out.println("Invalid index " + exception.getMessage());

        }


    }
    public void addEmployee(int index, MidDeveloper midDeveloper) {
        try {
            if (midDevelopers[index] == null) {

                midDevelopers[index] = midDeveloper;
            } else {

                System.out.println("Index is full");
            }


        } catch (ArrayIndexOutOfBoundsException exception) {

            System.out.println("Invalid index " + exception.getMessage());

        }


    }
    public void addEmployee(int index, SeniorDeveloper seniorDeveloper) {
        try {
            if (seniorDevelopers[index] == null) {

                seniorDevelopers[index] = seniorDeveloper;
            } else {

                System.out.println("Index is full");
            }


        } catch (ArrayIndexOutOfBoundsException exception) {

            System.out.println("Invalid index " + exception.getMessage());

        }


    }


    @Override

    public void work() {
        System.out.println(super.getName() + " Senior developer begins to work");
        setSalary(75000);


    }

    @Override
    public String toString() {
        return "{HRManager= " + super.getId() + " " + super.getName() + " " + super.getSalary() + " " +
                "JuniorDeveloper=" + Arrays.toString(juniorDevelopers) +
                ", MidDeveloper=" + Arrays.toString(midDevelopers) +
                ", SeniorDeveloper=" + Arrays.toString(seniorDevelopers) +
                '}';
    }
}
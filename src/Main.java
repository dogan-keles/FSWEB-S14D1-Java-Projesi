import employee.HRManager;
import pool.Cuboid;
import pool.Rectangle;
import cylinder.Circle;
import cylinder.Cylinder;
import employee.MidDeveloper;
import employee.SeniorDeveloper;
import employee.JuniorDeveloper;
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume()) ;

        System.out.println("******************************");
        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());
        System.out.println("********** " );
        JuniorDeveloper juniorDeveloper1 = new JuniorDeveloper(1, "Seyyit");
        JuniorDeveloper juniorDeveloper2 = new JuniorDeveloper(2, "Elif");
        juniorDeveloper1.work();
        juniorDeveloper2.work();

        MidDeveloper midDeveloper1 = new MidDeveloper(3, "Gulsu");
        MidDeveloper midDeveloper2 = new MidDeveloper(4, "Anil");
        midDeveloper1.work();
        midDeveloper2.work();

        SeniorDeveloper seniorDeveloper1 = new SeniorDeveloper(5, "Burak");
        seniorDeveloper1.work();


        HRManager hrManager = new HRManager(1, "Dogancan", new JuniorDeveloper[2],
                new MidDeveloper[2], new SeniorDeveloper[2]);
        hrManager.work();

        hrManager.addEmployee(0, juniorDeveloper1);
        hrManager.addEmployee(1, juniorDeveloper2);
        //hrManager.addEmployee(2, juniorDeveloper2);
        hrManager.addEmployee(0, midDeveloper1);
        hrManager.addEmployee(1, midDeveloper2);
        hrManager.addEmployee(0, seniorDeveloper1);

        System.out.println(hrManager);

    }

}
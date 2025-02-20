public class MealPayRunner {
    public static void main(String[] args) {
        Manager m = new Manager();
        System.out.println("Adding some students");
        m.addStudent("Bobby Bobbs");
        m.addStudent("Joe Schmo");
        m.addStudent("Kelly Shelly");
        m.addStudent("Bobby Bobbs");

        System.out.println(m);

    }
    
}

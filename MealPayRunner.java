public class MealPayRunner {
    public static void main(String[] args) {
        Manager m = new Manager();
        System.out.println("Adding some students");
        m.addStudent("Bobby Bobbs");
        m.addStudent("Joe Schmo");
        m.addStudent("Kelly Shelly");
        m.addStudent("Bobby Bobbs");

        System.out.println(m);

        System.out.println("Making some charges...");

        m.addBalance(2,4,1,20);
        m.addBalance(2,4,2,30);
        m.addBalance(2,5,2,10);
        m.chargeMeal(2,4,4);
        m.chargeMeal(2,5,3);
        m.chargeMeal(2,5,3);

        System.out.println(m);

        System.out.println("Only negative balances...");
        System.out.println(m.negativeBalances());

        System.out.println("All transactions on 2/4");
        System.out.println(m.transactionsByDay(2, 4));

    }
    
}

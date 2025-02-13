public class Student{
    private int iD;
    private double balance;
    private String name;
    private static int cID=1;
    private List<Transactions> transactions;

    public Student(String myName){
        name = myName;
        balance = 0;
        iD=cID;
        cID++;
    }

    public void Transaction(int month, int day, double amount){

    }


}
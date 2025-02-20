import java.util.*;

public class Manager {
    //fields
    ArrayList<Student> students;

    public Manager(){
        students = new ArrayList<Student>();
    }

    public String transactionsByDay(int month, int day){
        String s = "";
        for(Student st : students){
            ArrayList<Transaction> tByDay = st.getTransactionsByDate(month, day);
            if(tByDay != null){
                s += tByDay.toString() + " by: " + st.getName() + " ID: " + st.getID();
                s += "\n";
            }
        }
        return s;
    }

    public void logMeal(int month, int day, int id){
        //loop through all students and find matching id
    }

    public void addStudent(String myName){
        students.add(new Student(myName));
    }
    public String toString(){
        return students.toString();
    }
    public void addBalance(int month, int day, int iD, int balance){
        for (int i = 0; i<students.size();i++){
            if (students.get(i).getID()==iD){
                students.get(i).addBalance(month, day, balance);

            }
        }

    }
    public void chargeMeal(int month, int day, int iD){
        for (int i = 0; i<students.size();i++){
            if (students.get(i).getID() == iD){
                students.get(i).chargeLunch(month, day);
            }
        }
    }
    public ArrayList<Student> negativeBalances(){
        ArrayList<Student> list = new ArrayList<Student>();
        for(int i = 0; i<students.size();i++){
            if(students.get(i).getBalance()<0){
                list.add(students.get(i));
            }
        }
        return list;
    }
}

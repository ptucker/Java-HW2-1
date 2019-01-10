public interface Employee {

    boolean IsATeacher(Employee t);
    boolean IsApoliceman(Employee p);


    int Money;
    String EmployeeID; 
//Method to give employees their pay
public String GetPay(){
return Money;
}
//method to ask employee their empoyee ID
public String GetEmployeeID(){
return EmployeeID;
   }
    
}

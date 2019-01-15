/**
* This class models a teacher's grade level and certification
* @author Karen Sobtafo
* @version 1.00, 11 January 2019
*/
public class Teacher extends Person implements Employee {
    String GradeLevel;
    String certification;
    
int Pay;
int EmployeeID;

public int GetPay()
 {
    return Pay;
 }

 public void SetPay (int payy)
 {
    Pay = payy;
 }

public int GetEmployeeID()
{
    return EmployeeID;
}

}


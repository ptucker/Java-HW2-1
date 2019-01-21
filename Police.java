/**
* This class models a police
* @author Karen Sobtafo
* @version 1.00, 11 January 2019
*/
public class Police extends Person implements Employee {
    enum Role {Patrol, Sargent, Captain, Cheif;}
    // this person is in a.. 

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

    //PT -- need a constructor. -1
//Role member variable to store each police person's position
//Role r;
 //public Police(Role role) { r = role; }
}





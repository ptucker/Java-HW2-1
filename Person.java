/**
* This class models a person's age name and phone number
* @author Karen Sobtafo
* @version 1.00, 11 January 2019
*/
public class Person {
    private String Name;
    private int Age;
    private int PhoneNumber;

    public void setName (String newName)
    {
        Name = newName;
    }
    public String getName ()
    {
        return Name;
    }
    public void setAge (int newAge)
    {
        if(newAge>0 && newAge<100)
        {
        Age = newAge;
        }
    }
    public int getAge ()
    {
        return Age;
    }
    public void setPhoneNumber ( int newPhoneNumber)
    {
        PhoneNumber = newPhoneNumber;
    }
    public int getPhoneNumber ()
    {
        return PhoneNumber;
    }
    

}

/**
* This class models a person's age name and phone number
* @author Karen Sobtafo
* @version 1.00, 11 January 2019
*/
public class Person {
    private String Name;
    private int Age;
    private int PhoneNumber;
    
    //PT -- missing javadocs for public functions. -1
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
        //PT -- good!
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
        //PT -- validate phone number. -1
        PhoneNumber = newPhoneNumber;
    }
    public int getPhoneNumber ()
    {
        return PhoneNumber;
    }
    

}

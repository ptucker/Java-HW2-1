
public class Person {
    private String Name;
    private int Age;
    public int PhoneNumber;


//toString will return something later in PersonTest
   
    public void setName (String newName)
    {
        Name = newName;
    }
    public void setAge (int newAge)
    {
        Age = newAge;
    }
    public void setPhoneNumber ( int newPhoneNumber)
    {
        PhoneNumber = newPhoneNumber;
    }
    
    public String toString(){
        return Name + " is " + Age + " years old. " + Name  + " has the number: " + PhoneNumber;
    }
}

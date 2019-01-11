//PT -- missing javadoc. -2

public class Person {
    private String Name;
    private int Age;
    public int PhoneNumber;

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
        //PT -- validate newAge. We don't want people to be 600 years old, or -100 years old. -2
        Age = newAge;
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
    //PT -- Why id this commented out?
    //public String toString(){
        //return Name + " is " + Age + " years old. " + Name  + " has the number: " + PhoneNumber;
   // }

}

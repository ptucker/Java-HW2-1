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
    
    //public String toString(){
        //return Name + " is " + Age + " years old. " + Name  + " has the number: " + PhoneNumber;
   // }

}

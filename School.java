import java.util.ArrayList;
public class School extends Building {
    ArrayList<Person> CurInSchool = new ArrayList <>();// Arrays of current occupant

    private String SchoolName;
    private String SchoolAddress; 

    public School() {
        this.SchoolName = "north school";
        this.SchoolAddress = "300 r";
    }

public String getSchoolName()
{
    return this.SchoolName;
}
public String getSchoolAdress()
{
    return this.SchoolAddress;
}
public void setSchoolAdress(String Saddress)
{
this.SchoolAddress = Saddress;
}
public void setSchoolName(String Sname)
{
this.SchoolName = Sname;
}
    
      

//write a constructor 

}

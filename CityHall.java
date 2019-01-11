//PT -- good work here

import java.util.ArrayList;
public class CityHall extends Building {
ArrayList<Person> CurInCityHall = new ArrayList <>();//array of current occupant(s)

private String CityHallName;
private String CityHallAddress;
//Constructor 
   public CityHall ()  {
     this.CityHallName = "north city hall";
     this.CityHallAddress = " 1235";
   }

public String getCityHallName()
{
    return this.CityHallName;
}
public String getCityHalllAdress()
{
    return this.CityHallAddress;
}
public void setCityHallAddress(String Caddress)
{
this.CityHallAddress = Caddress;
}
public void setCityHallName(String Cname)
{
this.CityHallName = Cname;
}
  // loops here to let me know of all the people in CityHall.. 
}

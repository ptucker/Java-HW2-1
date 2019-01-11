public class Building {
private String BuildingName;
private String BuildingAddress;

public String getBuildingName()
{
    return BuildingName;
}
public String getBuildingAddress()
{
    return BuildingAddress;
}
public void setBuildingAddress(String Baddress)
{
BuildingAddress = Baddress;
}
public void setBuildingName(String Bname)
{
BuildingName = Bname;
}

    //write a constructor...?
    //PT -- It'd be a good idea
    //public Building(String name, String address) {
        //BuildingName = name;
        //BuildingAddress = address;
    //}
}

/**
* This class models a person's age name and phone number
* @author Karen Sobtafo
* @version 1.00, 11 January 2019
*/
public class Building {
protected String BuildingName;
protected String BuildingAddress;

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
//constructor
public Building(String name, String address){
    BuildingName = name;
    BuildingAddress =address;
}
    
    public Building ()
    {
        
    }
}

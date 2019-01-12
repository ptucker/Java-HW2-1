/**
* This class models a CityHall's name and address
* @author Karen Sobtafo
* @version 1.00, 11 January 2019
*/
import java.util.ArrayList;
public class CityHall extends Building {
ArrayList<Person> CurInCityHall = new ArrayList <>();//array of current occupant(s)

//Constructor inherited form building
   public CityHall ()  { super("north city hall", "1235"); }

//method to search for people in CityHall
public int Search(Person p){
   for (int i =0; i<CurInCityHall.size();i++)
   {
  CurInCityHall.get(i);

if (CurInCityHall.get(i).getName() == p.getName())
  { return i;}

   }
   //else return default number that is not an index
   return -1;

}



}

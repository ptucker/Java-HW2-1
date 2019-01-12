/**
* This class models a School's name and address
* @author Karen Sobtafo
* @version 1.00, 11 January 2019
*/
import java.util.ArrayList;
public class School extends Building {
    ArrayList<Person> CurInSchool = new ArrayList <>();// Arrays of current occupant

// constructor that inherits from building
    public School() {super ("north school", "300 r");}
//method to search for people in School
public int SearchSchool(Person q){
   for (int i =0; i<CurInSchool.size();i++)
   {
  CurInSchool.get(i);

if (CurInSchool.get(i).getName() == q.getName())
  { return i;}

   }
   //else return default number that is not an index
   return -1;
}

}


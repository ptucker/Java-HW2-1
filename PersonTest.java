/**
* This is the main class that models a city
* @author Karen Sobtafo
* @version 1.00, 11 January 2019
*/

import java.util.ArrayList;
public class PersonTest {
    public static void main(String[] args) {
    //-------------------------------------------------------
    Person person1 = new Person(); // new person object
    person1.setName ("Mia \n");
    person1.setAge(21);
    person1.setPhoneNumber(520665656);

    Person person2 = new Person(); // new person object
    person2.setName ("Tenimba \n");
    person2.setAge(5);
    person2.setPhoneNumber(84961654);

    Person person3 = new Person(); // new person object
    person3.setName ("Sesina \n");
    person3.setAge(35);
    person3.setPhoneNumber(12132357);

    Person person4 = new Person(); // new person object
    person4.setName ("Bob \n");
    person4.setAge(75);
    person4.setPhoneNumber(87984321);

    Person person5 = new Person(); // new person object
    person5.setName ("Bakari \n");
    person5.setAge(35);
    person1.setPhoneNumber(520600556);

    Person person6 = new Person(); // new person object
    person6.setName ("Sam \n");
    person6.setAge(27);
    person6.setPhoneNumber(587441996);

    Person person7 = new Person(); // new person object
    person7.setName ("Leroy \n");
    person7.setAge(12);
    person7.setPhoneNumber(878787884);

    Person person8 = new Person(); // new person object
    person8.setName ("Tanaka \n");
    person8.setAge(3);
    person8.setPhoneNumber(98126578);

    Person person9 = new Person(); // new person object
    person9.setName ("Carlton \n");
    person9.setAge(67);
    person9.setPhoneNumber(878451321);

    Person person10 = new Person(); // new person object
    person10.setName ("John \n");
    person10.setAge(7);
    person10.setPhoneNumber(121232354);

//---------------------------------------------------------------

    School building1 = new School(); //new buidling object 
    building1.setBuildingName("North School \n");
    building1.setBuildingAddress("300 N Hawthorne rd \n");

    School building2 = new School(); //new buidling object 
    building2.setBuildingName("South school \n");
    building2.setBuildingAddress("300 S Hawthorne rd\n");

    CityHall building3 = new CityHall();
    building3.setBuildingName("South City hall \n");
    building3.setBuildingAddress( "546841 b \n") ;
//----------------------------------------------------------------
Police PolicePay = new Police();
PolicePay.SetPay(5000);

Teacher TeacherPay = new Teacher();
TeacherPay.SetPay(2000);
//----------------------------------------------------------------

   
//outputs the name of all the people in a loop
System.out.printf("The names of the people in the city are:  \n");
ArrayList<Person> Population = new ArrayList <>();
Population.add(person1);
Population.add(person2);
Population.add(person3);
Population.add(person4);
Population.add(person5);
Population.add(person6);
Population.add(person7);
Population.add(person8);
Population.add(person9);
Population.add(person10);
for (int i=0; i<Population.size();i++)
{
   System.out.printf(Population.get(i).getName());
}

//output the names of all buildings in a loop
System.out.printf("What are the existing buildings?:  \n");
ArrayList<Building> Buildingz = new ArrayList <>();
Buildingz.add(building1);
Buildingz.add(building2);
Buildingz.add(building3);
for (int i =0; i<Buildingz.size();i++)
{
    System.out.printf (Buildingz.get(i).getBuildingName());
    System.out.printf(Buildingz.get(i).getBuildingAddress());
}

//which kids are in school
System.out.printf("which kids are in school:  \n");
for (int i =0; i<Population.size();i++) {

if ( Population.get(i).getAge()<18)
{
    System.out.printf(Population.get(i).getName());
    building1.CurInSchool.add(Population.get(i));
    
}
    }
//which teachers are in school
System.out.printf("which teachers are in school:  \n");
for (int i =0; i<Population.size();i++) {

if ( Population.get(i).getAge()>18 && Population.get(i).getAge()<40)
{
    System.out.printf(Population.get(i).getName());
    building1.CurInSchool.add(Population.get(i));
}
    }
//which police officers are in City Hall
System.out.printf("Which police officers are in City Hall?: \n");
for (int i=0; i<Population.size(); i++) {
    if (Population.get(i).getAge()>40) 
    {
        System.out.printf(Population.get(i).getName());
        building3.CurInCityHall.add(Population.get(i));

    }
}
//to pay those persons who are employees

//Policement in city hall
for ( int i =0; i<Population.size();i++)
 {
     int index = building3.Search(Population.get(i));
     if (index != -1)
     {
        // CurInCityHall.get(i).PolicePay.GetPay();
     }
 }

 //Teachers in school
 for ( int i =0; i<Population.size();i++)
 {
     int index = building1.SearchSchool(Population.get(i));
     if (index != -1)
     {
         //CurInSchool.get(i).TeacherPay.GetPay();
     }
 }



}

}




//PT -- missing javadoc. -2

public class Police extends Person implement Employee {
    enum Role {Patrol, Sargent, Captain, Cheif;}
    // this person is in a... 
    //PT -- Maybe make a Role member variable to store each police person's position?
    //PT -- Role r;
    //PT public Police(Role role) { r = role; }
    
    //PT -- I think you don't need to take parameters for these functions, since the code for these functions doesn't use them.
boolean IsATeacher(Employee t){return false;}
boolean IsApoliceman(Employee p){return true;}
}


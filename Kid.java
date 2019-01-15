/**
* This class models a Kid's favorite candy
* @author Karen Sobtafo
* @version 1.00, 14 January 2019
*/
public class Kid extends Person{
    //favorite candy
    String FavCandy;
    public void SetFavCandy(String Fav)
    {
        FavCandy = Fav;
    }
    public String getFavCandy()
    {
        return FavCandy;
    }
  
}

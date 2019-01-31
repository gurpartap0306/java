import java.io.*;
import java.util.*;


public class DotComBust(){

private GameHelper helper = new GameHelper();
private ArrayList<DotCom> dotComslist = new ArrayList<DotCom>;

public void setUpGame(){
  //first make some dot coms and give them locatiion
  DotCom one = new DotCom();
  one.setName("Pets.com");
  DotCom two = new DotCom();
  two.setName("eToys.com");
  DotCom three = new DotCom();
  three.setName("Go2.com");
  dotComslist.add(one);
  dotComslist.add(two);
  dotComslist.add(three);

  for (DotCom dotComToSet : dotComslist) {
    ArrayList<String> newLocation = helper.placeDotCom(3);
    dotComToSet.setLocationCells(newLocation);
  }//close for loop
}//close setUpGame method

  public static void main(String[] args){
    DotComBust ob = new DotComBust();

  }
}

public class DotCom(){
  private ArrayList<String> locationCells;
  private String name;

  public void setLocationCells(ArrayList<String> loc){
  locationCells =loc;
  }

  public Void setName(String n){
    name = n;
  }
}

public class GameHelper{

}

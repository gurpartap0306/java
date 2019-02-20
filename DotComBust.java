import java.io.*;
import java.util.*;
import mypackage.*;


public class DotComBust{

private GameHelper helper = new GameHelper();
private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
private int numOfGuesses =0;

public void setUpGame(){
  //first make some dot coms and give them locatiion
  DotCom one = new DotCom();
  one.setName("Pets.com");
  DotCom two = new DotCom();
  two.setName("eToys.com");
  DotCom three = new DotCom();
  three.setName("Go2.com");
  dotComsList.add(one);
  dotComsList.add(two);
  dotComsList.add(three);

  for (DotCom dotComToSet : dotComsList) {
    ArrayList<String> newLocation = helper.placeDotCom(3);
    dotComToSet.setLocationCells(newLocation);
  }//close for loop
}//close setUpGame method

private void startPlaying(){
  while(!dotComsList.isEmpty()){
    String userGuess = helper.getUserInput("Enter a guess");
    checkUserGuess(userGuess);
  }//close while
  finishGame();
}//close startPlaying method

private void checkUserGuess(String userGuess){
  numOfGuesses++;
  String result ="miss";

  for(DotCom dotComToTest : dotComsList){
    result = dotComToTest.checkYourself(userGuess);
    if(result.equals("hit")){
      break;
    }
    if(result.equals("kill")){
      dotComsList.remove(dotComToTest);
      break;
    }
  }//close for

  System.out.println(result);
}//close method

private void finishGame(){
  System.out.println("All Dot Coms are dead! Your stock is now worthless");
  if(numOfGuesses <=18){
    System.out.println("It only took you " + numOfGuesses +" guesses");
    System.out.println("You got out before your options sank.");
  }else{
    System.out.println("Took you long enough. "+ numOfGuesses + " guesses.");
    System.out.println("Fish are dacing with your optons");
  }
}//close method

  public static void main(String[] args){
    DotComBust game = new DotComBust();
    game.setUpGame();
    game.startPlaying();

  }//close method
}

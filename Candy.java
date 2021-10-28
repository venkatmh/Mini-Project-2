/**
* Candy Class
* @author Names go here
* @version 10.27
*/

class Candy {
  String candyName;

  //two constructors
  Candy(){
    candyName = "";
  }

  Candy(String aName){
    candyName = aName;
  }

  //mutator - get and set

  /**
  * This method sets the value of String candyName to the passed parameter
  * @param candy - user passed name of candy
  */
  public void setCandyName(String candy){
    candyName = candy;
  }

  /**
  * This method gets the value of String candyName and returns it
  * @return candyName
  */
  public String getCandyName(){
    return candyName;
  }

  //print method
  /**
  * This method prints candyName to the console
  * @param candyName
  */
  public void print(){
    System.out.println(candyName);
  }
}
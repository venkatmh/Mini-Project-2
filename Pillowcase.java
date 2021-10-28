/**
@author Names go here
@version 10.27
*/

import java.util.*;
class Pillowcase{
  private ArrayList<Candy> candies;
  //instance variables
  int num;
  int size = 1000;

  //constructor
  Pillowcase(){
    candies = new ArrayList<Candy>();
    num = 0;
  }

  //accessor method
  /**
  * This method gets the value of int num and returns it
  * @return num
  */
  public int getCandyCount(){
    return num;
  }

  /**
  * This method creates a new Candy object and adds it to the pillowcase
  */
  void getCandy(){

    //print
    System.out.println("Trick or Treat!");

    //make new Candy object
    Candy aCandy = new Candy();

    //generate random number for probability range
    Random r = new Random();
    int randomNum = r.nextInt(100) + 1;

    if(randomNum <= 10){
      aCandy.setCandyName("M&Ms");
    }

    else if(randomNum > 10 && randomNum <= 30){
      aCandy.setCandyName("Pink Starburst");
    }

    else if(randomNum > 30 && randomNum <= 45){
      aCandy.setCandyName("Hershey's Bar");
    }

    else if(randomNum > 45 && randomNum <= 55){
      aCandy.setCandyName("Milky Way");
    }

    else if(randomNum > 55 && randomNum <= 70){
      aCandy.setCandyName("Twix");
    }

    else if(randomNum > 70 && randomNum <= 95){
      aCandy.setCandyName("Reese's");
    }

    else if(randomNum > 95){
      aCandy.setCandyName("Kit Kat");
    }
  
    System.out.println("We got " + aCandy.getCandyName());

    candies.add(aCandy);
    num ++;
  }

  /**
  * This method prints the number of candies you have gotten
  */
  public void printNumCandies(){
    int numCandies[] = new int [7];

    numCandies[0] = 0;
    numCandies[1] = 0;
    numCandies[2] = 0;
    numCandies[3] = 0;
    numCandies[4] = 0;
    numCandies[5] = 0;
    numCandies[6] = 0;

    for(int i = 0; i < candies.size(); i++){

      if(candies.get(i).getCandyName().equals("M&Ms")){
        numCandies[0] ++;
      }

      else if(candies.get(i).getCandyName().equals("Pink Starburst")){
        numCandies[1] ++;
      }

      else if(candies.get(i).getCandyName().equals("Hershey's Bar")){
        numCandies[2] ++;
      }

      else if(candies.get(i).getCandyName().equals("Milky Way")){
        numCandies[3] ++;
      }

      else if(candies.get(i).getCandyName().equals("Twix")){
        numCandies[4] ++;
      }

      else if(candies.get(i).getCandyName().equals("Reese's")){
        numCandies[5] ++;
      }

      else if(candies.get(i).getCandyName().equals("Kit Kat")){
        numCandies[6] ++;
      }
    }

   System.out.println("We got...");
   if(numCandies[0] > 0){
     System.out.println(numCandies[0] + " M&Ms");
   }

   if(numCandies[1] > 0){
     System.out.println(numCandies[1] + " Pink Starburst");
   }

   if(numCandies[2] > 0){
     System.out.println(numCandies[2] + " Hershey's Bar");
   }

   if(numCandies[3] > 0){
     System.out.println(numCandies[3] + " Milky Way");
   }

   if(numCandies[4] > 0){
     System.out.println(numCandies[4] + " Twix");
   }

   if(numCandies[5] > 0){
     System.out.println(numCandies[5] + " Reese's");
   }

   if(numCandies[6] > 0){
     System.out.println(numCandies[6] + " Kit Kat");
   }
  }
  
}
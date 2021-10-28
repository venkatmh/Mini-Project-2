/**
This method is a simple model for trick or treating with two classes -
Candy and Pillowcase
@author Names go here
@version 10.27
*/

import java.util.*;
class Main {
  public static void main(String[] args) {
    
    Pillowcase p = new Pillowcase();
    
    System.out.println("Happy Halloween! How many houses should we trick or treat at? ");
    
    Scanner s = new Scanner(System.in);
    int houses = s.nextInt();

    for(int i = 0; i < houses; i++){
      p.getCandy();
    }

    System.out.println("We have " + p.getCandyCount() + " candies, " + p.getCandyCount() * 100 / p.size + "% of our pillowcase.");

    p.printNumCandies();
  }
}
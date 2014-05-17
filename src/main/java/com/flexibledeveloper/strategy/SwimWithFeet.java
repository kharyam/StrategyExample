package com.flexibledeveloper.strategy;

/**
 * Created by kharym on 5/11/14.
 */
public class SwimWithFeet implements SwimBehavior {


  @Override
  public void swim() {
    System.out.println("Swimming with feet.");
  }

}

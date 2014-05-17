package com.flexibledeveloper.strategy;

/**
 * Created by kharym on 5/11/14.
 */
public class FlyWithWings implements FlyBehavior {


  @Override
  public void fly() {
    System.out.println("Flapping wings for flight.");
  }

}

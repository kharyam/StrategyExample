package com.flexibledeveloper.strategy;

/**
 * Created by kharym on 5/11/14.
 */
public class FlyWithEngines implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("Using engines for flight.");
  }

}

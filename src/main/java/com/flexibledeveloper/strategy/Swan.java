package com.flexibledeveloper.strategy;

/**
 * Created by kharym on 5/11/14.
 */
public class Swan extends Thing {
  public Swan() {
    setFlyBehavior(new FlyWithWings());
    setSwimBehavior(new SwimWithFeet());
  }

  @Override
  public String toString() {
    return "swan";
  }

}

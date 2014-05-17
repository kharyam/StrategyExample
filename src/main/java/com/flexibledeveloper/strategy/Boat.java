package com.flexibledeveloper.strategy;

/**
 * Created by kharym on 5/11/14.
 */
public class Boat extends Thing {
  public Boat() {
    setFlyBehavior(new FlyCantDoIt());
    setSwimBehavior(new SwimWithPropeller());
  }
  @Override
  public String toString() {
    return "boat";
  }
}

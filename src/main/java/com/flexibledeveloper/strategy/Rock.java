package com.flexibledeveloper.strategy;

/**
 * Created by kharym on 5/11/14.
 */
public class Rock extends Thing {
  public Rock() {
    setFlyBehavior(new FlyCantDoIt());
    setSwimBehavior(new SwimCantDoIt());
  }

  @Override
  public String toString() {
    return "rock";
  }
}

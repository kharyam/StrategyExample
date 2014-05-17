package com.flexibledeveloper.strategy;

/**
 * Created by kharym on 5/11/14.
 */
public class Plane extends Thing {
  public Plane() {
    setFlyBehavior(new FlyWithEngines());
    setSwimBehavior(new SwimCantDoIt());
  }

  @Override
  public String toString() {
    return "plane";
  }
}

package com.flexibledeveloper.strategy;

/**
 * Created by kharym on 5/11/14.
 */
public class SeaPlane extends Thing {
  public SeaPlane() {
    setFlyBehavior(new FlyWithEngines());
    setSwimBehavior(new SwimWithPropeller());
  }

  @Override
  public String toString() {
    return "seaplane";
  }

}

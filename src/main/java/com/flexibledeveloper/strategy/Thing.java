package com.flexibledeveloper.strategy;

/**
 * Created by kharym on 5/11/14.
 */
public abstract class Thing {
  private FlyBehavior flyBehavior;
  private SwimBehavior swimBehavior;

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setSwimBehavior(SwimBehavior swimBehavior) {
    this.swimBehavior = swimBehavior;
  }

  public void performFly() {
    flyBehavior.fly();
  }

  public void performSwim() {
    swimBehavior.swim();
  }

}
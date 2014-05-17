package com.flexibledeveloper.strategy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kharym on 5/11/14.
 */

public class StrategyExampleTest {

  @Test
  public void testDefaultBehavior(){
    List<Thing> things = new ArrayList<Thing>();

    things.add(new Rock());
    things.add(new Plane());
    things.add(new SeaPlane());
    things.add(new Swan());
    things.add(new Boat());

    for (Thing thing : things) {
      System.out.println("Behavior of " + thing + ':');
      thing.performSwim();
      thing.performFly();
      System.out.println();
    }

  }

  @Test
  public void testChangeBehavior(){
    Thing thing = new Plane();

    System.out.println("Test default " + thing + " behavior:");
    thing.performFly();

    System.out.println("Simulate running out of fuel");
    thing.setFlyBehavior(new FlyCantDoIt());
    thing.performFly();
    System.out.println();
  }

}
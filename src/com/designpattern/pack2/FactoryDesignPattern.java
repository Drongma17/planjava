package com.designpattern.pack2;

public class FactoryDesignPattern {


  public static FlyingInSky birdsFlyingToSky(String type) throws IllegalAccessException {
      if (type == null || type.isEmpty())
          return null;

      switch (type.toLowerCase()){
          case "duck":
              return new Duck();
          case "owe":
              return new Owe();
          case "peagen":
              return new Peagen();
          default:
              throw new IllegalAccessException("Unknown bird"+ type);
      }
  }


}

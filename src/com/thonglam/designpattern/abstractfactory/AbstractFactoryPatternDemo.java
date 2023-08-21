package com.thonglam.designpattern.abstractfactory;

interface Mobile
{
    String IPHONE = "IPhone";
    String ONEPLUS = "OnePlus";
    String SONY = "Sony";
    void brandName();
}

class Iphone implements Mobile
{
    
    @Override
    public void brandName() {
        System.out.println("Iphone");
    }
    
}
class OnePlus implements Mobile
{
    @Override
    public void brandName() {
        System.out.println("OnePlus");
        
    }
}
class Sony implements Mobile
{
    @Override
    public void brandName() {
        System.out.println("Sony");
        
    }
}

abstract class AbstractFactory 
{
   abstract Mobile getMobile(String model) ;
}
 
 class AppleMobileFactory extends AbstractFactory {
       @Override
       public Mobile getMobile(String model){    
          if(model.equalsIgnoreCase("iphone")){
             return new Iphone();         
          } 
          return null;
       }
    }

 class AndroidMobileFactory extends AbstractFactory {
       @Override
       public Mobile getMobile(String brand)
       {    
          if(brand.equalsIgnoreCase("Oneplus"))
          {
             return new OnePlus();         
          }
          else if(brand.equalsIgnoreCase("Sony"))
          {
             return new Sony();
          }     
          return null;
       }
    }

  class FactoryProducer 
  {
       public static AbstractFactory getFactory(boolean isApple)
       {   
          if(isApple)
          {
             return new AppleMobileFactory();         
          }
          else
          {
             return new AndroidMobileFactory();
          }
       }
    }
  
public  class AbstractFactoryPatternDemo 
{
       public static void main(String[] args) 
       {
          AbstractFactory mobileFactory1 = FactoryProducer.getFactory(false);
          Mobile oneplus = mobileFactory1.getMobile("Oneplus");
          oneplus.brandName();
          Mobile sony =  mobileFactory1.getMobile("Sony");
          sony.brandName();
          AbstractFactory mobileFactory2 = FactoryProducer.getFactory(true);
          Mobile iphone = mobileFactory2.getMobile("iphone");
          iphone.brandName();
       }
}
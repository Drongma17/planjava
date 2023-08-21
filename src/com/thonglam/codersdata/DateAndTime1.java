package com.thonglam.codersdata;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

class DateAndTime1
{
  public static void main(String[] args) 
  {
      //Getting the Current Date
      LocalDate today = LocalDate.now();
      System.out.println("Current Date="+today);
            
      //Creating an object of LocalDate by providing input arguments
      LocalDate specifiedDate = LocalDate.of(2020, Month.APRIL, 30);
      System.out.println("Specific Date="+specifiedDate);
            
      //Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
      LocalDate todayIndia = LocalDate.now(ZoneId.of("Asia/Kolkata"));
      System.out.println("Current Date in IST="+todayIndia);

      //Getting date from the base date i.e 01/01/1970
      LocalDate dateFromBase = LocalDate.ofEpochDay(365);
      System.out.println("365th day from base date= "+dateFromBase);
            
      LocalDate hundredDay2020 = LocalDate.ofYearDay(2020, 100);
      System.out.println("100th day of 2014="+hundredDay2020);
  }
}
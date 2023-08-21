package com.thonglam.hashandequal;

public class Student {

    private String registrationNumber;

    public Student(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }


    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean equals(Object o){
//        System.out.println("From Map in equals method ");
        if(o != null && o instanceof Student) {
            String regNumber = ((Student)o).getRegistrationNumber();
            if (regNumber != null && regNumber.equals(this.getRegistrationNumber())) {
                return true;
            }
        }
        return false;
    }

    static int i =1;
  public int hashCode(){
//      System.out.println("From Mapop...."+ i);
       i = i +1;
        return this.registrationNumber.hashCode();
  }
}

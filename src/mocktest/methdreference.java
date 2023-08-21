package mocktest;

interface i{
    void m1(int a);
}

class A{
    static void show(int salary){
        System.out.println("salary is "+ salary);
    }

    void show1(){
        System.out.println("this is normal method ");
    }

    A(int saly){

    }
}

public class methdreference {

    public static void main(String[] args) {
        i obj= A::show;
        obj.m1(500);
    }
}

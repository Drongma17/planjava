package codingcrack.miscellanius;

interface XYZ {
    void sing(String name);
}

class XYZIMP implements XYZ{

    @Override
    public void sing(String name) {
        System.out.println("this is xyx " + name);
    }
}

 // dapter class
public class PracticeClass implements XYZ {
     @Override
     public void sing(String name) {

     }
 }

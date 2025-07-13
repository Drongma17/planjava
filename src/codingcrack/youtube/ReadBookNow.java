package codingcrack.youtube;

public class ReadBookNow {

    public static void main(String[] args) {

        FunctionalExample readme = (book)->{
            System.out.println(book + " is the book best ever I read so far");
        };
        FunctionalExample funex= (book)-> System.out.println("read book : "+book);

        readme.read("My Land And My People");

        funex.read("Voice for Voiceless");
    }
}

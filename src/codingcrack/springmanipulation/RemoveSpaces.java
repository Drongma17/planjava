package codingcrack.springmanipulation;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "  Java   Code  ";
        String result = str.replaceAll("\\s+", "");
        System.out.println("Without spaces: " + result); // Output: JavaCode
    }
}
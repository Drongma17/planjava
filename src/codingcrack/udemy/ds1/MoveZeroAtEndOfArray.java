package codingcrack.udemy.ds1;

public class MoveZeroAtEndOfArray {


    static int[] solution(int[] arr) {

        int nonZeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }
        for (int j = nonZeroIndex; j < arr.length; j++) {
            arr[j] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 3, 0, 0, 2, 0, 7, 0, 12};
        int[] arr2 = MoveZeroAtEndOfArray.solution(arr1);
        for (int i : arr2) {
            System.out.printf(i + " ");
        }
    }
}

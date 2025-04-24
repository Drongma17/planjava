package codingcrack.udemy.ds1;

public class ktimerightshift {


    static int[] ktimerotate(int[] arr, int k){

        // k=3
        for(int i=0; i<=k; i++){
            int temp =arr[0];
            for(int j=0; j<arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] numbs ={1,2,3,4,5,6,7};
        int[] numbs1 = ktimerightshift.ktimerotate(numbs, 3);
        for(int i: numbs1){
            System.out.print(i +" ");
        }
    }

}

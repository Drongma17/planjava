package reviews.clientinterview;

public class UniqueElement {

    public static void uniqueChar(int[] a){
        for(int i=0; i<a.length; i++){
            boolean isUnique = true;

            for(int j=0; j<i; j++){
                if(a[i] == a[j]) {
                    isUnique = false;
                    break;
                }

            }
            if(isUnique){
                System.out.println(a[i]+ " ");
            }
        }


    }
    public static void main(String[] args) {

        int[] a={1,2,3,4,3,4,5,5,6,7,8,8,9};
        UniqueElement u = new UniqueElement();
        u.uniqueChar(a);
    }
}

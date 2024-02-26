import java.util.Arrays;

public class feladat6 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {2, 3, 4, 1};
        int[] array4 = {1, 2, 3, 4};
        arrayEqual(array1,array2);
        arrayEqual(array1,array3);
        arrayEqual(array1,array4);
    }

    public static void arrayEqual(int[] x, int[] y) {
        if(Arrays.equals(x,y)){
            System.out.println("A két tömb azonos");
        }
        else{
            System.out.println("A két tömb nem azonos");
        }
    }
}

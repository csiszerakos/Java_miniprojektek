import java.util.Scanner;

public class feladat5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Adja meg a tömb méretét: ");
        int n = sc.nextInt();

        int[] tomb = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Adja meg a tömb " + (i + 1) + ". elemét: ");
            tomb[i] = sc.nextInt();
        }
        int temp = tomb[0];
        tomb[0] = tomb[tomb.length - 1];
        tomb[tomb.length - 1] = temp;

        System.out.print("Tömb elemei a csere után: ");
        for (int elem : tomb) {
            System.out.print(elem + " ");
        }
    }
}

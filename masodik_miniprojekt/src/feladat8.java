import java.util.Scanner;

public class feladat8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Adja meg a tömb méretét: ");
        int n = sc.nextInt();

        int[] tomb = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Adja meg a tömb " + (i + 1) + ". elemét: ");
            tomb[i] = sc.nextInt();
        }

        for (int i = 1; i < tomb.length; i++) {
            int j = i;
            int kulcs = tomb[i];

            while (j > 0 && tomb[j - 1] > kulcs) {
                tomb[j] = tomb[j - 1];
                j--;
            }

            tomb[j] = kulcs;
        }

        for (int elem : tomb) {
            System.out.print(elem + " ");
        }
    }
}

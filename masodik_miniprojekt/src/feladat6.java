import java.util.Scanner;

public class feladat6 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg a tömb méretét: ");
        int n = sc.nextInt();

        int[] tomb = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Adja meg a tömb " + (i+1) + ". elemét: ");
            tomb[i] = sc.nextInt();
        }
        int min = tomb[0];
        int max = tomb[0];
        for(int x = 0; x < n; x++){
            if(tomb[x] < min){
                min = tomb[x];
            } else if (max <= tomb[x]) {
                max = tomb[x];
            }
            else{
                System.out.println("Itt valami baj van Mounika...");
            }
        }
        System.out.println("A legkissebb szám a " + min);
        System.out.println("A legnagyobb szám a " + max);
    }
}

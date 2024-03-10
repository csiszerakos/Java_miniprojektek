import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class feladat7 {
    public static void main(String[] args) {
        System.out.print("Adja meg a tömb hosszát: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tomb = new int[n];
        List<Integer> ismetlok = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Adja meg a tömb " + (i + 1) + ". elemét: ");
            tomb[i] = sc.nextInt();

            for (int j = 0; j < i; j++) {
                if (tomb[i] == tomb[j]) {
                    ismetlok.add(tomb[i]);
                    break;
                }
            }
        }
        int[] ismetlokTomb = new int[ismetlok.size()];
        for (int i = 0; i < ismetlok.size(); i++) {
            ismetlokTomb[i] = ismetlok.get(i);
        }
        if(!(ismetlokTomb.length==0)) {
            System.out.println("Az ismetlődő elemek: ");
            for (int elem : ismetlokTomb) {
                System.out.print(elem + " ");
            }
        }else{
            System.out.print("Nincsenek ismétlődő elemek a tömbben.");
        }
    }
}


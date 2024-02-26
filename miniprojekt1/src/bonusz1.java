import java.util.Scanner;

public class bonusz1 {
    public static void main(String[] args) {
        System.out.println("A kávé alap ára: 200 forint");
        System.out.println("1. Pohár nélkül");
        System.out.println("2. Dubla cukor");
        System.out.println("3. Habos kávé");
        Scanner sc = new Scanner(System.in);
        int caffe = sc.nextInt();
        int price = 200;
        if (caffe == 1) {
            int caffePrice = price - 10;
            System.out.print("A kávéja " + caffePrice + " forintba kerül.");
        } else if (caffe == 2) {
            int caffePrice = price + 20;
            System.out.print("A kávéja " + caffePrice + " forintba kerül.");
        } else if (caffe == 3) {
            int caffePrice = price + 50;
            System.out.print("A kávéja " + caffePrice + " forintba kerül.");
        } else {
            System.out.print("Nincs ilyen kávé.");
        }

    }
}

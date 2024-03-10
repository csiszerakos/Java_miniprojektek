import java.util.Scanner;

public class feladat1v2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Adj meg egy szót: ");
        String word = sc.nextLine();
        String firstLetter = word.substring(0,1);
        String lastLetter = word.substring(word.length() - 1);

        System.out.println("Az első betű: " + firstLetter);
        System.out.println("Az utolsó betű: " + lastLetter);

    }
}

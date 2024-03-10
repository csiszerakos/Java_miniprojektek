import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class feladat1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Adj meg egy szót: ");
        String string = sc.nextLine();
        List<Character> betuk = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            betuk.add(string.charAt(i));
        }
        System.out.println("Első karakter: " +betuk.getFirst());
        System.out.println("Utolsó karakter: " + betuk.get(string.length()-1));
    }
}

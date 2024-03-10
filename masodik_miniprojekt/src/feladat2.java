import java.util.Scanner;

public class feladat2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg egy szavat: ");
        String string = sc.nextLine();
        String new_string = string.replace('a','*');
        System.out.println(new_string);
    }
}

import java.util.Scanner;

public class feladat5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isOnlyLetter(str));
    }
    public static boolean isOnlyLetter(String str) {
        return str.matches("[a-zA-Z]+");
    }
}

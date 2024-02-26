import java.util.Scanner;

public class feladat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adjon meg egy számot: ");
        int i = sc.nextInt();
        if(0<i && i<11){
            for(int y=0;y<11;y++){
                System.out.println(y + " X " + i  + " = " + i*y);
            }
        }
        else{
            System.out.println("Nem megfelelő a szám.");
        }
    }
}

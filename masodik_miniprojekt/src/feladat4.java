import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class feladat4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adjon meg egy karakterláncot: ");
        String characters = sc.next();

        Map<Character, Integer> ismetlodesek = new HashMap<>();
        for (char karakter : characters.toCharArray()) {
            ismetlodesek.put(karakter, ismetlodesek.getOrDefault(karakter, 0) + 1);
        }

        StringBuilder tomorített = new StringBuilder();
        for (Map.Entry<Character, Integer> bejegyzés : ismetlodesek.entrySet()) {
            tomorített.append(bejegyzés.getKey());
            tomorített.append(bejegyzés.getValue());
        }

        System.out.println(tomorített);
    }
}

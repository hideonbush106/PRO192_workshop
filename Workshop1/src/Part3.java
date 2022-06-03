
import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        String[] list = new String[10];

        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            list[i] = sc.nextLine();
            String firstChar = list[i].substring(0,1).toUpperCase();
            list[i] = firstChar + list[i].substring(1).toLowerCase();
        }
        for (int i = 0; i < 10; i++) {
            System.out.format("%s\n", list[i]);
        }
    }
}
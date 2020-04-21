import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
       //vowels A(65) E(69) I(73) O(79) U(85) a(97) e i o u

            if((int)ch == 65 || (int)ch == 69 ||(int)ch == 73 ||(int)ch == 79 ||(int)ch == 85 || (int)ch == 97 || (int)ch == 101 ||(int)ch == 105 ||(int)ch == 111 ||(int)ch == 117) {
                return true;
            } else {
                return false;
            }

    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}
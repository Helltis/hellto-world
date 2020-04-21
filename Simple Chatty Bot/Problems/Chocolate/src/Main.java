import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if ((z % x == 0 || z % y == 0) && ((x*y) > z)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
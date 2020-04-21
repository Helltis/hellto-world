import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.next();
        if (x.charAt(0) == x.charAt(x.length()-1) && x.charAt(1) == x.charAt(2)) {
            System.out.println("1");
        } else {
            System.out.println((int)(Math.random()*100));
        }
    }
}
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
        
        String jv = sc.next();
        String jd = jv.toLowerCase();

        
        System.out.print(jd.startsWith("j"));
    }
}

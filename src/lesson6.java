import java.util.Scanner;

public class lesson6 {
    static Scanner consola = new Scanner(System.in);
    public static void main(String[] args) {
        int a = consola.nextInt();
        //int v = consola.nextInt();
        if (a >= 20 && a <= 40){
            System.out.println("YES");
        } else  {
            System.out.println("No");
        }
    }
}

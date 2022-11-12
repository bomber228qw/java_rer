import java.util.Scanner;

public class iessa {
    static Scanner consolt = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        int z = consolt.nextInt();
        System.out.print("Введите число: ");
        int x = consolt.nextInt();
        System.out.print("Введите число: ");
        int c = consolt.nextInt();
        if (z < x && z < c) {
            System.out.print(z);
        } else if (x < z && x < c) {
            System.out.println(x);
        }else {
            System.out.println(c);
        }
    }
}

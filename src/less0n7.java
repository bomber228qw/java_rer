import java.util.Scanner;

public class less0n7 {
    static Scanner consolt = new Scanner(System.in);

    public static void main(String[] args) {
        int z = 1;
        System.out.print("Введите число: ");
        z = consolt.nextInt();

        //int count =0;
        int conut = 0;
        while (conut * conut <= z) {
            System.out.println(conut * conut);
            conut++;
        }
    }
}

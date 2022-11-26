import java.util.Scanner;

public class Main {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        int z = console.nextInt();

        if (z<10000){
            System.out.println(  z + " не превышает лимит, проходите");
        } else if (z > 10000) {
            System.out.println("Ого! " +z+ "!Куда вам столько? Мы заберем " +z+1000);
        }
    }
}
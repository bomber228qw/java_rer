import java.util.Scanner;

public class control_R {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
exponentiation();

    }

    public static void exponentiation() {
        int a =  console.nextInt();
        System.out.print(a*a +"  ");
        System.out.print(a*a*a);
    }
}
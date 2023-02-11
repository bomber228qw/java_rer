import java.util.Scanner;

public class lesson112 {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        int lsti = 0;
        int a = console.nextInt();
        int[] myArray = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Введите число " + (i + 1) + " =");
            myArray[i] = console.nextInt();
        }
        for (int j = 0; j < myArray.length; j++) {
            if (lsti < myArray[j]) {
                if (lsti > 0) {
                    System.out.println(myArray[j]);
                }

            }
        }
    }
}
import java.util.Scanner;

public class esson5 {
    static Scanner consolr = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Введите число: ");
        int g = consolr.nextInt();

        if (g>=3 && g<=5  ){
            System.out.println("Весна");
        }else if (g>=6 && g<=8){
            System.out.println("Лето");
        } else if (g>=9 && g<=11) {
            System.out.println("Осень");
        } else if (g == 12) {
            System.out.println("Зима");
        } else if (g == 1) {
            System.out.println("Зима");
        }else if (g == 2) {
            System.out.println("Зима");
        }else {
            System.out.println(":(");
        }
    }
}

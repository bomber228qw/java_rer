import java.util.Scanner;

public class lesson_9 {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        String a = console.nextLine();
        System.out.print("Введите действие: ");
        String c = console.nextLine();
        System.out.print("Введите число: ");
        String b = console.nextLine();
        Integer d = Integer.parseInt(a);
        Integer e = Integer.parseInt(b);
       if (c.equalsIgnoreCase("+")){
           System.out.println(d+e);
       } else if (c.equalsIgnoreCase("-")) {
           System.out.println(d-e);
       } else if (c.equalsIgnoreCase("/")) {
           System.out.println(d/e);
       } else if (c.equalsIgnoreCase("*")) {
           System.out.println(d*e);
       }else {
           System.out.println("error");
       }
    }
}



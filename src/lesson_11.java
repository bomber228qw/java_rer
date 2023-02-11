import java.util.Scanner;

public class lesson_11 {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        int a =  console.nextInt();
        int[] myArray = new int[a];
      for(int i=0;i<a;i++){
        System.out.print("Введите число "+(i+1)+" =");
        myArray[i] =console.nextInt();}
        for (int i=0; i<myArray.length;i++){
            System.out.println(i);
        }
    }
}

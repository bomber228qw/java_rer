import java.util.Scanner;

public class lesson9_3 {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        String obama = console.nextLine();
        String post = console.nextLine();
        System.out.println(post.equalsIgnoreCase(obama.substring(obama.length() - post.length(), obama.length())));
    }
}
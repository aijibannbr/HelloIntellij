import java.util.Scanner;
public class HelloIntellij {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a message to display:");
        String message = scanner.nextLine();
        System.out.println(message);
        scanner.close();
    }
}
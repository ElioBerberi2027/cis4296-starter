import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println(hello());
    }

    public static String hello(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello User (say it back)");

        String input = "User said: " + scanner.nextLine();
         
        return input;
    }
}

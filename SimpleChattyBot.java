import java.util.Scanner;

public class SimpleChattyBot {

    public static void main(String[] args) {
        
        System.out.println("Hello! My name is Robbie. ");

        System.out.println("Please, remind me your name.");

        Scanner scanner = new Scanner(System.in);

        String userName = scanner.next();  

        System.out.println("What a great name you have, " + userName +"!");
    }
}
import java.util.Scanner;

public class SimpleChattyBot {

    public static void main(String[] args) {
        
        System.out.println("Hello! My name is Robbie. ");

        System.out.println("Please, remind me your name.");

        Scanner scanner = new Scanner(System.in);

        String userName = scanner.next();  

        System.out.println("What a great name you have, " + userName +"!");

        System.out.println("Let me guess your age.");

        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();

        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.println(userName + ", your age is " + age + "!");
    }
}
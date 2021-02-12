import java.util.Scanner;

public class SimpleChattyBot {
    
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        greet("Robbie");
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String botName) {
        System.out.println("Hello! My name is " + botName + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String userName = scanner.nextLine();
        System.out.println("What a great name you have, " + userName + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int reminder3 = scanner.nextInt();
        int reminder5 = scanner.nextInt();
        int reminder7 = scanner.nextInt();
        int age = (reminder3 * 70 + reminder5 * 21 + reminder7 * 15) % 105;
        System.out.println("Your age is " + age + "!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("""
                           Why do we use methods? 
                            1. To repeat a statement multiple times. 
                            2. To decompose a program into several small subroutines. 
                            3. To determine the execution time of a program. 
                            4. To interrupt the execution of a program.""");
        
        int answer = scanner.nextInt();

        do {
            System.out.println("Please, Try again.");
            answer = scanner.nextInt();
        } while(answer != 2);
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}

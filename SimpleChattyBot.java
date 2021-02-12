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

        System.out.println("Now I will prove to you that I can count to any number you want.");

        int number = scanner.nextInt();

        for ( int i = 0; i <= number; i++) {
            System.out.println(i + "!");
        }

        System.out.println("Let's test your programming knowledge.");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
       
        int answer = scanner.nextInt();

        boolean j = false;
         do {
            if (answer == 2) {
         System.out.println("Congratulations, have a nice day!");
         j = true;
        } else {
         System.out.println("Please, try again");
         answer = scanner.nextInt();
        } 
          } while(j == false);
    }
}

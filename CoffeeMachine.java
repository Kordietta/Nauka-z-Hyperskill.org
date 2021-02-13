package machine;
import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
        System.out.println();
        
        System.out.println("Write how many cups of coffee you will need:");
        
        int amountCups = scanner.nextInt();
        
        int water = 200; 
        int milk = 50;
        int beans = 15;
        
        System.out.println("For " + amountCups +" cups of coffee you will need:");
        System.out.println(amountCups*water + " ml of water");
        System.out.println(amountCups*milk + " ml of milk");
        System.out.println(amountCups*beans +" g of coffee beans");
        
    }
}

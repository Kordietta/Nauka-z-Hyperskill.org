import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        
        int basicWater = 400;
        int basicMilk = 540;
        int basicBeans = 120;
        int basicCups = 9;
        int basicMoney = 550;
        
        int[] zawartoscMaszyny = {basicWater, basicMilk, basicBeans, basicCups, basicMoney};
         
        
        int requiredCup = 1;
        
        
        int requiredWaterForEspresso = 250; 
        int requiredMilkForEspresso = 0;
        int requiredBeansForEspresso = 16;
        int requiredMoneyForEspresso = 4;      
        
        int[] skladnikiNaEspresso = {requiredWaterForEspresso, requiredMilkForEspresso, requiredBeansForEspresso, requiredCup, requiredMoneyForEspresso};
        
        
        int requiredWaterForLatte = 350; 
        int requiredMilkForLatte = 75;
        int requiredBeansForLatte = 20;
        int requiredMoneyForLatte = 7;
        
        int[] skladnikiNaLatte = {requiredWaterForLatte, requiredMilkForLatte, requiredBeansForLatte, requiredCup, requiredMoneyForLatte};
        
        
        int requiredWaterForCappuccino = 200; 
        int requiredMilkForCappuccino = 100;
        int requiredBeansForCappuccino = 12;
        int requiredMoneyForCappuccino = 6;
        
        int[] skladnikiNaCappuccino = {requiredWaterForCappuccino, requiredMilkForCappuccino, requiredBeansForCappuccino, requiredCup, requiredMoneyForCappuccino};
    
        
        int add = 0;
        boolean condition = true;
    
    while(condition==true) {System.out.println("Write action (buy, fill, take, remaining, exit):");
    String action = scanner.next();
    
    switch (action) {
             case "buy": System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                         String option = scanner.next();
                         switch (option) {
                         case "1": 
                                 zawartoscMaszyny = buy(zawartoscMaszyny, skladnikiNaEspresso);                       
                                 break;
                         case "2": 
                                 zawartoscMaszyny = buy(zawartoscMaszyny, skladnikiNaLatte);                                  
                                 break;
                         case "3": 
                                 zawartoscMaszyny = buy(zawartoscMaszyny, skladnikiNaCappuccino);
                                 break;
                         case "back": 
                                 break;
                      }
                         
                     break;
                    
        case "fill": System.out.println("Write how many ml of water do you want to add:");
                     add = scanner.nextInt();
                     basicWater += add;
                     System.out.println("Write how many ml of milk do you want to add:");
                     add = scanner.nextInt();
                     basicMilk += add;
                     System.out.println("Write how many grams of coffee beans do you want to add:"); 
                     add = scanner.nextInt();
                     basicBeans += add;
                     System.out.println("Write how many disposable cups of coffee do you want to add:");
                     add = scanner.nextInt();
                     basicCups += add;
                    break;
                    
        case "take": System.out.println("I gave you $" + basicMoney);
                     basicMoney = 0;
                     break;
                     
        case "remaining":
                     show(zawartoscMaszyny);
                     break;
        case "exit":
                     condition = false;          
                     break;
                     
        } 
        
    } 
     
    }
    
    public static int[] buy(int[] tablicaZawartosciMaszyny, int[] tablicaWybranejKawy){
         
        int[] aktualizacjaZawartosciTablicy = new int[5];

        for (int i = 0; i < 4; i++) {
            if (tablicaZawartosciMaszyny[i] >= tablicaWybranejKawy[i]){
            }
            else { 
                if ( i == 1) {System.out.println("Sorry, not enough water!");}
                if ( i == 2) {System.out.println("Sorry, not enough milk!");}
                if ( i == 3) {System.out.println("Sorry, not enough beans!");}
                if ( i == 4) {System.out.println("Sorry, not enough cups!");}
                return tablicaZawartosciMaszyny;
            }
        }
        
        System.out.println("I have enough resources, making you a coffee!");
        
        for (int i = 0; i < 5; i++){
            
            if (i == 4) {
                aktualizacjaZawartosciTablicy[i] = tablicaZawartosciMaszyny[i] + tablicaWybranejKawy[i];
            } else {
            aktualizacjaZawartosciTablicy[i] = tablicaZawartosciMaszyny[i] - tablicaWybranejKawy[i];    
            }
       
        } 
        return aktualizacjaZawartosciTablicy;
     } 
    
    public static void show(int[] tablicaZawartosciMaszyny)
     {
         System.out.println("The coffee machine has:");
                                System.out.println(tablicaZawartosciMaszyny[0] + " of water");
                                System.out.println(tablicaZawartosciMaszyny[1] + " of milk");
                                System.out.println(tablicaZawartosciMaszyny[2] + " of coffee beans");
                                System.out.println(tablicaZawartosciMaszyny[3] + " of disposable cups");
                                System.out.println(tablicaZawartosciMaszyny[4] + " of money");

     }
    
}

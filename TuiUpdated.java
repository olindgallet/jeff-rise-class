import java.util.Scanner;
/**
 * The goal of this exercise is to understand how a Pokemon (and similar games)
 * are programmed.  I'll help you out by putting in hints.
 * 
 * -Add in a new pokemon.
 * -Use their setHealth(int value) methods to reduce their hp, check their hps with getHealth() to display
 *  meaningful messages.
 * -Look in the Java Math API, try to use random? < extra credit.
 */
public class TuiUpdated{
    public static void main(String[] args){
        System.out.println("Enter the name of Pokemon 1");
        Pokemon pokemon1 = new Pokemon(getUserString());
        
        System.out.println("Enter the name of Pokemon 2");
        Pokemon pokemon2 = new Pokemon(getUserString());
        
        
        while (pokemon1.getHealth() > 0 && pokemon2.getHealth() > 0){
            System.out.println(pokemon1.getName() + " attacks!");
            pokemon2.setHealth(pokemon2.getHealth() - 2);
            System.out.println(pokemon2.getName() + " now has " + pokemon2.getHealth() + " health.");
            
            System.out.println(pokemon2.getName() + " attacks!");
            pokemon1.setHealth(pokemon1.getHealth() - 2);
            System.out.println(pokemon1.getName() + " now has " + pokemon1.getHealth() + " health.");
        }
        
        if (pokemon1.getHealth() <= 0){
            System.out.println(pokemon1.getName() + " has fainted!");
        } 
        if (pokemon2.getHealth() <= 0){
            System.out.println(pokemon2.getName() + " has fainted!");
        }
    }    
       
    private static int getUserInt(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int output   = 0;
        
        try {
            output = Integer.parseInt(input);
        } catch (NumberFormatException e){
            //this is what happens when you don't put an integer.
        }
        
        return output;
        
    }
    
    private static String getUserString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
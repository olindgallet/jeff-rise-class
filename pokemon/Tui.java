import java.util.Scanner;
/**
 * The goal of this exercise is to understand how a Pokemon (and similar games)
 * are programmed.  I'll help you out by putting in hints.
 */
public class Tui{
    public static void main(String[] args){
        int menuChoice = 0;
        String name    = "";
        String givenName = "";
        //This is the basic process of a text-based interface.
        //Provide a prompt for the user, then allow the user to type in.
        //Remember, type is important.
        System.out.println("What name do you want to give your pokemon?");
        givenName = getUserString();
        System.out.println(givenName + " is a great partner!"); 
        System.out.println("Which pokemon do you want? Charmander, Bulbasaur or Squirtle?");
        name = getUserString();
        if (name.equals("Charmander")){
            System.out.println("Gary- I guess i'm choosing Squirtle then.");
        } else if (name.equals("Squirtle")){
            System.out.println("Gary- I guess i'm choosing The only good one of the three.");
        } else if (name.equals("Bulbasaur")){
            System.out.println("Gary- How Dare you! I wanted that pokemon.");
        }
        
        while (menuChoice != -45){
            System.out.println("-1 to exit");
            System.out.println("1. User Name");
            System.out.println("2. Pokemon Name");
            menuChoice = getUserInt();
            
                
            if (menuChoice == 1){ 
                System.out.println("What is your name young trainer?");
                givenName = getUserString();
                System.out.println(givenName + " Is a wonderful name");
            }         
            if (menuChoice == 2){ 
                System.out.println("You already gave your pokemon a name!");
        
                
            }
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

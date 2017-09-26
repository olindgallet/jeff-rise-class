/**
 * This is an object class for a Pokemon.
 * 
 * @author Olin Gallet
 * @date 9/26/2017
 */
public class Pokemon{
    private String name;
    private int health;
    
    /**
     * Constructs a new Pokemon with the given name.
     * @param name the name of the pokemon
     */
    public Pokemon(String name){
        this.name   = name;
        this.health = 10;
    }
    
    /**
     * Returns the name of the pokemon.
     * @return the current name of the pokemon.
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * Returns the value of the health.
     * @return the current health value of the pokemon
     */
    public int getHealth(){
        return this.health;
    }
    
    /**
     * Sets the health to the given value.
     * @param health the new value of health
     */
    public void setHealth(int health){
        this.health = health;
    }
}
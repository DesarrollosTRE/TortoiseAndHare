
/**
 * Race Main is where the Tortoise and Hare will preform the race
 */
public class RaceMain {
    
    public static void main(String[] args) {
        
        Racer racer = new Racer();
        
        Thread tortoise = new Thread(racer, "Tortoise");
        
        Thread hare = new Thread(racer, "Hare");
        
        //And were off
        tortoise.start();
        hare.start();
        
    }
    
}

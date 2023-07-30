//Name:Rithvik Padigala
//Period:4A
import java.util.*;

public class GameRunner
{
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter goal points >>> ");
        int limit = input.nextInt();
        
        PigGame game = new PigGame(100);
        
        
        
        game.goal = limit;
        
        game.printInstructions();
        System.out.println();
        game.play();
        
        
    }
}
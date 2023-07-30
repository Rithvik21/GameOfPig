//Name:Rithvik Padigala
//Period:4A
import java.util.*;

public class Player
{
    int score;
    String name;
    
    public Player(String pName)
    {
        name = pName;
        
        
    }
    public void takeTurn(Die d)
    {
        
        Scanner input = new Scanner(System.in);
        
        int rolled= 0;
        int turnScore = 0;
        
        boolean isTurn = true;
        System.out.println(name + ", your curent score is " + score);
        int firstRoll = d.roll();
        rolled = firstRoll;
        turnScore += firstRoll;
        System.out.println("You rolled a " + firstRoll );
        while (isTurn)
        {
            
            System.out.print("Turn total is "+ turnScore +", roll or hold >>> ");
            String holdOrRole = input.next();
            
            
            if (holdOrRole.equals("hold"))
            {
          
                score += turnScore;
                turnScore = 0;
                
                isTurn = false;
            }
            else if (holdOrRole.equals("roll"))
            {
                int rolls = d.roll();
                rolled = rolls;
                turnScore += rolls;
                System.out.println("You rolled a " + rolls);
                
                
            }
            
            if(rolled == 1)
            {
                System.out.println("You rolled a PIG! Bummer");
                isTurn = false;
                turnScore = 0;
            }
        }
    }
}
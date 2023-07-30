//Name:Rithvik Padigala
//Period:4A
import java.util.*;

public class PigGame
{
    Player player1; 
    Player player2; 
    Die die;
    int goal;
    
    public PigGame(int goalPoints)
    {
        Scanner input = new Scanner(System.in);
        
        goal = goalPoints;
        
        System.out.print("Player 1, enter yur name >>> ");
        String name = input.next();
        player1 = new Player(name);
        
        
        System.out.print("Player 2, enter yur name >>> ");
        String name2 = input.next();
        
        player2 = new Player(name2);
        
        System.out.print("Number of faces on the die >>> ");
        int diceFaces = input.nextInt();
        
        die = new Die(diceFaces);
    }
   
   public void play()
   {
      int condition = 0;
      boolean isP1Turn = true; 
      
      while (condition == 0)
      {
          if(isP1Turn){
              player1.takeTurn(die);
              isP1Turn = false;
            }else{
                player2.takeTurn(die);
                isP1Turn = true;
            }
          if (goal == player1.score)
          {
              System.out.print(player1.name + " WON!!!");
              condition = 1;
          }
          else if (goal <= player1.score)
          {
              System.out.print(player1.name + " Lost");
              condition=1;
          }
          if (goal == player2.score)
          {
              System.out.print(player2.name + " WON!!!");
              condition = 1;
          }
          else if (goal <= player2.score)
          {
              System.out.print(player2.name + " Lost");
              condition = 1;
          }
          
      }
        
        
      
    }
    
    
  public void printInstructions()
  {
      System.out.println("In Game of Pig, two players roll a die until one player reaches 50 points\nEach turn, one player keeps rolling until they either \" hold \" or roll a 1.\nIf a player rolls a 1, they lose all the points they've accumulated.\nIf a player \" holds \", all the points they've accumulated that turn are added to their score");
      
  }
}
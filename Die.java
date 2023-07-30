//Name:Rithvik Padigala
//Period:4A
import java.util.*;

public class Die
{
    int numFaces;
    
    public Die()
    {
        numFaces = 6;
    }
    public Die(int faces)
    {
        numFaces = faces;
    }
    public int roll()
    {
        Random rand = new Random();
        
        return rand.nextInt(numFaces-1)+1;
        
        
    }
}
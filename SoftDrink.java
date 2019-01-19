/**
 * Class SoftDrink stores different kinds of softdrinks based on their names, colors and volumes.
 * @author Tumelo Lephadi
 * @version 18/09/2015
 */
 
class SoftDrink implements Comparable<SoftDrink>
{
   private String color, name, volume ;
   private boolean ascend ;
   
   /**
    * Set the drink's color, name and volume.
    */
    
   public SoftDrink ( String coke, String black, String dense )
   {
      color = black ;
      name = coke ;
      volume = dense ;
   }
   
   /**
    * Set the drink's color, name and volume for a copy of SoftDrink.
    */
    
   public SoftDrink ( SoftDrink aSoftDrink ) 
   {
      this( aSoftDrink.getName (), aSoftDrink.getColor (), aSoftDrink.getVolume () ) ;
   }
   
   /**
    * Obtain the drink's color.
    */
    
   public String getColor ()
   {
      return color ; 
   }
   
   /**
    * Obtain the drink's name.
    */
    
   public String getName ()
   {
      return name ; 
   }
   
   /**
    * Obtain the drink's volume.
    */ 

   public String getVolume ()
   {
      return volume ; 
   }
   
   /**
    * Obtain String version of softdrink description rather than the pointer.
    */
    
   public String toString ()
   {
      return "" + name + " " + color + " " + volume ;
   }
   
   /**
    * Override compareTo() method in Comparable interface. To sort the drinks, first by name, color and volume.
    */
    
   public int compareTo ( SoftDrink aSoftDrink )
   {
      SoftDrink other = new SoftDrink ( aSoftDrink ) ;
      
      int names = this.getName ().compareTo ( other.getName () ) ;
      int colors = this.getColor ().compareTo ( other.getColor () ) ;
      
      int volumes ;
      
      if ( this.getVolume ().equals ( other.getVolume () ) )
      {
         volumes = 0 ;
      }
      else if ( Integer.parseInt ( this.getVolume () ) > Integer.parseInt ( other.getVolume () ) )
      {
         volumes = 1 ;
      }
      else
      {
         volumes = -1 ;
      } 
      
      return ( names != 0 ? names : colors != 0 ? colors : volumes != 0 ? volumes : volumes ) ;
   }
   
}
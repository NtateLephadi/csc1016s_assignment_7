/**
 * Public class Question1 returns all the drinks the user enters in ascending order.]
 * @author Tumelo Lephadi
 * @version 18/09/2015
 */
import java.util.* ;


public class Question1 
{
   private Question1()
   {}
   
   /**
    * Obtain the option the user chooses.
    */
   private static int getOption ( Scanner scanner )
   {
      System.out.println ( "Enter option: (1) add soft drink (2) quit:" ) ;
      return scanner.nextInt () ;
   }
   
   /**
    * Set the name, color, and volume entered by the user to a softdrink.
    */

   private static SoftDrink makeSoftDrink ( Scanner scanner )
   {
      System.out.println ( "Enter name, colour and volume in ml separated by space" ) ;
      return new SoftDrink ( scanner.next (), scanner.next (), scanner.next () ) ;
   }
      
   public static void main ( String [] args )
   {
      ArrayList<SoftDrink> drinks = new ArrayList<SoftDrink>() ;
      Scanner scanner = new Scanner ( System.in ) ;
      int option = getOption ( scanner ) ; 
   
      /**
       * Keep asking the user to enter their opton.
       */
     
      do
      {         
         switch ( option )
         {
            case 1 :
               {
                  /**
                   * Make a list of the softdrinks entered by the user.
                   */
               
                  SoftDrink softdrink = Question1.makeSoftDrink ( scanner ) ;
                  drinks.add ( softdrink ) ;
                  option = getOption ( scanner ) ;
                  break ;
               }   
            case 2 :
               {
                  /**
                   * Reurn sorted list of softdrinks and end the program. 
                   */
               
                  Collections.sort ( drinks ) ;
                  
                  for ( SoftDrink type : drinks )
                  {   
                     System.out.println ( type ) ;
                  }
                  System.exit ( 0 ) ;
               }   
         }
      }while ( true ) ;    
   } 
}
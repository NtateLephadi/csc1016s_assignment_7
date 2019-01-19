/**
 * Class CSC1016S implements Student interface and returns Students' final mark.
 * @author Tumelo Lephadi
 * @version 18/09/2015 
 */

public class CSC1016S implements Student
{
   private String name, category ;
   private int mark ;
   private int pracs, practests, tests, exam ;
   
   /**
    * Set name.
    */
   public void setName ( String name )
   {
      this.name = name ;
   } 
   
   /**
    * Return name.
    */
   public String getName ()
   {
      return name ;
   }
   
   /**
    * Set mark for each category.
    */
   public void setMark ( String category, int mark )
   {
      
      if ( category.equals("pracs") )
      {
         pracs = mark ;
      }
      if ( category.equals("practests") )
      {
         practests = mark ;
      } 
      if ( category.equals("tests") )
      {
         tests = mark ;
      } 
      if ( category.equals("exam") )
      {
         exam = mark ;
      } 
   
   }
   
   /**
    * Get final mark.
    */
   public float getFinal ()
   {
      return (float) ( (0.15 * pracs)+ (0.10 * practests) + (0.15 * tests) + (0.60 * exam) ) ;
   }
   
}

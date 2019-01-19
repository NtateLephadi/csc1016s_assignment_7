import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
  * Test class CSC1016STest tests CSC1016 methods
  * @author Tumelo Lephadi
  * @version 18/09/2015
  */
  
   
public class CSC1016STest {

   private CSC1016S csc1016s ;
   
   /**
    * Create new CSC1016S object before each test. 
    */
   @Before
   public void setUP()
   {
      csc1016s = new CSC1016S () ;
   }
   
   /**
    * Test if getName() returns same name set by setName().
    */
   @Test
   public void testGetName ()
   {
      csc1016s.setName ( "John" ) ;
      assertEquals ( csc1016s.getName(), "John" ) ;
   }
   
   /**
    * Test if getFinal() returns 0 if all marks are equal to 0.
    */
   @Test
   public void testGetFinal ()
   {
      csc1016s.setMark ( "pracs", 0 ) ;
      csc1016s.setMark ( "practests", 0 ) ;
      csc1016s.setMark ( "tests", 0 ) ;
      csc1016s.setMark ( "exam", 0 ) ;
      assertTrue ( csc1016s.getFinal() == 0 ) ;
   }
   
   /**
    * Test if getFinal() returns 100 if all marks are equal to 100.
    */
   @Test
   public void testGetFinal100 ()
   {
      csc1016s.setMark ( "pracs", 100 ) ;
      csc1016s.setMark ( "practests", 100 ) ;
      csc1016s.setMark ( "tests", 100 ) ;
      csc1016s.setMark ( "exam", 100 ) ; 
      assertTrue ( csc1016s.getFinal() == 100.0 ) ;
   }
   
   /**
    * Test if getFinal() returns same mark for all marks between 0 and 100.
    */
   @Test
   public void testGetFinal50 ()
   {
      for ( int i = 1; i < 100; i ++ )
      {
         csc1016s.setMark ( "pracs", i ) ;
         csc1016s.setMark ( "practests", i ) ;
         csc1016s.setMark ( "tests", i ) ;
         csc1016s.setMark ( "exam", i ) ;
      
         float test = (float) ( (0.15 * i)+ (0.10 * i) + (0.15 * i) + (0.60 * i) ) ;
      
         assertTrue ( csc1016s.getFinal() == test ) ;
      
      }
   }
}
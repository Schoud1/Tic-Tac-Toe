


public class TicTacToe
{
    // Write the checkBoard method here



   public static boolean checkBoard( char[][] board ){

      if( diagonal1( board ) || diagonal2( board ) || horizontal( board ) || vertical( board ) ){ // if the condition for 
                                                                                                  // the direction is met, 
                                                                                                  // then it will return true
         return true;   

      }

      return false;

    }
    
    public static boolean diagonal1( char[][] board ){ 

      int x = 1;
        
      while( x < board.length ){ // condition in the while statement

         if( board[ x ][ x ] != board[ x - 1 ][ x - 1] ){ // if the conditions are true then it will return false

            return false;

         }
   
      x++;

      } 
       
      return true;
   }
  
  public static boolean diagonal2( char[][] board ){ 

      int x = 1;

      int y = board.length - 2;

      while( x < board.length ){ // condition in the while statement

         while( y > 0 ){

           if( board[ x ][ y ] != board[ x - 1 ][ y + 1] ){ // if the conditions are true then it will return false

               return false;

            }  

            y--;

         }

         x++;

      }

      return true;

   }


   public static boolean horizontal( char[][] board ){

      int numOfWins = 0;

      boolean isWinner = false;

       
      int x = 1; 

      for( int y = 0; y < board.length; y++){

         while( x < board.length ){  // condition in the while statement

            if( board[ x ][ y ] == board[ x - 1 ][ y ] ){  // if the conditions are true, then it will proceed

            }

            else{

               break;

            }

            isWinner = true;

            numOfWins++;

            x++;

         }
      
      }
      if( numOfWins == 1 ){ // if the condition is true then it will return true

         return true;

         }

      return isWinner;

   }

  public static boolean vertical( char[][] board ){

      boolean isWinner = false;

      int numOfWins = 0;

      int y = 1; 

      for( int x = 0; x < board.length; x++){ // conditions in the for statement

         while( y < board.length ){  // condition in the while statement

            if( board[ x ][ y ] == board[ x ][ y - 1 ] ){ // if the conditions are true then it will proceed

            }

            else{

               break;

            }

            isWinner = true;

            numOfWins++;

            y++;

         }

      }

      if( numOfWins == 1 ){ // if the condition is true then it will return true

         return true;

         }

      return isWinner;

   }
     
}
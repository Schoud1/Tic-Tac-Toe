
public class TestTTT
{
   public static void printTTT( char[][] a )
   {
      for ( int i = 0; i < a.length; i++ )
      {
	 System.out.print( "            " );
         for ( int j = 0; j < a.length; j++ )
	     System.out.print( a[i][j] + " " );
	 System.out.println();
      }
   }

   public static void main( String[] args )
   {
      boolean x;

      char[][] a = { 
		     {'O', 'X', 'O'},
		     {'X', 'X', 'O'},
		     {'O', 'X', 'X'}
		   };

      System.out.println( "Test 1: column win");
      x = TicTacToe.checkBoard(a);
      printTTT(a);
      System.out.print("Winning Tic Tac Toe board: " + x );
      System.out.println( x ? "  --- correct" : "  **** ERROR !");
      System.out.println();


      char[][] b = { 
		     {'O', 'X', 'X', 'O'},
		     {'X', 'X', 'X', 'O'},
	 	     {'O', 'O', 'O', 'O'},
		     {'O', 'X', 'X', 'X'}
		   };

      System.out.println( "Test 2: row win");
      x = TicTacToe.checkBoard(b);
      printTTT(b);
      System.out.print("Winning Tic Tac Toe board: " + x );
      System.out.println( x ? "  --- correct" : "  **** ERROR !");
      System.out.println();


      char[][] c = { 
		     {'O', 'X', 'O'},
		     {'X', 'O', 'X'},
		     {'O', 'X', 'X'}
		   };

      System.out.println( "Test 3: diagonal 1 win");
      x = TicTacToe.checkBoard(c);
      printTTT(c);
      System.out.print("Winning Tic Tac Toe board: " + x );
      System.out.println( x ? "  --- correct" : "  **** ERROR !");
      System.out.println();


      char[][] d = { 
	 	     {'X', 'O', 'O', 'O'},
		     {'O', 'X', 'X', 'O'},
		     {'X', 'O', 'X', 'O'},
		     {'O', 'X', 'X', 'X'}
		   };

      System.out.println( "Test 4: diagonal 2 win");
      x = TicTacToe.checkBoard(d);
      printTTT(d);
      System.out.print("Winning Tic Tac Toe board: " + x );
      System.out.println( x ? "  --- correct" : "  **** ERROR !");
      System.out.println();


      char[][] e = { 
	 	     {'X', 'O', 'O', 'O'},
		     {'X', 'O', 'X', 'O'},
		     {'O', 'X', 'X', 'O'},
		     {'O', 'X', 'X', 'X'}
		   };

      System.out.println( "Test 5: no win");
      x = TicTacToe.checkBoard(e);
      printTTT(e);
      System.out.print("Winning Tic Tac Toe board: " + x );
      System.out.println( !x ? "  --- correct" : "  **** ERROR !");
      System.out.println();


      char[][] f = { 
		     {'X', 'O', 'X', 'O'},
	 	     {'O', 'O', 'O', 'O'},
		     {'X', 'X', 'X', 'X'},
		     {'O', 'X', 'X', 'O'}
		   };

      System.out.println( "Test 6: multiple row wins");
      x = TicTacToe.checkBoard(f);
      printTTT(f);
      System.out.print("Winning Tic Tac Toe board: " + x );
      System.out.println( !x ? "  --- correct" : "  **** ERROR !");
      System.out.println();

   }

}

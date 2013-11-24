package chess;


import general.*;
import chess.piece.*;
import java.util.*;

public class ChessGame extends Game {
	
	public ChessGame(String name){
		super(name);
		addToColourList(new Colour("White"));
		addToColourList(new Colour("Black"));
	}
	
	public void setupBoard(){
		
		//Set up blank chess board
		setBoard(new Board(this, 8, 8));
		
		//populate board with chess pieces
		//will need to have set the players (white and black) at this point to properly construct piece objects
		initializeChessBoard();
	}
	
	  public int maximumNumberOfPlayers()
	  {
	    return 2;
	  }
	
	private void initializeChessBoard(){
		Board board = getBoard();
		
		board.addPieceType(new Pawn(board));
		board.addPieceType(new Rook(board));
		board.addPieceType(new Knight(board));
		board.addPieceType(new Bishop(board));
		board.addPieceType(new Queen(board));
		board.addPieceType(new King(board));
		
		board.init(getColourList());
		

	}
		
}

/*
 *    0 1 2 3 4 5 6 7
 *    
 * 7  R H B Q K B H R
 * 6  P P P P P P P P
 * 5  * * * * * * * *
 * 4  * * * * * * * *
 * 3  * * * * * * * *
 * 2  * * * * * * * *
 * 1  P P P P P P P P
 * 0  R H B Q K B H R
 * 
 */


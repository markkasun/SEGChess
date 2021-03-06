package chess.piece;

import java.util.List;

import general.*;

public class Queen extends PieceType {

	private static final long serialVersionUID = -5825695185626555L;

	//CONSTRUCTOR
	public Queen(Board board){
		super(board);
	}

	// INSTANCE METHODS
	public void initialize(List<Colour> colourList){
		
		board.pieceInit(0, 3, this, colourList.get(0));
		board.pieceInit(7, 3, this, colourList.get(1));

	}
	
	public String toString(){
		return "Q";
		}
	
	
}

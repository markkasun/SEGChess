package general;
import java.io.Serializable;
import java.util.*;
/**
 * 
 * This class links a player to all of his or her pieces, and assigns those pieces a colour.
 * 
 */
public class Colour implements Serializable  {
	
	private static final long serialVersionUID = 2492089274183738188L;


	// ASSOCIATIONS
	
	private Player              player;
	
	private List<SpecificPiece> pieceList;
	
	// INSTANCE VARIABLES
	
	private String              colourName;
	
	// CONSTRUCTORS
	public Colour(String colourName){
	
		this.colourName = colourName;
		pieceList = new ArrayList<SpecificPiece>();
	}
	
	// GETTERS
	public String getColourName(){ return colourName; }
	// SETTERS
	public void setPiece(SpecificPiece piece){
		pieceList.add(piece);
	}
	
	public void setPlayer(Player player){
		this.player = player;
	}
	// INSTANCE METHODS

}

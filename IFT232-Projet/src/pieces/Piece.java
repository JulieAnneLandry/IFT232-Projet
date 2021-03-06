package pieces;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.Icon;

import chess.Case;

public abstract class Piece implements Serializable{

	
    private static final long serialVersionUID = 1L;
    protected Icon img;
	protected boolean team; // Futur objet representant la couleur de la piece
	protected Case myCase;
	protected boolean hasMoved;
	protected ArrayList<Point> options = new ArrayList<Point>();

	public Icon getImage() {
		return img;
	}

	public void setCase(Case c) {
		myCase = c;
	}

	public boolean df(Case dest) {
		if (options.contains(dest.getPoint())) {
			return true;
		} else {
			return false;
		}
	}
	public void setOptions()
	{
		// Par défaut, une piece peut aller n'importe ou
		for (int i=0; i<8;++i)
	        for(int j=0;j<8;++j)  
	            options.add(new Point(i,j));
	}
	
	public ArrayList<Point> getOptions(){
	    return options;
	}
	
	public Case getCase(){
	    return myCase;
	}
	
	public char getTeam(){
	    if(team)return 'n';
	    else{return 'b';}
	}
	
	public String toString(){
	    String x=""+ myCase.getPoint().x;
	    String y=""+ myCase.getPoint().y;
	    String equipe= ""+ getTeam();
	    String key=""+pieceKey();
	    return equipe+key+x+y+"\n";
	}
	
	public abstract char pieceKey();
}

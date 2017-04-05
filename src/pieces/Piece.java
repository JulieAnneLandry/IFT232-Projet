package pieces;

import java.awt.Point;
import java.util.ArrayList;

import javax.swing.Icon;

import chess.Case;

public abstract class Piece {

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

	public abstract void setOptions();
}

package pieces;

import javax.swing.Icon;

import chess.Case;

public abstract class Piece {

	protected Icon img;
	protected boolean team; // Futur objet representant la couleur de la piece
	protected Case myCase;
	protected boolean hasMoved;

	public Icon getImage() {
		return img;
	}

	public abstract void move();
}

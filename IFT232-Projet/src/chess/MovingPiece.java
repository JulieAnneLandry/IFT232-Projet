package chess;

import pieces.Piece;

// Sera encore sujet à modifications

public class MovingPiece {

	private static Piece MOVING;
	private static Case ORIGIN;

	public static void take(Piece p, Case c) {
		if (p != null) {
			MOVING = p;
			ORIGIN = c;
		}
	}

	public static void place(Case c) {
		ORIGIN.removePiece();
		c.setPiece(MOVING);
		MOVING = null;
		
	}

	public static boolean isEmpty() {
		if (MOVING == null) {
			return true;
		} else {
			return false;
		}
	}

}

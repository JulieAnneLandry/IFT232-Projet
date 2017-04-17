package chess;

import java.awt.Color;
import java.awt.Point;

import javax.swing.border.LineBorder;

import pieces.Piece;

// Sera encore sujet � modifications

public class MovingPiece {

	private static Piece MOVING;
	private static Case ORIGIN;
	private static boolean DEBUG = false; // True = deplacements libres, False =
											// deplacements specifiques
	private static LineBorder optionsBorder = new LineBorder(Color.BLUE, 6);
	private static LineBorder movingBorder = new LineBorder(Color.RED, 7);

	public static void take(Case c) {

		Piece p = c.getPiece();

		if (p != null) {
			MOVING = p;
			ORIGIN = c;
			c.setBorder(movingBorder);
			if (!DEBUG) {
				highlight(optionsBorder);
			}
		}
	}

	public static void highlight(LineBorder border) {
		for (Point point : MOVING.getOptions()) {
			Case laCase = Board.getCase(point.y, point.x);
			laCase.setBorder(border);
		}
	}

	public static void place(Case c) {

		ORIGIN.setBorder(null);
		highlight(null);

		if ((MOVING.isValidMove(c) && DEBUG == false) || DEBUG == true) {
			ORIGIN.removePiece();
			MOVING.firstMove();
			c.setPiece(MOVING);
		} else {
			P.p("Ceci n'est pas un deplacement valide");
		}

		MOVING = null;

	}

	public static boolean isEmpty() {
		if (MOVING == null) {
			return true;
		} else {
			return false;
		}
	}

	public static void changeDebug() {
		DEBUG = !DEBUG;
	}

}

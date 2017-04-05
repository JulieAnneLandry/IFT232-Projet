package pieces;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Pawn extends Piece {

	private static final Icon PAWN_GOLD = new ImageIcon("res/pionDore.png");
	private static final Icon PAWN_WHITE = new ImageIcon("res/pionBlanc.png");

	public Pawn(boolean team) {
		if (team) {
			img = PAWN_GOLD;
		} else {
			img = PAWN_WHITE;
		}
	}

	@Override
	public void setOptions() {

	}

}

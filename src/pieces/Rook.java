package pieces;

import java.awt.Point;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Rook extends Piece {

	private static final Icon ROOK_GOLD = new ImageIcon("res/tourDore.png");
	private static final Icon ROOK_WHITE = new ImageIcon("res/tourBlanc.png");

	public Rook(boolean team) {
		if (team) {
			img = ROOK_GOLD;
		} else {
			img = ROOK_WHITE;
		}
	}

	@Override
	public void setOptions() {
		/*
		 * Point coor = myCase.getPoint();
		 * Point opt = coor; 
		 * for (int i = 0; i < 8; i++) { 
		 * opt.move(i, 0); 
		 * options.add(opt);
		 *  }
		 */
	}
}

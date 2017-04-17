package pieces;

import java.awt.Point;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import chess.P;

public class Rook extends Piece {

	private static final long serialVersionUID = 1L;
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
		
		options = new ArrayList<Point>();
		Point coor = myCase.getPoint();
		Point ptC;
		Point ptL;

		for (int i = 0; i < 8; i++) {
			
			ptC = new Point(coor.x, i);
			ptL = new Point(i, coor.y);
		
			if (!coor.equals(ptC))
				options.add(ptC);
			
			if (!coor.equals(ptL))
				options.add(ptL);
		}
	}

	@Override
	public char pieceKey() {
		return 'T';
	}
}

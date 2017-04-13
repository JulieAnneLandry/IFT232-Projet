package pieces;

import java.awt.Point;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Pawn extends Piece {

    private static final long serialVersionUID = 1L;
    private static final Icon PAWN_GOLD = new ImageIcon("res/pionDore.png");
	private static final Icon PAWN_WHITE = new ImageIcon("res/pionBlanc.png");

	public Pawn(boolean team) {
		if (team) {
			img = PAWN_GOLD;
		} else {
			img = PAWN_WHITE;
		}
		this.team = team;
	}

	@Override
	public void setOptions() {
	    options = new ArrayList<Point>();
        Point coor = myCase.getPoint();
        Point opt;
        Point opt2;
        
        if (team){
            opt = new Point(coor.x, coor.y + 1);
            if (!hasMoved){
                opt2 = new Point(coor.x, coor.y + 2);
                options.add(opt2);
            }
        }
        else {
            opt = new Point(coor.x, coor.y - 1);
            if (!hasMoved){
                opt2 = new Point(coor.x, coor.y - 2);
                options.add(opt2);
            }
        }
        
        if (!outOfBounds(opt)){
            options.add(opt);
        }
	}

   

    @Override
    public char pieceKey()
    {
        return 'P';
    }

}

package pieces;

import java.awt.Point;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class King extends Piece {

    private static Point[] pointsDep = { new Point(0, 1), new Point(1, 1), new Point(1, 0), new Point(1, -1),
            new Point(0, -1), new Point(-1, -1), new Point(-1, 0), new Point(-1, 1) };
    private static final long serialVersionUID = 1L;
    private static final Icon KING_GOLD = new ImageIcon("res/roiDore.png");
	private static final Icon KING_WHITE = new ImageIcon("res/roiBlanc.png");

	public King(boolean team) {
		if (team) {
			img = KING_GOLD;
		} else {
			img = KING_WHITE;
		}
	}

	@Override
	public void setOptions() {
	    
	    options = new ArrayList<Point>();
        Point coor = myCase.getPoint();
        Point opt;
        
        for (Point p : pointsDep)
        {
            opt = new Point(coor.x + p.x, coor.y + p.y);
            
            if (!outOfBounds(opt))
            {
                options.add(opt);
            }
        }

	}

    @Override
    public char pieceKey()
    {
        return 'R';
    }
}

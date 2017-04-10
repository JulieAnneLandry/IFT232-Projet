package pieces;

import java.awt.Point;
import java.util.ArrayList;

//import java.awt.Point;

import javax.swing.Icon;
import javax.swing.ImageIcon;

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
		/*
		 * Point coor = myCase.getPoint();
		 * Point opt = coor; 
		 * for (int i = 0; i < 8; i++) { 
		 * opt.move(i, 0); 
		 * options.add(opt);
		 *  }
		 */
		
		ArrayList<Point> optionsTemp = new ArrayList<Point>();
		
	    for (int i=0; i<8;++i)
	        for(int j=0;j<8;++j)  
	            options.add(new Point(i,j));
	    for(Point p :options){
	        if(myCase.getPoint().x != p.x && myCase.getPoint().y != p.y )
	        	continue;
	        else
	        {
	        	optionsTemp.add(p);
	        }
	    }
	    
	    options = optionsTemp;
	}


    @Override
    public char pieceKey()
    {
        return 'T';
    }
}

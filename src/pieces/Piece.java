package pieces;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.Icon;

import chess.Case;
import chess.P;

public abstract class Piece implements Serializable{


    private static final long serialVersionUID = 1L;
    protected Icon img;
    protected boolean team; // Futur objet representant la couleur de la piece
    protected Case myCase;
    protected boolean hasMoved = false;
    protected ArrayList<Point> options = new ArrayList<Point>();

    public Icon getImage() {
        return img;
    }

    public void setCase(Case c) {
        myCase = c;
        setOptions();
    }
    
    public void firstMove(){
        this.hasMoved = true;
    }
    
    public boolean outOfBounds(Point p) {
        if (p.x > 7 || p.x < 0 || p.y > 7 || p.y < 0)
            return true;
        else
            return false;
    }

    public boolean isValidMove(Case dest) {
        if (options.contains(dest.getPoint())) {
            return true;
        } else {
            return false;
        }
    }

    public abstract void setOptions();
    public Case getCase(){
        return myCase;
    }
    public char getTeam(){
        if(team)return 'n';
        else{return 'b';}
    }
    public String toString(){
        String x=""+ myCase.getPoint().x;
        String y=""+ myCase.getPoint().y;
        String equipe= ""+ getTeam();
        String key=""+pieceKey();
        return equipe+key+x+y+"\n";
    }
    public abstract char pieceKey();
}

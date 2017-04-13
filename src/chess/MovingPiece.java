package chess;

import pieces.Piece;

// Sera encore sujet � modifications

public class MovingPiece {

    private static Piece MOVING;
    private static Case ORIGIN;
    private static boolean DEBUG = false; // True = déplacements libres, False = deplacements specifiques

    public static void take(Piece p, Case c) {
        if (p != null) {
            MOVING = p;
            ORIGIN = c;
        }
    }

    public static void place(Case c) {
        if (MOVING.isValidMove(c) && DEBUG == false){
            ORIGIN.removePiece();
            MOVING.firstMove();
            c.setPiece(MOVING);
        }
        else if (DEBUG == true){
            ORIGIN.removePiece();
            MOVING.firstMove();
            c.setPiece(MOVING);
        }
        else {
            P.p("Ceci n'est pas un déplacement valide");
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

}

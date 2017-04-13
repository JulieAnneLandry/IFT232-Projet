package chess;



import java.util.ArrayList;

import javax.swing.JFrame;

import pieces.Piece;


public class PlayMain {

	public static void main(String[] args) {

		Load l = new LoadFromFile();
		ArrayList<Piece> pieces = l.load();
		
		Load l2 = new LoadFromPosition();
		ArrayList<Piece> pieces2 = l2.load();
		
		/*
		 * Enlever le paramètre pour loader le board de départ
		 * (pieces est une liste de pièces provenant du fichier saveFile.txt)
		 */
		Board grille = new Board(pieces);
		grille.afficherTout();
		/*Save s = new SaveToFile();
		s.save(grille);*/
		
		
		JFrame frame = new JFrame();
		frame.setSize(800, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(grille);
		frame.setVisible(true);
		
	}

}

package jeuechec;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;

import jeuechec.BoutonJeu;

public class GrilleEchec extends JPanel {
	static int nbLC = 8; // grandeur du ChessBoard
	static int size = 75; // size d'une case
	
	public GrilleEchec(){
		super(new GridLayout(nbLC, nbLC));
		this.setPreferredSize(new Dimension(nbLC * size, nbLC * size));
		
		for (int i = 0; i < nbLC * nbLC; i++) {
			this.add(new BoutonJeu(i));
		}
	}
}

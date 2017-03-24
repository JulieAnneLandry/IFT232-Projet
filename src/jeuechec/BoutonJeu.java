package jeuechec;

import java.awt.Color;

import javax.swing.JButton;

public class BoutonJeu extends JButton {
	static int nbLC = 8;
	
	public BoutonJeu(int i){
		super("");
		this.setOpaque(true);
		this.setBorderPainted(false);
		if ((i / nbLC + i % nbLC) % 2 == 1){
			this.setBackground(Color.black);
		}
		else {
			this.setBackground(Color.white);
		}
	}
}

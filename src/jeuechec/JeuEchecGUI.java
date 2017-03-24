package jeuechec;

import jeuechec.GrilleEchec;
import javax.swing.JFrame;

public class JeuEchecGUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new GrilleEchec());
		f.pack();
		f.setVisible(true);
	}

}

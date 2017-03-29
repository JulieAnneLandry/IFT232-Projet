package jeuechec;

import javax.swing.*;

public class Piece extends JLabel
{

	private static final long serialVersionUID = 1L;

	// Constructeur de piece recevant le chemin d'une image en parametre
    public Piece(String image) {
        super(new ImageIcon(image));
        setName(image);
    }
}

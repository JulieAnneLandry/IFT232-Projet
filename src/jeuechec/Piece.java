package jeuechec;

import javax.swing.*;

public class Piece extends JLabel
{

    // Constructeur de piece recevant le chemin d'une image en parametre
    public Piece(String image) {
        super(new ImageIcon(image));
        setName(image);
    }
}

package jeuechec;

import java.awt.*;
import javax.swing.*;

public class Grille extends JPanel
{
	private static final long serialVersionUID = 1L;
	protected Carre[][] carres;

	public Grille(){
		setSize(800,700);
		setLayout(new GridLayout(8,8));
		carres = new Carre[8][8];
		creerCarres();
	}

	public Grille(int h, int w){
		setSize(h,w);
		setLayout(new GridLayout(8,8));
		carres = new Carre[8][8];
		creerCarres();
	}

	private void creerCarres(){
		for (int i = 0; i < 8; i++){
			for (int j = 0; j < 8; j++){
				Carre p = new Carre(i, j);
				p.setBackground(choisirCouleur(i,j));
				add(p);
				carres[i][j] = p;
			}
		}
	}

	// Choisir la couleur du carre en fonction de sa position sur la grille
	private Color choisirCouleur(int x, int y){
		if((x+y)%2 == 0){
			return Color.WHITE;
		}
		else
			return Color.BLACK;
	}

	public void ajouterPiece(Piece p, int x, int y){
		carres[x][y].add(p);
	}
	
	public void afficherTout(){
		paintAll(getGraphics());
	}

	public static void main(String[] args){
		Grille grille = new Grille();

		//Ajouter les pions de chaque c�t�
		for (int i = 0;i < 8; i++){
			grille.ajouterPiece(new Piece("res/pionDore.png"), 1, i);
			grille.ajouterPiece(new Piece("res/pionBlanc.png"), 6, i);
		}
		
		//Ajouter les tours
		grille.ajouterPiece(new Piece("res/tourDore.png"), 0, 0);
		grille.ajouterPiece(new Piece("res/tourDore.png"), 0, 7);
		grille.ajouterPiece(new Piece("res/tourBlanc.png"), 7, 0);
		grille.ajouterPiece(new Piece("res/tourBlanc.png"), 7, 7);
		
		//Ajouter les cavaliers
		grille.ajouterPiece(new Piece("res/cavalierDore.png"), 0, 1);
		grille.ajouterPiece(new Piece("res/cavalierDore.png"), 0, 6);
		grille.ajouterPiece(new Piece("res/cavalierBlanc.png"), 7, 1);
		grille.ajouterPiece(new Piece("res/cavalierBlanc.png"), 7, 6);
		
		//Ajouter les fous
		grille.ajouterPiece(new Piece("res/fouDore.png"), 0, 2);
		grille.ajouterPiece(new Piece("res/fouDore.png"), 0, 5);
		grille.ajouterPiece(new Piece("res/fouBlanc.png"), 7, 2);
		grille.ajouterPiece(new Piece("res/fouBlanc.png"), 7, 5);
		
		//Ajouter les reines
		grille.ajouterPiece(new Piece("res/reineDore.png"), 0, 4);
		grille.ajouterPiece(new Piece("res/reineBlanc.png"), 7, 4);
		
		//Ajouter les rois
		grille.ajouterPiece(new Piece("res/roiDore.png"), 0, 3);
		grille.ajouterPiece(new Piece("res/roiBlanc.png"), 7, 3);

		// Cr�er JFrame et afficher tout
		grille.afficherTout();
		JFrame frame = new JFrame();
		frame.setSize(800,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(grille);
		frame.setVisible(true);
	}

}

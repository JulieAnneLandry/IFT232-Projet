package frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import chess.MovingPiece;

public class ChessMenu extends JMenuBar implements ActionListener {

	private JMenu partie;
	private JMenu point;
	private JMenuItem nouvellePartie;
	private JMenuItem quitter;
	private JMenuItem debug;
	private JMenuItem instructions;
	private JMenuItem informations;

	// JMenu triche = new JMenu("Triche");
	// JMenuItem devoiler = new JMenuItem("Tout dévoiler");
	public ChessMenu() {

		partie = new JMenu("Partie");
		point = new JMenu("?");

		nouvellePartie = new JMenuItem("Nouvelle partie");
		quitter = new JMenuItem("Quitter");
		debug = new JMenuItem("Debug");
		instructions = new JMenuItem("Instructions");
		informations = new JMenuItem("À propos");

		partie.add(nouvellePartie);
		partie.addSeparator();
		partie.addSeparator();
		partie.add(quitter);

		point.add(debug);
		point.add(instructions);
		point.addSeparator();
		point.add(informations);

		this.add(partie);

		// triche.add(devoiler);
		// this.add(triche);

		this.add(point);

		nouvellePartie.addActionListener(this);
		quitter.addActionListener(this);
		debug.addActionListener(this);
		instructions.addActionListener(this);
		informations.addActionListener(this);

		// devoiler.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {

		JFrame fenetre;
		JTextArea instructionsText;
		JTextArea informationsText;

		Object source = e.getSource();

		if (source == nouvellePartie) {
			// grille.nouvellePartie();
		}
		if (source == quitter) {
			System.exit(0);
		}

		if (source == debug) {
			MovingPiece.changeDebug();
		}

		if (source == instructions) {
			fenetre = new JFrame();
			instructionsText = new JTextArea();
			instructionsText.setText("Bienvenue dans le jeu du Démineur!"
					+ "\n\nVotre objectif est de nettoyer l'ensemble de"
					+ " la grille sans faire exploser les bombes!\n" + "Dans cette grille de 16 cases par 16, il y a 40"
					+ " bombes. Tâchez de les évitez!\n\n" + "Comment jouer:\n"
					+ "Un clic gauche sur une case dévoile cette <" + " dernière.\n"
					+ "Si une bombe s'y trouve, cela fait exploser le <" + " champ et vous fait perdre la partie.\n"
					+ "Si aucune bombe ne se trouve près de cette case,"
					+ " les cases attenantes à celle-ci se\ndévoilent"
					+ " jusqu'aux cases situées près d'au moins une" + " bombe.\n"
					+ "Si cette case se trouve près d'au moins une bombe,"
					+ " elle affichera un nombre\ncorrespondant au nombre" + " de bombes attenantes à cette case.\n"
					+ "Un clic droit sur une case place un drapeau sur"
					+ " celle-ci pour signaler la position d'une\nmine" + " et empêche de dévoiler la case.\n"
					+ "Un deuxième clic droit sur une case y place un" + " \"?\" mais ne la bloque pas.\n"
					+ "\nBonne chance!");
			instructionsText.setEditable(false);
			fenetre.add(instructionsText);
			fenetre.setTitle("Instructions");
			fenetre.setSize(500, 325);
			fenetre.setResizable(false);
			fenetre.setLocationRelativeTo(null);
			fenetre.setVisible(true);
		}

		if (source == informations) {
			informationsText = new JTextArea();
			informationsText.setText(
					"À venir:\n\n" + "- Autres niveaux de difficulté\n" + "- Options de triche\n" + "- Autres");
			informationsText.setEditable(false);
			JOptionPane.showMessageDialog(null, informationsText, "À propos", JOptionPane.INFORMATION_MESSAGE);
			//
			//
			// fenetre.add(informationsText);
			// fenetre.setTitle("À propos");
			// fenetre.setSize(125, 125);
			// fenetre.setResizable(false);
			// fenetre.setLocationRelativeTo(null);
			// fenetre.setVisible(true);
		}
		// if (source == devoiler) {
		// if (devoiler.getText().equals("Tout dévoiler")) {
		// grille.afficherTout();
		// devoiler.setText("Recouvrir");
		// grille.updateUI();
		// } else {
		// grille.cacherTout();
		// devoiler.setText("Tout dévoiler");
		// grille.updateUI();
		// }
		// }
	}
}
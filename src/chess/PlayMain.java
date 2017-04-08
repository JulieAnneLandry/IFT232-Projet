package chess;



import javax.swing.JFrame;


public class PlayMain {

	public static void main(String[] args) {

		Board grille = new Board();
		grille.afficherTout();
		Save s=new SavetoFile();
		s.save(grille);

		
		
		
		
		JFrame frame = new JFrame();
		frame.setSize(800, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(grille);
		frame.setVisible(true);
		
	}

}

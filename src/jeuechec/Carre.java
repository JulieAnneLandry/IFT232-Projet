package jeuechec;

import java.awt.event.*;
import javax.swing.*;

public class Carre extends JPanel implements MouseListener
{
    public Carre(){
        super();
        addMouseListener(this);
    }
    
    // Constructeur de carre avec identificateur
    public Carre(String nom){
        super();
        setName(nom);
        addMouseListener(this);
    }
    
    public void mouseClicked(MouseEvent e){
    }

    public void mousePressed(MouseEvent e){
    }

    public void mouseReleased(MouseEvent e){
    }
    
    // Lorsque la souris entre sur la case
    public void mouseEntered(MouseEvent e){
        System.out.println("Case: " + getName()); // Pour tester le systeme de coordonnees, code jetable
    }
    
    public void mouseExited(MouseEvent e){
    }

}

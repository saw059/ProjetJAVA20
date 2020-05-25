package main;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import view.planningEtudiantECE;

public class Depart {

	public static void main(String[] args) throws Exception {

		UIManager.setLookAndFeel( new NimbusLookAndFeel() );

		planningEtudiantECE fen = new planningEtudiantECE();
		fen.setVisible(true);
	}
}

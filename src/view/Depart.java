package view;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;


public class Depart {

	public static void main(String[] args) throws Exception {

		UIManager.setLookAndFeel( new NimbusLookAndFeel() );

		planningEtudiantECE fen = new planningEtudiantECE();
		fen.setVisible(true);
	}

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void pack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

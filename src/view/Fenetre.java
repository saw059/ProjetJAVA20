package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Fenetre extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 668229218845723247L;

//--------------------------CONSTRUCTEUR DE LA CLASSE FENETRE-----------------------------------
	@SuppressWarnings("static-access")
	public Fenetre() throws Exception {

		this.setTitle("Planning �tudiant");
		this.setExtendedState(this.MAXIMIZED_BOTH);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setJMenuBar(createMenuBar());

		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new BorderLayout());

		JPanel contentPane2 = new JPanel();
		contentPane2.setLayout(new GridLayout(7, 6));

		contentPane.add(contentPane2, BorderLayout.CENTER);
		contentPane.add(createDay(), BorderLayout.NORTH);

		JPanel hj = new heureJournee();
		hj.setPreferredSize(new Dimension(70, 0));
		contentPane.add(hj, BorderLayout.WEST);

		for (int i = 0; i < 42; i++) {

			if (i % 2 == 0) {
				contentPane2.add(new JButton(testInfo()));
			} else {
				JButton btnPushMe = new JButton();
				contentPane2.add(btnPushMe);
			}

		}

	}
	// ----------------------------METHODES QUE L'ON VA AJOUTER DANS LA
	// FENETRE------------------------

	private String testInfo() throws Exception {

		String str = null;
                /*
		Properties props = new Properties();
		try (FileInputStream fis = new FileInputStream("ecole.properties")) {
			props.load(fis);
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");
*/
		// 3--------------------------------------------------------
                PreparedStatement st;
                ResultSet rs;
                Connection cnx =null;
		//try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {
			

			// 2----------------------------
			//try (var st = My_Cnx.getConnection().prepareStatement(strSql); var rs = st.executeQuery(strSql)) {
                        try{
        String strSql = "SELECT * FROM cours";
        st = My_Cnx.getConnection().prepareStatement(strSql);
        rs=st.executeQuery();
        ResultSetMetaData rsMetadata = rs.getMetaData();
				int columnCount = rsMetadata.getColumnCount();

				// 1----------
				while (rs.next()) {
					for (int i = 1; i <= columnCount; i++) {
						str = rs.getString(i);
					}
				}
        
        
        
    }catch(SQLException ex){
        System.out.println(ex);
        
    }
                        /*
				ResultSetMetaData rsMetadata = rs.getMetaData();
				int columnCount = rsMetadata.getColumnCount();

				// 1----------
				while (rs.next()) {
					for (int i = 1; i <= columnCount; i++) {
						str = rs.getString(i);
					}
				}
				// 1---------
			}
			// 2--------------------------------
		*/
		// 3-------------------------------------------------------------

		return str;
	}

	private JMenuBar createMenuBar() {

		// La barre de menu � proprement parler
		JMenuBar mb = new JMenuBar();

		// d�finition du menu home
		JMenu mnuHome = new JMenu();
		mnuHome.setIcon(new ImageIcon("Home.png"));

		mb.add(mnuHome);

		// D�finition du menu d�roulant "Cours" et de son contenu
		JMenu mnuCours = new JMenu("Cours");
		mnuCours.setMnemonic('C');

		JMenuItem mnuNew = new JMenuItem("Emploi du temps");
		mnuCours.add(mnuNew);

		mnuCours.addSeparator();

		JMenuItem mnuOpenFile = new JMenuItem("R�capitulatif des cours");
                mnuOpenFile.addActionListener(this::recapLis);
                mnuCours.add(mnuOpenFile);
                
                

		mb.add(mnuCours);

		// D�finition du menu d�roulant "Vie scolaire" et de son contenu
		JMenu mnuVieSco = new JMenu("Vie scolaire");
		mnuVieSco.setMnemonic('V');

		JMenuItem mnuUndo = new JMenuItem("Relev� d'absence");
		mnuVieSco.add(mnuUndo);

		JMenuItem mnuRedo = new JMenuItem("Liste d'intervenant");
		mnuVieSco.add(mnuRedo);

		mnuVieSco.addSeparator();

		JMenuItem mnuCopy = new JMenuItem("Scolarit�");
		mnuVieSco.add(mnuCopy);

		mb.add(mnuVieSco);

		// D�finition du menu d�roulant "Salle" et de son contenu
		JMenu mnuSalle = new JMenu("Salle");
		mnuSalle.setMnemonic('S');

		JMenuItem mnuEDT = new JMenuItem("Emploi du temps");
		mnuSalle.add(mnuEDT);

		JMenuItem mnuSalleLibre = new JMenuItem("Salle libre");
		mnuSalle.add(mnuSalleLibre);

		mb.add(mnuSalle);
                
                
                JMenu mnuOut = new JMenu();
		mnuOut.setIcon(new ImageIcon("Home.png"));

		return mb;
	}
        private void recapLis( ActionEvent event ){
                Recap form = new Recap();
                form.setVisible(true);
                form.pack();
                this.dispose();
            
        
        }
	private JLabel createDay() {

		JLabel dayWeek = new JLabel();
		dayWeek.setPreferredSize(new Dimension(0, 30));
		dayWeek.setText("                                                       LUNDI");
		dayWeek.setText(dayWeek.getText() + "                                                                MARDI");
		dayWeek.setText(dayWeek.getText() + "                                                               MERCREDI");
		dayWeek.setText(dayWeek.getText() + "                                                            JEUDI");
		dayWeek.setText(dayWeek.getText() + "                                                             VENDREDI");
		dayWeek.setText(dayWeek.getText() + "                                                             SAMEDI");

		return dayWeek;
	}

	public static void main(String[] args) throws Exception {

		UIManager.setLookAndFeel(new NimbusLookAndFeel());

		Fenetre fen = new Fenetre();
		fen.setVisible(true);

	}

}

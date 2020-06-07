package planningProfesseur;
//import planningEtudiant.*;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
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

import planningEtudiant.planningEtudiantECE;
import planningSalle.fenetreRechercheSalle;

public class planningProfesseurECE extends JFrame{


	private static final long serialVersionUID = 668229218845723247L;
	
	int compteurSemaine = 21;
	JButton  b1 = new JButton( "Semaine précédente" );
	JButton  b2 = new JButton( "Semaine suivante" );
	CardLayout cl = new CardLayout();
	JPanel content = new JPanel();
	String[] listContent = { "21", "22" };

//--------------------------CONSTRUCTEUR DE LA CLASSE FENETRE-----------------------------------

	public planningProfesseurECE( String email, String password ) throws Exception {

		this.setTitle( "Planning professeur" );
		this.setExtendedState( JFrame.MAXIMIZED_BOTH );
		this.setLocationRelativeTo( null );
		this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );

		this.setJMenuBar( createMenuBar( email, password ) );

		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout( new BorderLayout() );
		
	
		coursProfSemaine21 grille21 = new coursProfSemaine21();
		coursProfSemaine22 grille22 = new coursProfSemaine22();
		
		content.setLayout( cl );
		
		content.add( grille21.grilleEdT( email, password ), listContent[0] );
		content.add( grille22.grilleEdT( email, password ), listContent[1] );
	
	    this.getContentPane().add( content, BorderLayout.CENTER );
	    this.getContentPane().add( createDay(), BorderLayout.NORTH );
	    this.getContentPane().add( contentPane3() , BorderLayout.SOUTH );

		JPanel hj = new heureJournee();
		hj.setPreferredSize( new Dimension( 70, 0 ) );
		contentPane.add( hj, BorderLayout.WEST );


	}
	private JMenuBar createMenuBar( String email, String password ) {

		// La barre de menu à proprement parler
		JMenuBar mb = new JMenuBar();

		// définition du menu home
		JMenu mnuHome = new JMenu();
		mnuHome.setIcon( new ImageIcon( "Home.png" ) );

		mb.add( mnuHome );

		// Définition du menu déroulant "Cours" et de son contenu
		JMenu mnuCours = new JMenu( "Cours" );
		mnuCours.setMnemonic( 'C' );

		JMenuItem mnuNew = new JMenuItem( "Emploi du temps" );
		mnuNew.setIcon( new ImageIcon( "icons8-fiche-technique-40.png" ) );
        mnuNew.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
                planningProfesseurECE fen;
				try {
					UIManager.setLookAndFeel( new NimbusLookAndFeel() );
					fen = new planningProfesseurECE( email, password );
					fen.setVisible( true );
					fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		mnuCours.add( mnuNew );

		mnuCours.addSeparator();

		JMenuItem mnuOpenFile = new JMenuItem( "Récapitulatif des cours" );
		mnuOpenFile.setIcon( new ImageIcon( "icons8-google-recaptcha-64.png" ) );
		mnuCours.add( mnuOpenFile );

		mb.add( mnuCours );

		// Définition du menu déroulant "Vie scolaire" et de son contenu
		JMenu mnuVieSco = new JMenu( "Vie scolaire" );
		mnuVieSco.setMnemonic( 'V' );

		JMenuItem mnuUndo = new JMenuItem( "Relevé d'absence" );
		mnuVieSco.add( mnuUndo );

		JMenuItem mnuRedo = new JMenuItem( "Liste d'intervenant" );
		mnuVieSco.add( mnuRedo );

		mnuVieSco.addSeparator();

		JMenuItem mnuCopy = new JMenuItem( "Scolarité" );
		mnuVieSco.add( mnuCopy );

		mb.add( mnuVieSco );

		// Définition du menu déroulant "Salle" et de son contenu
		JMenu mnuSalle = new JMenu( "Salle" );
		mnuSalle.setMnemonic( 'S' );

		JMenuItem mnuEDT = new JMenuItem( "Emploi du temps" );
		mnuEDT.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {
				fenetreRechercheSalle frs = new fenetreRechercheSalle( email, password );

			}
		});
		mnuSalle.add(mnuEDT);

		JMenuItem mnuSalleLibre = new JMenuItem("Salle libre");
		mnuSalle.add(mnuSalleLibre);

		mb.add(mnuSalle);

		return mb;
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
	
	private JPanel contentPane3() {
		
		JPanel contentPane3 = new JPanel();
		contentPane3.setLayout( new BoxLayout( contentPane3, BoxLayout.LINE_AXIS ) );
		
		JLabel jlStatus1 = new JLabel( "Semaine 21  ");
		jlStatus1.setPreferredSize( new Dimension( 100, 30 ) );
		contentPane3.add( jlStatus1 );
		
		b1.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.previous( content );
				if (compteurSemaine == 22 ) {
					compteurSemaine--;
				}else if( compteurSemaine == 21 ) {
					compteurSemaine++;
				}
				jlStatus1.setText( "Semaine " + compteurSemaine + "  " );
				
			}
		});
		b1.setIcon( new ImageIcon( "FlecheGauche.jfif" ) );
		
		b2.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.next( content );
				if (compteurSemaine == 22 ) {
					compteurSemaine--;
				}else if( compteurSemaine == 21 ) {
					compteurSemaine++;
				}
				jlStatus1.setText( "Semaine " + compteurSemaine + "  " );
				
			}
		});
		b2.setIcon( new ImageIcon( "FlecheDroite.jpg" ) );
		
		contentPane3.add( b1 );
		contentPane3.add( b2 );
		
		return contentPane3;
		
	}



}

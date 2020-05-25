package view;
//import planningEtudiant.*;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class planningEtudiantECE extends JFrame{


	private static final long serialVersionUID = 668229218845723247L;
	
	JButton  b1 = new JButton( "Semaine pr�c�dente" );
	JButton  b2 = new JButton( "Semaine suivante" );
	CardLayout cl = new CardLayout();
	JPanel content = new JPanel();
	String[] listContent = { "21", "22" };

//--------------------------CONSTRUCTEUR DE LA CLASSE FENETRE-----------------------------------
	@SuppressWarnings("static-access")
	public planningEtudiantECE() throws Exception {

		this.setTitle("Planning �tudiant");
		this.setExtendedState(this.MAXIMIZED_BOTH);
		//this.setSize( new Dimension( 600, 400) );
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		this.setJMenuBar( createMenuBar() );

		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout( new BorderLayout() );
		

		coursSemaine21 grille21 = new coursSemaine21();
		coursSemaine22 grille22 = new coursSemaine22();
		
		content.setLayout( cl );
		
		content.add( grille21.grilleEdT(), listContent[0] );
		content.add( grille22.grilleEdT(), listContent[1] );
		
	    this.getContentPane().add( content, BorderLayout.CENTER );
	    this.getContentPane().add( createDay(), BorderLayout.NORTH );
	    this.getContentPane().add( contentPane3() , BorderLayout.SOUTH );

		JPanel hj = new heureJournee();
		hj.setPreferredSize( new Dimension( 70, 0 ) );
		contentPane.add( hj, BorderLayout.WEST );


	}
	private JMenuBar createMenuBar() {

		// La barre de menu � proprement parler
		JMenuBar mb = new JMenuBar();

		// d�finition du menu home
		JMenu mnuHome = new JMenu();
		mnuHome.setIcon( new ImageIcon( "Home.png" ) );

		mb.add( mnuHome );

		// D�finition du menu d�roulant "Cours" et de son contenu
		JMenu mnuCours = new JMenu( "Cours" );
		mnuCours.setMnemonic( 'C' );

		JMenuItem mnuNew = new JMenuItem( "Emploi du temps" );
		mnuCours.add( mnuNew );

		mnuCours.addSeparator();

		JMenuItem mnuOpenFile = new JMenuItem( "R�capitulatif des cours" );
		mnuCours.add( mnuOpenFile );

		mb.add( mnuCours );

		// D�finition du menu d�roulant "Vie scolaire" et de son contenu
		JMenu mnuVieSco = new JMenu( "Vie scolaire" );
		mnuVieSco.setMnemonic( 'V' );

		JMenuItem mnuUndo = new JMenuItem( "Relev� d'absence" );
		mnuVieSco.add( mnuUndo );

		JMenuItem mnuRedo = new JMenuItem( "Liste d'intervenant" );
		mnuVieSco.add( mnuRedo );

		mnuVieSco.addSeparator();

		JMenuItem mnuCopy = new JMenuItem( "Scolarit�" );
		mnuVieSco.add( mnuCopy );

		mb.add( mnuVieSco );
 
		// D�finition du menu d�roulant "Salle" et de son contenu
		JMenu mnuSalle = new JMenu( "Salle" );
		mnuSalle.setMnemonic( 'S' );

		JMenuItem mnuEDT = new JMenuItem( "Emploi du temps" );
		mnuSalle.add( mnuEDT );

		JMenuItem mnuSalleLibre = new JMenuItem( "Salle libre" );
		mnuSalle.add( mnuSalleLibre );

		mb.add( mnuSalle );

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
		
		
		b1.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.previous( content );
				
			}
		});
		b1.addMouseListener( new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				b1.setForeground( Color.GREEN );
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				b1.setForeground( Color.BLUE );
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				b1.setForeground( Color.RED );
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				b1.setForeground( Color.YELLOW );
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				b1.setForeground( Color.PINK );
			}
		});
		b1.setIcon( new ImageIcon( "FlecheGauche.jfif" ) );
		
		b2.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.next( content );
				
			}
		});
		b2.setIcon( new ImageIcon( "FlecheDroite.jpg" ) );
		
		contentPane3.add( b1 );
		contentPane3.add( b2 );
		
		return contentPane3;
		
	}
	


}

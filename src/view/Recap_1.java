package planningEtudiant;
import java.awt.Color;
import java.awt.Font;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;


import net.proteanit.sql.DbUtils;


public class Recap extends JFrame {
	
	

	private static final long serialVersionUID = -8141323301076812684L;
	
	
	private JTable Table;
	private JCheckBoxMenuItem jCheckBoxMenuItem1;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JMenu jMenu1;
	private JMenu jMenu2;
	private JMenu jMenu3;
	private JMenu jMenu4;
	private JMenu jMenu5;
	private JMenu jMenu6;
	private JMenu jMenu7;
	private JMenuBar jMenuBar1;
	private JMenuItem jMenuItem1;
	private JMenuItem jMenuItem2;
	private JMenuItem jMenuItem3;
	private JPanel jPanel1;
	private JPopupMenu jPopupMenu1;
	private JPopupMenu jPopupMenu2;
	private JPopupMenu jPopupMenu3;
	private JPopupMenu jPopupMenu4;
	private JPopupMenu jPopupMenu5;
	private JPopupMenu jPopupMenu6;
	private JPopupMenu jPopupMenu7;
	private JScrollPane jScrollPane1;
	private JScrollPane jScrollPane2;
	private PopupMenu popupMenu1;
	private JTable tdetail;
	
	public void affichage() throws Exception {
		
		
		Properties props = new Properties();
		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}
		
		Class.forName( props.getProperty( "jdbc.driver.class" ) );
		
		String url = props.getProperty( "jdbc.url" );
		String dbLogin = props.getProperty( "jdbc.login" );
		String dbPassword = props.getProperty( "jdbc.password" );
		
		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
			String query = "SELECT nom as 'Matiere',MIN(heure_debut) as 'premiere senace',MAX(heure_debut) as 'derniere seance'"
					+ ",COUNT(id_cours) as 'nb.',TIME(SUM(TIME(heure_fin)-TIME(heure_debut))) as 'heures' "
					+ " FROM `cours`JOIN `seance` ON seance.id_cours=cours.id GROUP by nom";
			
			try ( PreparedStatement statement = connection.prepareStatement( query );
					  ResultSet resultSet = statement.executeQuery() ) {
				Table.setModel( DbUtils.resultSetToTableModel( resultSet ) );
			}
			
		}

	}

	
	public Recap( String email, String password ) throws Exception {
		initComponents( email, password );
		this.setExtendedState( MAXIMIZED_BOTH );
		affichage();

	}


	
	private void initComponents( String email, String password ) {

		jMenu1 = new JMenu();
		jPopupMenu1 = new JPopupMenu();
		jPopupMenu2 = new JPopupMenu();
		jPopupMenu3 = new JPopupMenu();
		jMenu4 = new JMenu();
		jPopupMenu4 = new JPopupMenu();
		jPopupMenu5 = new JPopupMenu();
		jPopupMenu6 = new JPopupMenu();
		jPopupMenu7 = new JPopupMenu();
		jCheckBoxMenuItem1 = new JCheckBoxMenuItem();
		jMenuItem1 = new JMenuItem();
		popupMenu1 = new PopupMenu();
		jMenu7 = new JMenu();
		jScrollPane2 = new JScrollPane();
		Table = new JTable();
		jScrollPane1 = new JScrollPane();
		tdetail = new JTable();
		jPanel1 = new JPanel();
		jLabel2 = new JLabel();
		jLabel1 = new JLabel();
		jMenuBar1 = new JMenuBar();
		jMenu2 = new JMenu();
		jMenu3 = new JMenu();
		jMenuItem2 = new JMenuItem();
		jMenuItem3 = new JMenuItem();
		jMenu5 = new JMenu();
		jMenu6 = new JMenu();

		jMenu1.setText( "jMenu1" );

		jMenu4.setText( "jMenu4" );

		jCheckBoxMenuItem1.setSelected( true );
		jCheckBoxMenuItem1.setText( "jCheckBoxMenuItem1" );

		jMenuItem1.setText( "jMenuItem1" );

		popupMenu1.setLabel( "popupMenu1" );

		jMenu7.setText( "jMenu7" );

		setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );

		Table.setBackground( new Color( 0, 0, 153 ) );
		Table.setForeground(new Color( 255, 255, 255 ) );
		Table.setModel(
				new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" } ) );
		Table.addMouseListener( new MouseAdapter() {
			public void mouseClicked( MouseEvent evt ) {
				try {
					TableMouseClicked( evt );
				} catch ( Exception e ) {
					e.printStackTrace();
				}
			}
		});
		jScrollPane2.setViewportView( Table );

		tdetail.setModel(
				new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" } ) );
		jScrollPane1.setViewportView( tdetail );

		jPanel1.setBackground(new Color( 0, 0, 153 ) );

		jLabel2.setBackground(new Color( 0, 102, 102 ) );
		jLabel2.setFont(new Font( "Tahoma", 0, 24 ) ); 
		jLabel2.setForeground(new Color( 255, 255, 255 ) );
		jLabel2.setText( "D�tails de la matiere" );

		GroupLayout jPanel1Layout = new GroupLayout( jPanel1 );
		jPanel1.setLayout( jPanel1Layout );
		jPanel1Layout.setHorizontalGroup( jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING )
				.addGroup( jPanel1Layout.createSequentialGroup().addContainerGap().addComponent( jLabel2 )
						.addContainerGap( GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) ) );
		jPanel1Layout
				.setVerticalGroup( jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING )
						.addGroup( GroupLayout.Alignment.TRAILING,
								jPanel1Layout.createSequentialGroup().addContainerGap()
										.addComponent(jLabel2,  GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
										.addContainerGap() ) );

		jLabel1.setIcon( new ImageIcon( "inseec_u_bleu_vertical.png" ) );

		jMenu2.setIcon( new ImageIcon( "Home.png" ) );
		
		jMenuBar1.add( jMenu2 );

		jMenu3.setText( "Cours" );

		jMenuItem2.setIcon( new ImageIcon( "icons8-fiche-technique-40.png" ) );
		jMenuItem2.setText( "Emploi du temps" );
		jMenuItem2.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed( ActionEvent e ) {
				
                planningEtudiantECE fen;
				try {
					UIManager.setLookAndFeel( new NimbusLookAndFeel() );
					fen = new planningEtudiantECE( email, password );
					fen.setVisible( true );
					fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		jMenu3.add( jMenuItem2 );

		jMenuItem3.setIcon(new ImageIcon( "icons8-google-recaptcha-64.png" ) );
		jMenuItem3.setText( "R�capitulatif des cours" );
		jMenuItem3.addActionListener( new ActionListener() {
			public void actionPerformed( ActionEvent evt ) {
				try {
					Recap form = new Recap( email, password );
					form.setVisible( true );
					form.pack();
				} catch ( Exception e ) {
					e.printStackTrace();
				}
			}
		});
		jMenu3.add( jMenuItem3 );

		jMenuBar1.add( jMenu3 );

		jMenu5.setText( "Vie Scolaire" );
		jMenuBar1.add( jMenu5 );

		jMenu6.setText( "Salle" );
		jMenuBar1.add( jMenu6 );

		setJMenuBar( jMenuBar1 );

		GroupLayout layout = new GroupLayout( getContentPane() );
		getContentPane().setLayout( layout );
                layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 342, GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 515, GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 534, GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))))
        );
		
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING ).addGroup(
				GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addGap( 100, 100, 100 ).addGroup(layout
						.createParallelGroup( GroupLayout.Alignment.LEADING )
						.addGroup( layout.createSequentialGroup()
								.addComponent( jPanel1, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE )
								.addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED )
								.addComponent( jScrollPane1, GroupLayout.PREFERRED_SIZE, 274,
										GroupLayout.PREFERRED_SIZE ) )
						.addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE ) )
						.addGap( 38, 38, 38 ).addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 269,
								GroupLayout.PREFERRED_SIZE)
						.addGap( 59, 59, 59 ) ) );

		pack();
	}

	private void TableMouseClicked( MouseEvent evt ) throws Exception {
		
		boolean a = Table.isEditing();

		int ligne = Table.getSelectedRow();

		String matiere = (String) Table.getModel().getValueAt( ligne, 0 );

			
			Properties props = new Properties();
			try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
				props.load( fis );
			}
			
			Class.forName( props.getProperty( "jdbc.driver.class" ) );
			
			String url = props.getProperty( "jdbc.url" );
			String dbLogin = props.getProperty( "jdbc.login" );
			String dbPassword = props.getProperty( "jdbc.password" );
			
			try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
				
				String query = "SELECT date,TIME(heure_debut) as 'Debut',TIME(heure_fin) as 'Fin',site.nom AS 'site',salle.nom AS 'salle',"
						+ "salle.capacite FROM `seance_salle`INNER JOIN `salle`ON seance_salle.id_salle=salle.id INNER JOIN `seance` "
						+ "ON seance_salle.id_seance=seance.id INNER JOIN `site`ON"
						+ " salle.id_site=site.id INNER JOIN `cours`" + "ON seance.id_cours=cours.id WHERE cours.nom='"
						+ matiere + "'";
				
				try ( PreparedStatement statement = connection.prepareStatement( query );
						  ResultSet resultSet = statement.executeQuery() ) {
					
					tdetail.setModel( DbUtils.resultSetToTableModel( resultSet ) );
					TestPieChart tpc = new TestPieChart( matiere );
					tpc.setVisible( true );
					tpc.setLocation( 80, 250 );
				}
				
			}

		
	}


	
/*	public static void main( String args[] ) {
		
		
		try {
			for ( UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels() ) {
				if ("Nimbus".equals(info.getName() ) ) {
					UIManager.setLookAndFeel(info.getClassName() );
					break;
				}
			}
		} catch ( ClassNotFoundException ex ) {
			java.util.logging.Logger.getLogger( Recap.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
		} catch ( InstantiationException ex ) {
			java.util.logging.Logger.getLogger( Recap.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
		} catch ( IllegalAccessException ex ) {
			java.util.logging.Logger.getLogger( Recap.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
		} catch ( javax.swing.UnsupportedLookAndFeelException ex ) {
			java.util.logging.Logger.getLogger( Recap.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
		}
		

		
		java.awt.EventQueue.invokeLater( new Runnable() {
			public void run() {
				try {
					new Recap().setVisible( true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	

}
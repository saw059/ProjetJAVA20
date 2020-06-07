import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import admin.Admin;
import planningEtudiant.planningEtudiantECE;
import planningProfesseur.planningProfesseurECE;
import referent.Ref;

public class Login extends javax.swing.JFrame {

	private static final long serialVersionUID = 8497669767108893574L;
	
	private JButton jButton_login;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JPanel jPanel1;
	private JPasswordField jPasswordField;
	private JTextField jTextField_email;

	
	public Login() {
		initComponents();
		this.setLocationRelativeTo(null);
		this.setExtendedState(Login.MAXIMIZED_BOTH);
	}

	private void initComponents() {

		jPanel1 = new JPanel();
		jLabel3 = new JLabel();
		jTextField_email = new JTextField();
		jLabel4 = new JLabel();
		jPasswordField = new JPasswordField();
		jButton_login = new JButton();
		jLabel2 = new JLabel();
		jLabel1 = new JLabel();
		jLabel5 = new JLabel();
		jLabel6 = new JLabel();

		setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
		setBackground( new Color( 0, 0, 153 ) );

		jPanel1.setBackground( new Color( 0, 0, 153 ) );

		jLabel3.setFont( new Font( "Tahoma", 0, 18 ) );
		jLabel3.setForeground( new Color( 255, 255, 255 ) );
		jLabel3.setText( "E-Mail :" );

		jTextField_email.setText( "@edu.ece.fr" );

		jLabel4.setFont( new Font( "Tahoma", 0, 18 ) ); 
		jLabel4.setForeground( new Color( 255, 255, 255 ) );
		jLabel4.setText( "Mot de passe :" );

		jPasswordField.setText( "password" );
		jPasswordField.setCursor( new  Cursor( Cursor.DEFAULT_CURSOR));
		jPasswordField.addFocusListener( new FocusAdapter() {
			public void focusGained( FocusEvent evt) {
				jPasswordFieldFocusGained( evt );
			}

			public void focusLost( FocusEvent evt ) {
				jPasswordFieldFocusLost( evt );
			}
		});

		jButton_login.setBackground( new Color( 0, 0, 153 ) );
		jButton_login.setFont(new Font( "Microsoft Sans Serif", 0, 18 ) ); 
		jButton_login.setForeground(new Color( 255, 255, 255 ) );
		jButton_login.setText( "Connexion" );
		jButton_login.addActionListener( new ActionListener() {
			public void actionPerformed( ActionEvent evt ) {
				try {
					boutonCnx();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		jLabel2.setFont( new Font( "Tahoma", 0, 24 ) );
		jLabel2.setForeground( new Color( 255, 255, 255 ) );
		jLabel2.setText( "LOGIN" );

		jLabel1.setIcon( new ImageIcon( "ECE_Paris_blanc.png" ) );

		jLabel5.setIcon( new ImageIcon( "INSEEC-U-blanc.png" ) ); 

		jLabel6.setIcon( new ImageIcon( "INSEEC-U-blanc copie.png" ) ); 

		GroupLayout jPanel1Layout = new GroupLayout( jPanel1 );
		jPanel1.setLayout( jPanel1Layout );
		jPanel1Layout.setHorizontalGroup( jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING )
				.addGroup( jPanel1Layout.createSequentialGroup().addGap( 88, 88, 88 ).addGroup( jPanel1Layout
						.createParallelGroup( GroupLayout.Alignment.TRAILING )
						.addGroup( jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING )
								.addComponent( jLabel1, GroupLayout.PREFERRED_SIZE, 436,
										GroupLayout.PREFERRED_SIZE)
								.addGroup( GroupLayout.Alignment.TRAILING,
										jPanel1Layout.createSequentialGroup().addComponent( jLabel3 ).addGap( 67, 67, 67 )
												.addComponent( jTextField_email, GroupLayout.PREFERRED_SIZE,
														309, GroupLayout.PREFERRED_SIZE ) )
								.addGroup( GroupLayout.Alignment.TRAILING,
										jPanel1Layout.createSequentialGroup().addComponent( jLabel2 ).addGap( 209, 209,
												209 ) ) )
						.addGroup( jPanel1Layout.createSequentialGroup().addComponent( jLabel4 ).addGap( 27, 27, 27 )
								.addGroup( jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING )
										.addComponent( jPasswordField, GroupLayout.PREFERRED_SIZE, 309,
												GroupLayout.PREFERRED_SIZE )
										.addGroup( jPanel1Layout.createSequentialGroup().addGap( 32, 32, 32 ).addComponent(
												jButton_login, GroupLayout.PREFERRED_SIZE, 166,
												GroupLayout.PREFERRED_SIZE ) ) ) ) )
						.addGroup( jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap( 180, 180, 180 ).addComponent(
										jLabel6, GroupLayout.PREFERRED_SIZE, 399,
										GroupLayout.PREFERRED_SIZE ) )
								.addGroup( jPanel1Layout.createSequentialGroup().addGap( 300, 300, 300 ).addComponent(
										jLabel5, GroupLayout.PREFERRED_SIZE, 100,
										GroupLayout.PREFERRED_SIZE ) ) )
						.addContainerGap( 120, Short.MAX_VALUE ) ) );
		jPanel1Layout.setVerticalGroup( jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING )
				.addGroup( jPanel1Layout.createSequentialGroup().addGap( 148, 148, 148 )
						.addComponent( jLabel5, GroupLayout.PREFERRED_SIZE, 173,
								GroupLayout.PREFERRED_SIZE )
						.addGap( 0, 0, 0 ).addComponent( jLabel6 )
						.addContainerGap( GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) )
				.addGroup( jPanel1Layout.createSequentialGroup().addGap( 45, 45, 45 )
						.addComponent( jLabel1, GroupLayout.PREFERRED_SIZE, 125,
								GroupLayout.PREFERRED_SIZE)
						.addGap( 96, 96, 96 ).addComponent( jLabel2 ).addGap( 54, 54, 54 )
						.addGroup( jPanel1Layout.createParallelGroup( GroupLayout.Alignment.BASELINE )
								.addComponent( jTextField_email, GroupLayout.PREFERRED_SIZE, 35,
										GroupLayout.PREFERRED_SIZE )
								.addComponent( jLabel3 ) )
						.addGap( 30, 30, 30 )
						.addGroup( jPanel1Layout.createParallelGroup( GroupLayout.Alignment.BASELINE )
								.addComponent(jPasswordField, GroupLayout.PREFERRED_SIZE, 34,
										GroupLayout.PREFERRED_SIZE )
								.addComponent( jLabel4 ) )
						.addGap( 20, 20, 20 ).addComponent(jButton_login, GroupLayout.PREFERRED_SIZE, 46,
								GroupLayout.PREFERRED_SIZE )
						.addGap( 61, 61, 61 ) ) );

		GroupLayout layout = new GroupLayout( getContentPane() );
		getContentPane().setLayout( layout );
		layout.setHorizontalGroup( layout.createParallelGroup( GroupLayout.Alignment.LEADING ).addComponent(
				jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) );
		layout.setVerticalGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING ).addComponent(
				jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
				GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) );

		pack();
	}

	private void jPasswordFieldFocusGained( FocusEvent evt ) {
		String pass = String.valueOf( jPasswordField.getPassword() );
		// pour effacer le texte avant d'ecrire
		if ( pass.trim().toLowerCase().equals( "password" ) ) {
			jPasswordField.setText( "" );
			jPasswordField.setForeground( Color.black );
		} else {
		}
	}

	private void jPasswordFieldFocusLost( FocusEvent evt ) {
		String pass = String.valueOf( jPasswordField.getPassword() );
		if ( pass.trim().equals( "" ) || pass.trim().toLowerCase().equals( "password" ) ) {
			jPasswordField.setText( "password" );
			jPasswordField.setForeground( Color.black );
		}
	}

	private void boutonCnx() throws Exception {

		Properties props = new Properties();
		

		try (FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName( props.getProperty( "jdbc.driver.class" ) );

		String url = props.getProperty( "jdbc.url" );
		String dbLogin = props.getProperty( "jdbc.login" );
		String dbPassword = props.getProperty( "jdbc.password" );

		String email = jTextField_email.getText();
		String password = String.valueOf( jPasswordField.getPassword() );
		

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String query = "SELECT * FROM utilisateur WHERE email =? AND password =? ";

			try ( PreparedStatement statement = connection.prepareStatement( query ) ) {
				
				statement.setString( 1, email );
				statement.setString( 2, password );
				
				
				try ( ResultSet resultSet = statement.executeQuery() ) {
					
					if ( resultSet.next() ) {
						
						this.dispose();
						String query2 = "SELECT droit FROM utilisateur WHERE email = '" + email + "' AND password = '" + password + "'";
						
						try (Statement statement2 = connection.createStatement();
             					ResultSet resultSet2 = statement2.executeQuery( query2 ) ){
                    		 
                    		 resultSet2.next();
                    		 if ( resultSet2.getString( "droit" ).equals( "4" ) ) {
                    			 UIManager.setLookAndFeel( new NimbusLookAndFeel() );
         						 planningEtudiantECE fen = new planningEtudiantECE( email, password );
         						 fen.setVisible( true );
         						 fen.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
                    		 } else if( resultSet2.getString( "droit" ).equals( "3" ) ) {
                    			 UIManager.setLookAndFeel( new NimbusLookAndFeel() );
         						 planningProfesseurECE fen = new planningProfesseurECE( email, password );
         						 fen.setVisible( true );
         						 fen.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
                    		 } else if( resultSet2.getString( "droit" ).equals( "2" ) ) {
                    			 UIManager.setLookAndFeel( new NimbusLookAndFeel() );
         						 Ref fen = new Ref();
         						 fen.setVisible( true );
         						 fen.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
                    		 } else if( resultSet2.getString( "droit" ).equals( "1" ) ) {
                    			 UIManager.setLookAndFeel( new NimbusLookAndFeel() );
         						 Admin fen = new Admin();
         						 fen.setVisible( true );
         						 fen.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
                    		 }
						}
						
						
						 
					
					} else {
						JOptionPane.showMessageDialog( null, "Invalid email/password", "Login error", 2 );
					}
				}
			}
		}

	}
	


	
	
	public static void main( String args[] ) {
		
		try {
			for ( UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ( "Nimbus".equals( info.getName() ) ) {
					UIManager.setLookAndFeel( info.getClassName() );
					break;
				}
			}
		} catch ( ClassNotFoundException ex ) {
			java.util.logging.Logger.getLogger( Login.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
		} catch ( InstantiationException ex ) {
			java.util.logging.Logger.getLogger( Login.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
		} catch ( IllegalAccessException ex ) {
			java.util.logging.Logger.getLogger( Login.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
		} catch ( javax.swing.UnsupportedLookAndFeelException ex ) {
			java.util.logging.Logger.getLogger( Login.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
		}

		java.awt.EventQueue.invokeLater( new Runnable() {
			public void run() {
				new Login().setVisible( true );
			}
		});
	}
	
	


	

}

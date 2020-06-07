package planningSalle;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class fenetreRechercheSalle {

	JFrame fen = new JFrame();
	JPanel pan = new JPanel();
	JLabel label = new JLabel( "Numéro salle: " );
	JTextField t = new JTextField( "nom de la salle" );
	JButton jButton_login = new JButton( "Rechercher" );

	public fenetreRechercheSalle( String email, String password) {

		fen.setTitle( "Salle" );
		fen.setSize( new Dimension( 300, 100 ) );
		fen.setLocationRelativeTo( null );
		fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
		fen.setVisible( true );
		fen.setContentPane( pan );

		pan.add( label );
		pan.add( t );
		pan.add( jButton_login );

		jButton_login.addActionListener( new ActionListener() {

			public void actionPerformed( ActionEvent e ) {
				try {
					boutonRechercher( email, password );
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
	}

	private void boutonRechercher( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty( "jdbc.driver.class" ) );

		String url = props.getProperty( "jdbc.url" );
		String dbLogin = props.getProperty( "jdbc.login" );
		String dbPassword = props.getProperty( "jdbc.password" );

		String salle = t.getText();
		System.out.println( salle );

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String req = "SELECT * FROM salle WHERE nom =? ";

			try ( PreparedStatement statement = connection.prepareStatement( req ) ) {

				statement.setString( 1, salle );

				try ( ResultSet resultSet = statement.executeQuery() ) {

					if ( resultSet.next() ) {

						planningSalleECE ps = new planningSalleECE( salle, email, password );
						ps.setVisible( true );
						ps.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
					} else {
						JOptionPane.showMessageDialog( null, "Invalid salle", "Login error", 1 );
					}
				}
			}
		}
	}
}

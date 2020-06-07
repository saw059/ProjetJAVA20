package referent;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import planningEtudiant.planningEtudiantECE;
import planningProfesseur.planningProfesseurECE;

/**
 *
 * @author sahraoui
 */
public class Ref extends JFrame {
	
	private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jNom;
    private javax.swing.JPanel jPanel1;

    /**
     * Creates new form Ref
     */
    public Ref() {
        initComponents();
        this.setLocationRelativeTo( null) ;
        this.setExtendedState( JFrame.MAXIMIZED_BOTH );
    }

  
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        jLabel1 = new JLabel();
        jNom = new JTextField();
        jButton1 = new JButton();
        jLabel3 = new JLabel();

        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        setBackground(new Color( 0, 102, 102 ) );

        jPanel1.setBackground(new Color( 0, 102, 102 ) );

        jLabel2.setBackground( new Color( 0, 102, 102 ) );
        jLabel2.setFont(new Font( "Tahoma", 0, 36 ) ); 
        jLabel2.setForeground(new Color( 255, 255, 255 ) );
        jLabel2.setText( "Référent pedagogique" );

        jLabel1.setFont( new Font( "Lucida Grande", 0, 18 ) );
        jLabel1.setForeground( new Color( 255, 255, 255 ) );
        jLabel1.setText( "nom du (prof/etudiant) : " );

        jButton1.setText( "afficher le planning" );
        jButton1.addActionListener( new ActionListener() {
            public void actionPerformed( ActionEvent evt ) {
                try {
					jButton1ActionPerformed( evt );
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });

        jLabel3.setIcon( new ImageIcon( "ECE_Paris_blanc.png" ) );

        javax.swing.GroupLayout jPanel1Layout = new GroupLayout( jPanel1 );
        jPanel1.setLayout( jPanel1Layout );
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING )
            .addGroup( jPanel1Layout.createSequentialGroup()
                .addGroup( jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING )
                    .addGroup( jPanel1Layout.createSequentialGroup()
                        .addContainerGap( GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                        .addComponent( jLabel3 ) )
                    .addGroup( jPanel1Layout.createSequentialGroup()
                        .addContainerGap( GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                        .addComponent( jLabel2, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE ) )
                    .addGroup( jPanel1Layout.createSequentialGroup()
                        .addContainerGap( 120, Short.MAX_VALUE )
                        .addGroup( jPanel1Layout.createParallelGroup( GroupLayout.Alignment.TRAILING )
                            .addComponent( jButton1 )
                            .addGroup( jPanel1Layout.createSequentialGroup()
                                .addComponent( jLabel1 )
                                .addGap( 18, 18, 18 )
                                .addComponent( jNom, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE ) ) ) ) )
                .addContainerGap( 181, Short.MAX_VALUE ) )
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING )
            .addGroup( jPanel1Layout.createSequentialGroup()
                .addGap( 14, 14, 14 )
                .addComponent( jLabel2, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE )
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE )
                .addGroup( jPanel1Layout.createParallelGroup( GroupLayout.Alignment.BASELINE )
                    .addComponent( jLabel1 )
                    .addComponent( jNom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE ) )
                .addGap( 50, 50, 50 )
                .addComponent( jButton1 )
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE )
                .addComponent( jLabel3 )
                .addGap( 23, 23, 23 ) )
        );

        GroupLayout layout = new GroupLayout( getContentPane() );
        getContentPane().setLayout( layout );
        layout.setHorizontalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING )
            .addComponent( jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING )
            .addComponent( jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
        );

        pack();
    }

    private void jButton1ActionPerformed( ActionEvent evt ) throws Exception {
        
        
        Properties props = new Properties();
		

		try (FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName( props.getProperty( "jdbc.driver.class" ) );

		String url = props.getProperty( "jdbc.url" );
		String dbLogin = props.getProperty( "jdbc.login" );
		String dbPassword = props.getProperty( "jdbc.password" );

		String nom =jNom.getText();
		

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String query= "SELECT * FROM utilisateur WHERE nom =? ";

			try ( PreparedStatement statement = connection.prepareStatement( query ) ) {
				
				statement.setString( 1, nom );
				
				try ( ResultSet resultSet = statement.executeQuery() ) {
                        if ( resultSet.next() ) {
                        	
                        	 String query2 = "SELECT email, password, droit FROM utilisateur WHERE nom = '" + nom + "'";
                        	 
                        	 
                        	 try (Statement statement2 = connection.createStatement();
                 					ResultSet resultSet2 = statement2.executeQuery( query2 ) ){
                        		 
                        		 resultSet2.next();
          						 
                        		 if (  resultSet2.getString( "droit" ).equals( "4" ) ) {
                        			 UIManager.setLookAndFeel( new NimbusLookAndFeel() );
            						 planningEtudiantECE fen = new planningEtudiantECE( resultSet2.getString( "email" ), resultSet2.getString( "password" ) );
            						 fen.setVisible( true );
            						 fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
                        		 }else if( resultSet2.getString( "droit" ).equals( "3" ) ) {
                        			 UIManager.setLookAndFeel( new NimbusLookAndFeel() );
            						 planningProfesseurECE fen = new planningProfesseurECE( resultSet2.getString( "email" ), resultSet2.getString( "password" ) );
            						 fen.setVisible( true );
            						 fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
                        		 }
        						 
                        	 }
                        	 
                        }
                       
                }
						
						
			}
        
		}
    }

    
   

   
}

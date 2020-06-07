package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.table.TableModel;

import net.proteanit.sql.DbUtils;
import view.planningEtudiantECE;
//import planningProfesseur.planningProfesseurECE;


public class Admin_1 extends JFrame {
   

	private static final long serialVersionUID = 3736186565378033133L;
	
	private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabelP;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JTextField jTextField1;
    private JTextField jTextField10;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JTextField jTextField7;
    private JTextField jTextField8;
    private JTextField jTextField9;
    private JTextField jTextField11;
    private JTextField jTextFieldN;
    private JButton supp;
	
    
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
    			
    			String query = "SELECT cours.nom,seance.semaine,seance.id AS 'n°'"
                                + ",utilisateur.nom AS'nom',date,TIME(heure_debut) as 'De'"
                                + ",TIME(heure_fin) as 'À',site.nom AS 'site',salle.nom AS "
                                + "'salle',groupe.nom AS 'groupe',promotion.nom as 'promotion'"
                                + "  FROM `seance_salle`INNER JOIN `salle`ON "
                                + "seance_salle.id_salle=salle.id INNER JOIN `seance`ON "
                                + "seance_salle.id_seance=seance.id INNER JOIN `site`ON "
                                + "salle.id_site=site.id INNER JOIN `cours`ON seance.id_cours=cours.id"
                                + " INNER JOIN`seance_enseignant` ON seance.id=seance_enseignant.id_seance "
                                + "INNER JOIN `utilisateur`ON utilisateur.id=seance_enseignant.id_enseignant"
                                + " INNER JOIN `seance_groupe`ON seance.id=seance_groupe.id_seance "
                                + "INNER JOIN `groupe`ON seance_groupe.id_groupe=groupe.id "
                                + "INNER JOIN `promotion`ON groupe.id_promotion=promotion.id";
    			
    			try ( PreparedStatement statement = connection.prepareStatement( query );
    					  ResultSet resultSet = statement.executeQuery() ) {
    				
    				jTable1.setModel( DbUtils.resultSetToTableModel( resultSet ) );
    			}
    		}
    		
    	}
        
    public Admin_1() throws Exception {
        initComponents();
        affichage();
        this.setLocationRelativeTo( null );
        this.setExtendedState( MAXIMIZED_BOTH );
        
    }

   
    private void initComponents() {

        jPanel1 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jButton1 = new JButton();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jTextFieldN = new JTextField();
        supp = new JButton();
        jButton3 = new JButton();
        jPanel2 = new JPanel();
        jLabel3 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel4 = new JLabel();
        jLabel8 = new JLabel();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jTextField4 = new JTextField();
        jTextField5 = new JTextField();
        jTextField6 = new JTextField();
        jLabel9 = new JLabel();
        jTextField7 = new JTextField();
        jLabel10 = new JLabel();
        jTextField8 = new JTextField();
        jLabel11 = new JLabel();
        jTextField9 = new JTextField();
        jLabel12 = new JLabel();
        jTextField10 = new JTextField();
        jLabelP = new JLabel();
        jTextField11 = new JTextField();
        jButton2 = new JButton();

        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );

        jPanel1.setBackground(new Color( 0, 102, 102 ) );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener( new MouseAdapter() {
            public void mouseClicked( MouseEvent evt ) {
                jTable1MouseClicked( evt );
            }
        });
        jScrollPane1.setViewportView( jTable1 );

        jButton1.setText( "ajouter" );
        jButton1.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					affecterEnseignantSeance();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

        jLabel1.setFont( new Font( "Tahoma", 0, 36 ) ); 
        jLabel1.setForeground( new Color( 255, 255, 255 ) );
        jLabel1.setText( "ADMIN" );

        jLabel2.setFont( new Font( "Lucida Grande", 0, 14 ) ); 
        jLabel2.setForeground( new Color( 255, 255, 255 ) );
        jLabel2.setText( "Nom (Etudiant/professeur) :" );

        jTextFieldN.addActionListener( new ActionListener() {
            public void actionPerformed( ActionEvent evt ) {
                jTextFieldNActionPerformed( evt );
            }
        });

        supp.setText( "supprimer" );
        supp.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					supprimerSeance( e );
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});

        jButton3.setText( "MAJ" );
        supp.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					MAJSeance( e );
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
        

        jLabel3.setText( "professeur:" );

        jLabel5.setText( "de :" );

        jLabel6.setText( "A� :" );

        jLabel7.setText( "site :" );

        jLabel4.setText( "date :" );

        jLabel8.setText( "salle :" );

        jLabel9.setText( "groupe :" );

        jLabel10.setText( "seance n� :" );

        jLabel11.setText( "matiere :" );

        jLabel12.setText( "semaine :" );
        
        jLabelP.setText("promotion :");

        GroupLayout jPanel2Layout = new GroupLayout( jPanel2 );
        jPanel2.setLayout( jPanel2Layout );
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup( jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup( jPanel2Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addGroup( jPanel2Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap( 25, 25, 25 )
                            .addGroup( jPanel2Layout.createParallelGroup( GroupLayout.Alignment.TRAILING )
                                .addComponent( jLabel7 )
                                .addComponent( jLabel8 )
                                .addComponent( jLabel9 ) )
                            .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED))
                        .addGroup( GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup( jPanel2Layout.createParallelGroup( GroupLayout.Alignment.TRAILING )
                                .addComponent( jLabel5 )
                                .addComponent( jLabel6 ) )
                            .addGap( 18, 18, 18 ) ) )
                    .addGroup( GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup( jPanel2Layout.createParallelGroup( GroupLayout.Alignment.TRAILING )
                            .addComponent( jLabel3 )
                            .addComponent( jLabel4 )
                            .addComponent( jLabel10 )
                            .addComponent( jLabel11 )
                            .addComponent( jLabel12 ) )
                        .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED ) ) ) 
                .addGroup( jPanel2Layout.createParallelGroup( GroupLayout.Alignment.TRAILING, false )
                    .addComponent( jTextField6, GroupLayout.Alignment.LEADING)
                    .addComponent( jTextField5, GroupLayout.Alignment.LEADING)
                    .addComponent( jTextField4, GroupLayout.Alignment.LEADING)
                    .addComponent( jTextField3, GroupLayout.Alignment.LEADING)
                    .addComponent( jTextField2, GroupLayout.Alignment.LEADING)
                    .addComponent( jTextField1, GroupLayout.Alignment.LEADING)
                    .addComponent( jTextField8, GroupLayout.Alignment.LEADING)
                    .addComponent( jTextField9, GroupLayout.Alignment.LEADING)
                    .addComponent( jTextField7)
                    .addComponent(jTextField10, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabelP)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField11, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE))
                //.addContainerGap(73, Short.MAX_VALUE)
        );
        
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup( GroupLayout.Alignment.LEADING )
            .addGroup( jPanel2Layout.createSequentialGroup()
                .addContainerGap( 22, Short.MAX_VALUE )
                .addGroup( jPanel2Layout.createParallelGroup( GroupLayout.Alignment.BASELINE )
                    .addComponent( jTextField9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE )
                    .addComponent( jLabel11 ) )
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED )
                .addGroup( jPanel2Layout.createParallelGroup( GroupLayout.Alignment.BASELINE )
                    .addComponent( jTextField10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE )
                    .addComponent( jLabel12 ) )
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED )
                .addGroup( jPanel2Layout.createParallelGroup( GroupLayout.Alignment.BASELINE )
                    .addComponent( jTextField8,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE )
                    .addComponent( jLabel10 ) )
                .addGap( 18, 18, 18 )
                .addGroup( jPanel2Layout.createParallelGroup( GroupLayout.Alignment.BASELINE )
                    .addComponent( jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE )
                    .addComponent( jLabel3, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE ) )
                .addGap( 18, 18, 18 )
                .addGroup( jPanel2Layout.createParallelGroup( GroupLayout.Alignment.BASELINE )
                    .addComponent( jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE )
                    .addComponent( jLabel4 ) )
                .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED )
                .addGroup( jPanel2Layout.createParallelGroup( GroupLayout.Alignment.BASELINE )
                    .addComponent( jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE )
                    .addComponent( jLabel5 ) )
                .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED )
                .addGroup( jPanel2Layout.createParallelGroup( GroupLayout.Alignment.BASELINE )
                    .addComponent( jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE )
                    .addComponent( jLabel6 ) )
                .addGap( 18, 18, 18 )
                .addGroup( jPanel2Layout.createParallelGroup( GroupLayout.Alignment.BASELINE )
                    .addComponent( jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE )
                    .addComponent( jLabel7, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE ) )
                .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED )
                .addGroup( jPanel2Layout.createParallelGroup( GroupLayout.Alignment.BASELINE )
                    .addComponent( jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE )
                    .addComponent(jLabel8))
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED )
                .addGroup( jPanel2Layout.createParallelGroup( GroupLayout.Alignment.BASELINE )
                    .addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE )
                    .addComponent( jLabel9 ) )
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelP))
                .addGap(18, 18, 18))
                
        );

        jButton2.setText( "afficher" );
        jButton2.addActionListener( new ActionListener() {
            public void actionPerformed( ActionEvent evt ) {
                try {
					jButton2ActionPerformed( evt );
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout( jPanel1 );
        jPanel1.setLayout( jPanel1Layout );
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING )
            .addGroup( jPanel1Layout.createSequentialGroup()
                .addGroup( jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING )
                    .addGroup( jPanel1Layout.createSequentialGroup()
                        .addGap( 21, 21, 21 )
                        .addComponent( jLabel2 )
                        .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED )
                        .addComponent( jTextFieldN, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE )
                        .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED )
                        .addComponent( jButton2 ) )
                    .addGroup( jPanel1Layout.createSequentialGroup()
                        .addGap( 600, 600, 600 )
                        .addComponent( jLabel1 ) )
                    .addGroup( jPanel1Layout.createSequentialGroup()
                        .addGap( 21, 21, 21 )
                        .addComponent( jScrollPane1, GroupLayout.PREFERRED_SIZE, 833, GroupLayout.PREFERRED_SIZE ) ) )
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE )
                .addGroup( jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING )
                    .addGroup( GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent( jButton1 )
                        .addGap( 42, 42, 42 )
                        .addComponent( supp )
                        .addGap( 33, 33, 33 )
                        .addComponent( jButton3 )
                        .addGap( 284, 284, 284 ) )
                    .addGroup( GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent( jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE )
                        .addGap( 235, 235, 235 ) )  ) )
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING )
            .addGroup( jPanel1Layout.createSequentialGroup()
                .addGap( 31, 31, 31 )
                .addComponent( jLabel1 )
                .addGroup( jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING )
                    .addGroup( jPanel1Layout.createSequentialGroup()
                        .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE )
                        .addGroup( jPanel1Layout.createParallelGroup( GroupLayout.Alignment.BASELINE )
                            .addComponent( jLabel2 )
                            .addComponent( jTextFieldN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE )
                            .addComponent(jButton2))
                        .addGap(28, 28, 28)
                        .addComponent( jScrollPane1, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE )
                        .addGap( 101, 101, 101 )
                        .addGroup( jPanel1Layout.createParallelGroup( GroupLayout.Alignment.BASELINE )
                            .addComponent( jButton1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE )
                            .addComponent( supp, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE )
                            .addComponent( jButton3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE ) )
                        //.addContainerGap( 32, Short.MAX_VALUE ) 
                    )
                    .addGroup( jPanel1Layout.createSequentialGroup()
                        .addGap( 8, 8, 8 )
                        .addComponent( jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE )
                        .addContainerGap( GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) ) ) )
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

    protected void affecterEnseignantSeance() throws Exception {
    	
		
		String type_coursProp = "4";
		String salleProp = "EM010";
		Properties props = new Properties();

		try (FileInputStream fis = new FileInputStream("ecole.properties")) {
			props.load(fis);
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

			
			String demande1 = "SELECT id FROM utilisateur WHERE nom = '" + jTextField1.getText() + "'";

			try (Statement statement1 = connection.createStatement();
					ResultSet resultSet1 = statement1.executeQuery(demande1)) {

				resultSet1.next();

				String demande2 = "SELECT id_cours FROM enseignant WHERE id_utilisateur = "
						+ resultSet1.getString("id");

				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(demande2)) {
					
					resultSet2.next();
					
					String demande3 = "SELECT semaine, date, heure_debut FROM seance WHERE id_cours = "
							+ resultSet2.getString("id_cours");

					try (Statement statement3 = connection.createStatement();
							ResultSet resultSet3 = statement3.executeQuery(demande3)) {

						while( resultSet3.next() ) {

							if (!resultSet3.getString("date").equals( jTextField2.getText() )
									|| !resultSet3.getString("heure_debut").equals( jTextField3.getText() )
									|| !resultSet3.getString("semaine").equals( jTextField10.getText() ) ) {
								
								String demande4 = "SELECT id FROM salle WHERE nom= '" + salleProp + "'";

								try (Statement statement4 = connection.createStatement();
										ResultSet resultSet4 = statement4.executeQuery(demande4)) {

									while (resultSet4.next()) {

										String demande5 = "SELECT id_seance FROM seance_salle WHERE id_seance = "
												+ resultSet4.getString("id");

										try (Statement statement5 = connection.createStatement();
												ResultSet resultSet5 = statement5.executeQuery( demande5 ) ) {

											while (resultSet5.next()) {

												String demande6 = "SELECT semaine, date, heure_debut FROM seance WHERE id = "
														+ resultSet5.getString("id_seance");

												try (Statement statement6 = connection.createStatement();
														ResultSet resultSet6 = statement6.executeQuery(demande6)) {

													while ( resultSet6.next() ) {

														if ( !resultSet6.getString( "date" ).equals( jTextField2.getText() )
																|| !resultSet6.getString( "heure_debut" )
																		.equals( jTextField3.getText() )
																|| !resultSet6.getString( "semaine" ).equals( jTextField10.getText() ) ) {

															String demande7 = "INSERT INTO seance ( id, semaine, date, heure_debut, heure_fin, etat, id_cours, id_type) "            
																	+ "VALUES( ?, ?, ?, ?, ?, ?, ?, ? )";
															try ( PreparedStatement statement7 = connection
																	.prepareStatement( demande7 ) ) {

																statement7.setString( 1, jTextField8.getText() );
																statement7.setString( 2, jTextField10.getText() );
																statement7.setString( 3, jTextField2.getText() );
																statement7.setString( 4, jTextField3.getText() );
																statement7.setString( 5, jTextField4.getText() );
																statement7.setString( 6, "1");
																statement7.setString( 7, resultSet2.getString( "id_cours" ) );
																statement7.setString( 8, type_coursProp );

																statement7.executeUpdate();
															}
															
															String demande8 = "INSERT INTO seance_groupe( id_seance, id_groupe)"
																	+ "VALUES( ?,?)";
															try( PreparedStatement statement8 = connection.prepareStatement( demande8 ) ){
																
																statement8.setString(1, jTextField8.getText() );
																statement8.setString( 2, "1" );
																
																statement8.executeUpdate();
															}
															
															String demande8_1 = "SELECT id FROM salle WHERE nom= '" + jTextField6.getText() + "'";
															
															try ( Statement statement8_1 = connection.createStatement();
																	ResultSet resultSet8_1 = statement8_1.executeQuery( demande8_1 ) ) {
																
																resultSet8_1.next();
																
																String demande9 = "INSERT INTO seance_salle( id_seance, id_salle )"
																		+ "VALUES( ?,?)";
																try( PreparedStatement statement9 = connection.prepareStatement( demande9 ) ){
																	
																	statement9.setString(1, jTextField8.getText() );
																	statement9.setString( 2, resultSet8_1.getString( "id" ) );
																	
																	statement9.executeUpdate();
																}
															}
															
															String demande10 = "INSERT INTO seance_enseignant( id_seance, id_enseignant)"
																	+ "VALUES( ?,?)";
															
															try( PreparedStatement statement10 = connection.prepareStatement( demande10 ) ){
																
																statement10.setString(1, jTextField8.getText() );
																statement10.setString( 2, resultSet1.getString("id") );
																
																statement10.executeUpdate();
															}
																
																
																
															

														}
													}
												}
											}
										}
									}
								}
						    }
						}

						
							

						
					}
				}
			}
		}
		
	}

	private void jTextFieldNActionPerformed( ActionEvent evt ) {
        
        
    }

    private void jTable1MouseClicked( MouseEvent evt ) {
    	
        int i =jTable1.getSelectedRow();
        TableModel model;
        model = jTable1.getModel();
        jTextField9.setText( model.getValueAt(i, 0).toString() );
        jTextField10.setText( model.getValueAt(i, 1).toString() );
        jTextField8.setText( model.getValueAt(i, 2).toString() );
        jTextField1.setText( model.getValueAt(i,3).toString() );
        jTextField2.setText( model.getValueAt(i,4).toString() );
        jTextField3.setText( model.getValueAt(i,5).toString() );
        jTextField4.setText( model.getValueAt(i,6).toString() );
        jTextField5.setText( model.getValueAt(i,7).toString() );
        jTextField6.setText( model.getValueAt(i,8).toString() );
        jTextField7.setText( model.getValueAt(i,9).toString() );
        jTextField11.setText(model.getValueAt(i,10).toString());
    }

    private void jButton2ActionPerformed( ActionEvent evt ) throws Exception {
    	
        Properties props = new Properties();
		

		try (FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName( props.getProperty( "jdbc.driver.class" ) );

		String url = props.getProperty( "jdbc.url" );
		String dbLogin = props.getProperty( "jdbc.login" );
		String dbPassword = props.getProperty( "jdbc.password" );

		String nom =jTextFieldN.getText();
		

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
            						// planningProfesseurECE fen = new planningProfesseurECE( resultSet2.getString( "email" ), resultSet2.getString( "password" ) );
            						// fen.setVisible( true );
            						// fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
                        		 }
        						 
                        	 }
                        	 
                        }
                       
                }
						
						
			}
        
		}
        
    }
    
    private void supprimerSeance( ActionEvent evt ) throws Exception {
    
		
		Properties props = new Properties();
		
		try (FileInputStream fis = new FileInputStream("ecole.properties")) {
			props.load(fis);
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {
			
            String sql2 = "DELETE FROM seance_enseignant WHERE id_seance = '" + jTextField8.getText() + "'";
			
			try( PreparedStatement statement2 = connection.prepareStatement( sql2 ) ){
				
				statement2.executeUpdate();
				
			}
			
            String sql3 = "DELETE FROM seance_groupe WHERE id_seance = '" + jTextField8.getText() + "'";
			
			try( PreparedStatement statement3 = connection.prepareStatement( sql3 ) ){
				
				statement3.executeUpdate();
				
			}
			
            String sql4 = "DELETE FROM seance_salle WHERE id_seance = '" + jTextField8.getText() + "'";
			
			try( PreparedStatement statement4 = connection.prepareStatement( sql4 ) ){
				
				statement4.executeUpdate();
				
			}
			
			String sql = "DELETE FROM seance WHERE id = '" + jTextField8.getText() + "'";
			
			try( PreparedStatement statement = connection.prepareStatement( sql ) ){
				
				statement.executeUpdate();
				
			}
		}
    }
    private void MAJSeance( ActionEvent evt ) throws Exception {
    
		
		Properties props = new Properties();
		
		try (FileInputStream fis = new FileInputStream("ecole.properties")) {
			props.load(fis);
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {
			
            String sql2 = "UPDATE seance SET semaine= '"+jTextField10.getText()+
            		"', date ='"+jTextField2.getText()+"', heure_debut ='"+jTextField3.getText()+
            		"', heure_fin= '"+jTextField4.getText()+"' WHERE `id`='"+jTextField8.getText()+"'";
			
			try( PreparedStatement statement2 = connection.prepareStatement( sql2 ) ){
				
				statement2.executeUpdate();
				
			}
			
			String sql3 = "SELECT id FROM salle WHERE nom = '" + jTextField6.getText() + "'";
			
			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( sql3 ) ) {
				
				resultSet.next();
				//resultSet.getString( "id" );
				
					
					String sql5 = "UPDATE seance_salle SET id_salle =' "+resultSet.getString("id")+"' WHERE id_seance= '" + jTextField8.getText() + "'";
					
					try( PreparedStatement statement5 = connection.prepareStatement( sql5 ) ){
						
						statement5.executeUpdate();
						
					}
			
			}
			
            String sql6 = "SELECT id FROM groupe WHERE nom = '" + jTextField7.getText() + "'";
			
			try (Statement statement6 = connection.createStatement();
					ResultSet resultSet6 = statement6.executeQuery( sql6 ) ) {
				
				resultSet6.next();
				//resultSet.getString( "id" );
				
					
					String sql7 = "UPDATE seance_groupe SET id_groupe =' "+resultSet6.getString("id")+"' WHERE id_seance= '" + jTextField8.getText() + "'";
					
					try( PreparedStatement statement7 = connection.prepareStatement( sql7 ) ){
						
						statement7.executeUpdate();
						
					}
			
			}
			
		}
    }

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new Admin().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    


  
}
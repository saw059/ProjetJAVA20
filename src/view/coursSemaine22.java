package planningEtudiant;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JPanel;

public class coursSemaine22{
	
	public JPanel grilleEdT() throws Exception {
		
		JPanel contentPane2 = new JPanel();
		
		contentPane2.setLayout(new GridBagLayout() );
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.weightx = gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    JButton but0 = new JButton( testCours_25_08_30() );
	    contentPane2.add( but0, gbc );
	    
	    gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 1;
	    gbc.gridy = 0;    
	    JButton but1 = new JButton();
	    contentPane2.add( but1,gbc );
	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 2;
	    gbc.gridy = 0;
	    JButton but2 = new JButton();
	    contentPane2.add( but2,gbc );

	    gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 3;
	    gbc.gridy = 0;
	    JButton but3 = new JButton( /*testCours_21_8_30()*/ );
	    contentPane2.add( but3,gbc );

	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 4;
	    gbc.gridy = 0;
	    JButton but4 = new JButton( );
	    contentPane2.add( but4,gbc );

        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 5;
	    gbc.gridy = 0;
	    JButton but5 = new JButton();
	    contentPane2.add( but5,gbc );

	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx =0;
	    gbc.gridy = 1;
	    JButton but6 = new JButton();
	    contentPane2.add( but6,gbc );

	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 1;
	    gbc.gridy = 1;
	    JButton but7 = new JButton();
	    contentPane2.add( but7,gbc );

	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 2;
	    gbc.gridy = 1;
	    JButton but8 = new JButton();
	    contentPane2.add( but8,gbc );

	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 3;
	    gbc.gridy = 1;
	    JButton but9 = new JButton();
	    contentPane2.add( but9,gbc );

	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 4;
	    gbc.gridy = 1;
	    JButton but10 = new JButton();
	    contentPane2.add( but10,gbc );

        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 5;
	    gbc.gridy = 1;
	    JButton but11 = new JButton(/* testCours_23_10_15()*/ );
	    contentPane2.add( but11,gbc );

        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 0;
	    gbc.gridy = 2;
	    JButton but12 = new JButton();
	    contentPane2.add( but12,gbc );

	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 1;
	    gbc.gridy = 2;
	    JButton but13 = new JButton();
	    contentPane2.add( but13,gbc );

	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 2;
	    gbc.gridy = 2;
	    JButton but14 = new JButton(/* testCours_20_12_00()*/ );
	    contentPane2.add( but14,gbc );

	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 3;
	    gbc.gridy = 2;
	    JButton but15 = new JButton();
	    contentPane2.add( but15,gbc );

	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 4;
	    JButton but16 = new JButton();
	    contentPane2.add( but16,gbc );

	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 5;
	    gbc.gridy = 2;
	    JButton but17 = new JButton();
	    contentPane2.add( but17,gbc );

        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 0;
	    gbc.gridy = 3;
	    JButton but18 = new JButton();
	    contentPane2.add( but18,gbc );

	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 1;
	    gbc.gridy = 3;
	    JButton but19 = new JButton( );
	    contentPane2.add( but19,gbc );

	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 2;
	    gbc.gridy = 3;	    
	    JButton but20 = new JButton();
	    contentPane2.add( but20,gbc );


	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 3;
	    gbc.gridy = 3;
	    JButton but21 = new JButton();
	    contentPane2.add( but21,gbc );

	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 4;
	    gbc.gridy = 3;
	    JButton but22 = new JButton( /*testCours_22_13_45()*/ );
	    contentPane2.add( but22,gbc );

	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 5;
	    gbc.gridy = 3;
	    JButton but23 = new JButton();
	    contentPane2.add( but23,gbc );

	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 0;
	    gbc.gridy = 4;
	    JButton but24 = new JButton();
	    contentPane2.add( but24,gbc );

	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 1;
	    gbc.gridy = 4;
	    JButton but25 = new JButton(/* testCours_19_15_30() */);
	    contentPane2.add( but25,gbc );

	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 2;
	    gbc.gridy = 4;
	    JButton but26 = new JButton();
	    contentPane2.add( but26,gbc );

	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 3;
	    gbc.gridy = 4;
	    JButton but27 = new JButton();
	    contentPane2.add( but27, gbc );

        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 4;
	    gbc.gridy = 4;
	    JButton but28 = new JButton();
	    contentPane2.add( but28,gbc );

	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 5;
	    gbc.gridy = 4;
	    JButton but29 = new JButton();
	    contentPane2.add( but29,gbc );

	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 0;
	    gbc.gridy = 5;
	    JButton but30 = new JButton();
	    contentPane2.add( but30,gbc );

	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 1;
	    gbc.gridy = 5;
	    JButton but31 = new JButton();
	    contentPane2.add( but31,gbc );

	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 2;
	    gbc.gridy = 5;
	    JButton but32 = new JButton();
	    contentPane2.add( but32,gbc );

	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 3;
	    gbc.gridy = 5;
	    JButton but33 = new JButton();
	    contentPane2.add( but33,gbc );

	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 4;
	    gbc.gridy = 5;
	    JButton but34 = new JButton();
	    contentPane2.add( but34,gbc );

	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 5;
	    gbc.gridy = 5;
	    JButton but35 = new JButton();
	    contentPane2.add( but35,gbc );

	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 0;
	    gbc.gridy = 6;
	    JButton but36 = new JButton();
	    contentPane2.add( but36,gbc );
	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 1;
	    gbc.gridy = 6;
	    JButton but37 = new JButton();
	    contentPane2.add( but37,gbc );

        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 2;
	    gbc.gridy = 6;
	    JButton but38 = new JButton();
	    contentPane2.add( but38,gbc );
	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 3;
	    gbc.gridy = 6;
	    JButton but39 = new JButton();
	    contentPane2.add( but39,gbc );
	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 4;
	    gbc.gridy = 6;
	    JButton but40 = new JButton();
	    contentPane2.add( but40,gbc );
	    
        gbc.fill = GridBagConstraints.BOTH;
	    gbc.gridx = 5;
	    gbc.gridy = 6;
	    JButton but41 = new JButton();
	    contentPane2.add( but41,gbc );
		
		return contentPane2;
	}
	
private String testCours_25_08_30() throws Exception {
    	
        Properties props = new Properties();
		
		try (FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}
		
		Class.forName( props.getProperty( "jdbc.driver.class" ) );

		String url = props.getProperty( "jdbc.url" );
		String dbLogin = props.getProperty( "jdbc.login" );
		String dbPassword = props.getProperty( "jdbc.password" );
		
		try (Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
			String strSql = "SELECT id_groupe FROM etudiant WHERE id_utilisateur = 2";
			
			
			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				resultSet.next();
				String str = resultSet.getString( "id_groupe" );
				
				String strSql2 = "SELECT id_seance FROM seance_groupe WHERE id_groupe= " + str;               //ici on prends tous id_seance qui  
                                                                                                              //correspondent aux id de l'etudiant
				
				try( Statement statement2 = connection.createStatement(); 
						ResultSet resultSet2 = statement2.executeQuery ( strSql2 ) ){
					
					while( resultSet2.next() ) {
						
						String strSql3 = "SELECT * FROM seance WHERE id = " + resultSet2.getString( "id_seance" ) + " AND semaine = 22";
						
						try( Statement statement3 = connection.createStatement();
								ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ){
							
							while (resultSet3.next() ) {
								
								if (resultSet3.getString( "date" ).equals( "2020-05-25 08:30:00.0" ) ) {
									
									String strSql4 = "SELECT nom FROM cours WHERE id =" + resultSet3.getString( "id_cours" );
									
									try ( Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery( strSql4) ){
										
										resultSet4.next();
										
										return resultSet4.getString( "nom" );
									}
									
								}
								
							}
						}
						
					}
				}
				
			}
		}
   	
   	return "PAS COURS";
   }
    
 /*   
   private String testCours_20_12_00() throws Exception {
    	
	   Properties props = new Properties();
		
		try (FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}
		
		Class.forName( props.getProperty( "jdbc.driver.class" ) );

		String url = props.getProperty( "jdbc.url" );
		String dbLogin = props.getProperty( "jdbc.login" );
		String dbPassword = props.getProperty( "jdbc.password" );
		
		try (Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
			String strSql = "SELECT id_groupe FROM etudiant WHERE id_utilisateur = 2";
			
			
			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				resultSet.next();
				String str = resultSet.getString( "id_groupe" );
				
				String strSql2 = "SELECT id_seance FROM seance_groupe WHERE id_groupe= " + str;               //ici on prends tous id_seance qui correspondent 
                                                                                                             //aux id de l'etudiant
				
				try( Statement statement2 = connection.createStatement(); 
						ResultSet resultSet2 = statement2.executeQuery ( strSql2 ) ){
					
					while( resultSet2.next() ) {
						
						String strSql3 = "SELECT * FROM seance WHERE id = " + resultSet2.getString( "id_seance" ) + " AND semaine = 21";
						
						try( Statement statement3 = connection.createStatement();
								ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ){
							
							while (resultSet3.next() ) {
								
								if (resultSet3.getString( "date" ).equals( "2020-05-20 12:00:00.0" ) ) {
									
									String strSql4 = "SELECT nom FROM cours WHERE id =" + resultSet3.getString( "id_cours" );
									
									try ( Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery( strSql4) ){
										
										resultSet4.next();
										
										return resultSet4.getString( "nom" );
									}
									
								}
								
							}
						}
						
					}
				}
				
			}
		}
  	
  	return "PAS COURS";
  }
   
   private String testCours_22_13_45() throws Exception {
   	
	   Properties props = new Properties();
		
		try (FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}
		
		Class.forName( props.getProperty( "jdbc.driver.class" ) );

		String url = props.getProperty( "jdbc.url" );
		String dbLogin = props.getProperty( "jdbc.login" );
		String dbPassword = props.getProperty( "jdbc.password" );
		
		try (Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
			String strSql = "SELECT id_groupe FROM etudiant WHERE id_utilisateur = 2";
			
			
			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				resultSet.next();
				String str = resultSet.getString( "id_groupe" );
				
				String strSql2 = "SELECT id_seance FROM seance_groupe WHERE id_groupe= " + str;               //ici on prends tous id_seance qui correspondent 
                                                                                                             //aux id de l'etudiant
				
				try( Statement statement2 = connection.createStatement(); 
						ResultSet resultSet2 = statement2.executeQuery ( strSql2 ) ){
					
					while( resultSet2.next() ) {
						
						String strSql3 = "SELECT * FROM seance WHERE id = " + resultSet2.getString( "id_seance" ) + " AND semaine = 21";
						
						try( Statement statement3 = connection.createStatement();
								ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ){
							
							while (resultSet3.next() ) {
								
								if (resultSet3.getString( "date" ).equals( "2020-05-22 13:45:00.0" ) ) {
									
									String strSql4 = "SELECT nom FROM cours WHERE id =" + resultSet3.getString( "id_cours" );
									
									try ( Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery( strSql4) ){
										
										resultSet4.next();
										
										return resultSet4.getString( "nom" );
									}
									
								}
								
							}
						}
						
					}
				}
				
			}
		}
  	
  	return "PAS COURS";
  }
   
   private String testCours_19_15_30() throws Exception {
   	
	   Properties props = new Properties();
		
		try (FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}
		
		Class.forName( props.getProperty( "jdbc.driver.class" ) );

		String url = props.getProperty( "jdbc.url" );
		String dbLogin = props.getProperty( "jdbc.login" );
		String dbPassword = props.getProperty( "jdbc.password" );
		
		try (Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
			String strSql = "SELECT id_groupe FROM etudiant WHERE id_utilisateur = 2";
			
			
			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				resultSet.next();
				String str = resultSet.getString( "id_groupe" );
				
				String strSql2 = "SELECT id_seance FROM seance_groupe WHERE id_groupe= " + str;               //ici on prends tous id_seance qui correspondent 
                                                                                                             //aux id de l'etudiant
				
				try( Statement statement2 = connection.createStatement(); 
						ResultSet resultSet2 = statement2.executeQuery ( strSql2 ) ){
					
					while( resultSet2.next() ) {
						
						String strSql3 = "SELECT * FROM seance WHERE id = " + resultSet2.getString( "id_seance" ) + " AND semaine = 21";
						
						try( Statement statement3 = connection.createStatement();
								ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ){
							
							while (resultSet3.next() ) {
								
								if (resultSet3.getString( "date" ).equals( "2020-05-19 15:30:00.0" ) ) {
									
									String strSql4 = "SELECT nom FROM cours WHERE id =" + resultSet3.getString( "id_cours" );
									
									try ( Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery( strSql4) ){
										
										resultSet4.next();
										
										return resultSet4.getString( "nom" );
									}
									
								}
								
							}
						}
						
					}
				}
				
			}
		}
  	
  	return "PAS COURS";
  }
   
   private String testCours_21_8_30() throws Exception {
   	
	   Properties props = new Properties();
		
		try (FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}
		
		Class.forName( props.getProperty( "jdbc.driver.class" ) );

		String url = props.getProperty( "jdbc.url" );
		String dbLogin = props.getProperty( "jdbc.login" );
		String dbPassword = props.getProperty( "jdbc.password" );
		
		try (Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
			String strSql = "SELECT id_groupe FROM etudiant WHERE id_utilisateur = 2";
			
			
			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				resultSet.next();
				String str = resultSet.getString( "id_groupe" );
				
				String strSql2 = "SELECT id_seance FROM seance_groupe WHERE id_groupe= " + str;               //ici on prends tous id_seance qui correspondent 
                                                                                                             //aux id de l'etudiant
				
				try( Statement statement2 = connection.createStatement(); 
						ResultSet resultSet2 = statement2.executeQuery ( strSql2 ) ){
					
					while( resultSet2.next() ) {
						
						String strSql3 = "SELECT * FROM seance WHERE id = " + resultSet2.getString( "id_seance" ) + " AND semaine = 21";
						
						try( Statement statement3 = connection.createStatement();
								ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ){
							
							while (resultSet3.next() ) {
								
								if (resultSet3.getString( "date" ).equals( "2020-05-21 08:30:00.0" ) ) {
									
									String strSql4 = "SELECT nom FROM cours WHERE id =" + resultSet3.getString( "id_cours" );
									
									try ( Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery( strSql4) ){
										
										resultSet4.next();
										
										return resultSet4.getString( "nom" );
									}
									
								}
								
							}
						}
						
					}
				}
				
			}
		}
  	
  	return "PAS COURS";
  }
   
   private String testCours_23_10_15() throws Exception {
   	
       Properties props = new Properties();
		
		try (FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}
		
		Class.forName( props.getProperty( "jdbc.driver.class" ) );

		String url = props.getProperty( "jdbc.url" );
		String dbLogin = props.getProperty( "jdbc.login" );
		String dbPassword = props.getProperty( "jdbc.password" );
		
		try (Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
			String strSql = "SELECT id_groupe FROM etudiant WHERE id_utilisateur = 2";
			
			
			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				resultSet.next();
				String str = resultSet.getString( "id_groupe" );
				
				String strSql2 = "SELECT id_seance FROM seance_groupe WHERE id_groupe= " + str;               //ici on prends tous id_seance qui correspondent 
                                                                                                              //aux id de l'etudiant
				
				try( Statement statement2 = connection.createStatement(); 
						ResultSet resultSet2 = statement2.executeQuery ( strSql2 ) ){
					
					while( resultSet2.next() ) {
						
						String strSql3 = "SELECT * FROM seance WHERE id = " + resultSet2.getString( "id_seance" ) + " AND semaine = 21";
						
						try( Statement statement3 = connection.createStatement();
								ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ){
							
							while (resultSet3.next() ) {
								
								if (resultSet3.getString( "date" ).equals( "2020-05-23 10:15:00.0" ) ) {
									
									String strSql4 = "SELECT nom FROM cours WHERE id =" + resultSet3.getString( "id_cours" );
									
									try ( Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery( strSql4) ){
										
										resultSet4.next();
										
										return resultSet4.getString( "nom" );
									}
									
								}
								
							}
						}
						
					}
				}
				
			}
		}
   	
   	return "PAS COURS";
   }
*/

}

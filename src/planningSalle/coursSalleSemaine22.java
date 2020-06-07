package planningSalle;
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

public class coursSalleSemaine22 {

	public JPanel grilleEdT( String nomSalle ) throws Exception {

		JPanel contentPane2 = new JPanel();

		contentPane2.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.weightx = gbc.weighty = 1;
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 0;
		JButton but0 = new JButton( testCours_18_08_30( nomSalle ) );
		contentPane2.add(but0, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = 0;
		JButton but1 = new JButton( testCours_19_08_30( nomSalle ) );
		contentPane2.add(but1, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 2;
		gbc.gridy = 0;
		JButton but2 = new JButton( testCours_20_08_30( nomSalle ) );
		contentPane2.add(but2, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 3;
		gbc.gridy = 0;
		JButton but3 = new JButton( testCours_21_08_30( nomSalle ) );
		contentPane2.add(but3, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 4;
		gbc.gridy = 0;
		JButton but4 = new JButton( testCours_22_08_30( nomSalle ) );
		contentPane2.add(but4, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 5;
		gbc.gridy = 0;
		JButton but5 = new JButton( testCours_23_08_30( nomSalle ) );
		contentPane2.add(but5, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 1;
		JButton but6 = new JButton( testCours_18_10_15( nomSalle ) );
		contentPane2.add(but6, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = 1;
		JButton but7 = new JButton( testCours_19_10_15( nomSalle ) );
		contentPane2.add(but7, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 2;
		gbc.gridy = 1;
		JButton but8 = new JButton( testCours_20_10_15( nomSalle ) );
		contentPane2.add(but8, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 3;
		gbc.gridy = 1;
		JButton but9 = new JButton( testCours_21_10_15( nomSalle ) );
		contentPane2.add(but9, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 4;
		gbc.gridy = 1;
		JButton but10 = new JButton( testCours_22_10_15( nomSalle ) );
		contentPane2.add(but10, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 5;
		gbc.gridy = 1;
		JButton but11 = new JButton( testCours_23_10_15( nomSalle ) );
		contentPane2.add(but11, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 2;
		JButton but12 = new JButton( testCours_18_12_00( nomSalle ) );
		contentPane2.add(but12, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = 2;
		JButton but13 = new JButton( testCours_19_12_00( nomSalle ) );
		contentPane2.add(but13, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 2;
		gbc.gridy = 2;
		JButton but14 = new JButton( testCours_20_12_00( nomSalle ) );
		contentPane2.add(but14, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 3;
		gbc.gridy = 2;
		JButton but15 = new JButton( testCours_21_12_00( nomSalle ) );
		contentPane2.add(but15, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 4;
		JButton but16 = new JButton( testCours_22_12_00( nomSalle ) );
		contentPane2.add(but16, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 5;
		gbc.gridy = 2;
		JButton but17 = new JButton( testCours_23_12_00( nomSalle ) );
		contentPane2.add(but17, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 3;
		JButton but18 = new JButton( testCours_18_13_45( nomSalle ) );
		contentPane2.add(but18, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = 3;
		JButton but19 = new JButton( testCours_19_13_45( nomSalle ) );
		contentPane2.add(but19, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 2;
		gbc.gridy = 3;
		JButton but20 = new JButton( testCours_20_13_45( nomSalle ) );
		contentPane2.add(but20, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 3;
		gbc.gridy = 3;
		JButton but21 = new JButton( testCours_21_13_45( nomSalle ) );
		contentPane2.add(but21, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 4;
		gbc.gridy = 3;
		JButton but22 = new JButton( testCours_22_13_45( nomSalle ) );
		contentPane2.add(but22, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 5;
		gbc.gridy = 3;
		JButton but23 = new JButton( testCours_23_13_45( nomSalle ) );
		contentPane2.add(but23, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 4;
		JButton but24 = new JButton( testCours_18_15_30( nomSalle ) );
		contentPane2.add(but24, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = 4;
		JButton but25 = new JButton( testCours_19_15_30( nomSalle ) );
		contentPane2.add(but25, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 2;
		gbc.gridy = 4;
		JButton but26 = new JButton( testCours_20_15_30( nomSalle ) );
		contentPane2.add(but26, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 3;
		gbc.gridy = 4;
		JButton but27 = new JButton( testCours_21_15_30( nomSalle ) );
		contentPane2.add(but27, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 4;
		gbc.gridy = 4;
		JButton but28 = new JButton( testCours_22_15_30( nomSalle ) );
		contentPane2.add(but28, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 5;
		gbc.gridy = 4;
		JButton but29 = new JButton( testCours_23_15_30( nomSalle ) );
		contentPane2.add(but29, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 5;
		JButton but30 = new JButton( testCours_18_17_15( nomSalle ) );
		contentPane2.add(but30, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = 5;
		JButton but31 = new JButton( testCours_19_17_15( nomSalle ) );
		contentPane2.add(but31, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 2;
		gbc.gridy = 5;
		JButton but32 = new JButton( testCours_20_17_15( nomSalle ) );
		contentPane2.add(but32, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 3;
		gbc.gridy = 5;
		JButton but33 = new JButton( testCours_21_17_15( nomSalle ) );
		contentPane2.add(but33, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 4;
		gbc.gridy = 5;
		JButton but34 = new JButton( testCours_22_17_15( nomSalle ) );
		contentPane2.add(but34, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 5;
		gbc.gridy = 5;
		JButton but35 = new JButton( testCours_23_17_15( nomSalle ) );
		contentPane2.add(but35, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 6;
		JButton but36 = new JButton( testCours_18_19_00( nomSalle ) );
		contentPane2.add(but36, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = 6;
		JButton but37 = new JButton( testCours_19_19_00( nomSalle ) );
		contentPane2.add(but37, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 2;
		gbc.gridy = 6;
		JButton but38 = new JButton( testCours_20_19_00( nomSalle ) ) ;
		contentPane2.add(but38, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 3;
		gbc.gridy = 6;
		JButton but39 = new JButton( testCours_21_19_00( nomSalle ) );
		contentPane2.add(but39, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 4;
		gbc.gridy = 6;
		JButton but40 = new JButton( testCours_22_19_00( nomSalle ) );
		contentPane2.add(but40, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 5;
		gbc.gridy = 6;
		JButton but41 = new JButton( testCours_23_19_00( nomSalle ) );
		contentPane2.add(but41, gbc);

		return contentPane2;
	}

	private String testCours_18_08_30( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-18" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "08:30:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_19_08_30( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-19" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "08:30:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_20_08_30( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-20" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "08:30:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_21_08_30( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-21" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "08:30:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_22_08_30( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-22" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "08:30:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_23_08_30( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-23" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "08:30:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_18_10_15( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-18" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "10:15:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_19_10_15( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-19" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "10:15:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_20_10_15( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-20" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "10:15:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_21_10_15( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-21" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "10:15:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_22_10_15( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-22" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "10:15:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_23_10_15( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-23" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "10:15:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_18_12_00( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-18" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "12:00:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_19_12_00( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-19" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "12:00:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_20_12_00( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-20" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "12:00:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_21_12_00( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-21" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "12:00:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_22_12_00( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-22" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "12:00:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_23_12_00( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-23" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "12:00:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_18_13_45( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-18" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "13:45:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_19_13_45( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-19" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "13:45:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_20_13_45( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-20" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "13:45:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_21_13_45( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-21" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "13:45:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_22_13_45( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-22" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "13:45:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_23_13_45( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-23" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "13:45:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	
	
	private String testCours_18_15_30( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-18" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "15:30:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_19_15_30( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-19" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "15:30:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_20_15_30( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-20" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "15:30:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_21_15_30( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-21" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "15:30:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_22_15_30( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-22" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "15:30:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_23_15_30( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-23" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "15:30:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_18_17_15( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-18" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "17:15:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_19_17_15( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-19" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "17:15:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_20_17_15( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-20" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "17:15:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_21_17_15( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-21" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "17:15:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_22_17_15( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-22" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "17:15:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_23_17_15( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-23" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "17:15:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_18_19_00( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-18" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "19:00:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_19_19_00( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-19" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "19:00:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_20_19_00( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-20" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "19:00:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_21_19_00( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-21" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "19:00:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_22_19_00( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-22" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "19:00:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}
	
	private String testCours_23_19_00( String nomSalle ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {

			String strSql = "SELECT id FROM salle WHERE nom = '" + nomSalle + "'";
			System.out.println( strSql );

			try ( Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				while( resultSet.next() ) {
					
					String str = resultSet.getString( "id" );
					System.out.println( str );
					String strSql2 = "SELECT id_seance FROM seance_salle WHERE id_salle = " + str;
					
					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {
						
						while( resultSet2.next() ) {
							String str2 = resultSet2.getString( "id_seance" );
							String strSql3 = "SELECT date, heure_debut, id_cours FROM seance WHERE id = " + str2;
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 );) {
						
								while (resultSet3.next() ) {
									
									if( resultSet3.getString( "date" ) .equals( "2020-05-23" ) ) {
										if( resultSet3.getString( "heure_debut" ) .equals( "19:00:00" ) ) {
											String str3 = resultSet3.getString( "id_cours" );
											String strSql4 = "SELECT nom FROM cours WHERE id = " + str3;
											String strSql4_1 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = " + resultSet3.getString( "id_cours" );
											
											try ( Statement statement4 = connection.createStatement();
													Statement statement4_1 = connection.createStatement();
													ResultSet resultSet4 = statement4.executeQuery( strSql4 );
													ResultSet resultSet4_1 = statement4_1.executeQuery( strSql4_1 ) ) {
												
												resultSet4.next();
												resultSet4_1.next();
												
												String strSql5_1 = "SELECT nom, prenom FROM utilisateur WHERE id = " + resultSet4_1.getString( "id_utilisateur" );
												try ( Statement statement5_1 = connection.createStatement();
														ResultSet resultSet5_1 = statement5_1.executeQuery( strSql5_1 ) ){
													resultSet5_1.next();
													
													return "<html>" + resultSet4.getString( "nom" ) + "<br>" + resultSet5_1.getString( "nom" ) + " " +
															resultSet5_1.getString( "prenom" ) + "<html>";
													
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

		return "------------------------";
	}

}



